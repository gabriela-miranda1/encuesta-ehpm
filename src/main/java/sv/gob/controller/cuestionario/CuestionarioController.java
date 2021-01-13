package sv.gob.controller.cuestionario;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import sv.gob.models.Cuestionario.Seccion;
import sv.gob.service.Cuestionario.ISeccionService;


@Controller
@RequestMapping("/cuestionario")
public class CuestionarioController {
	
	@Autowired
   	private ISeccionService serviceSeccion;

	@GetMapping("/disenyo")
	private String crearSeccion(Seccion seccion, Model model)
	{
		List<Seccion> lista = serviceSeccion.buscarTodas();
		model.addAttribute("secciones", lista);
		return "cuestionario/CrearSeccion";
	}

	@GetMapping("/preguntas")
	private String crearCuestionario()
	{
		return "cuestionario/PreguntasSeccion";
	}
	
	@PostMapping("/save")
	private String guardar(@Valid Seccion seccion, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()){
			List<Seccion> lista = serviceSeccion.buscarTodas();
			model.addAttribute("secciones", lista);
			System.out.println("Existieron errores en el formulario"); 
			return "cuestionario/CrearSeccion";
		}	
				
		// Guadamos el objeto categoria en la bd
		serviceSeccion.guardar(seccion);
		attributes.addFlashAttribute("success", "Registro guardado con éxito");
			
		//return "redirect:/categorias/index";
		return "redirect:/cuestionario/disenyo";	
	}
	
	@GetMapping("/editar/{id}")
	 private String editar(@PathVariable("id") String idSeccion, Model model, RedirectAttributes attributes)
	 {
		Seccion seccion= serviceSeccion.editar(idSeccion);
		model.addAttribute("seccion",seccion);
		List<Seccion> lista = serviceSeccion.buscarTodas();
		model.addAttribute("secciones", lista);		
		return "cuestionario/CrearSeccion";
	 }

	@GetMapping("/eliminar/{id}")
	private String eliminar(@PathVariable("id") String idSeccion, RedirectAttributes attributes)
	{
		//Eliminamos el seccion
		serviceSeccion.eliminar(idSeccion);
		
		attributes.addFlashAttribute("success", "Registro eliminado exitosamente");
		return "redirect:/cuestionario/disenyo";
	}
	
}
