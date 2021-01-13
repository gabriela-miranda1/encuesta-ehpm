package sv.gob.controller.miembros;

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
import sv.gob.models.miembros.Miembros;
import sv.gob.service.miembros.IMiembrosService;

@Controller
@RequestMapping("/miembros")
public class MiembrosController {
	
	@Autowired
   	private IMiembrosService serviceMiembros;
	
	@GetMapping("/administrar")
	private String Administrar(Miembros miembro, Model model)
	{	
		List<Miembros> lista = serviceMiembros.buscarTodas();
		model.addAttribute("miembros", lista);		
		return "miembros/Administrar";
	}
	
	@GetMapping("/crear")
	private String CrearMiembros(Miembros miembros)
	{
		return "miembros/Crear";
	}
	
	
	@GetMapping("/editar/{id}")
	private String Editar(@PathVariable("id") String idMiembros, Model model, RedirectAttributes attributes)
	{
		Miembros miembro= serviceMiembros.editar(idMiembros);
		model.addAttribute("miembros",miembro);
		return "miembros/Editar";
	}
	

	@PostMapping("/save")
	private String guardar(@Valid Miembros miembros, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()){
			System.out.println("Existieron errores en el formulario"); 
			return "miembros/Crear";
		}	
				
		// Guadamos el objeto miembro en la bd
		serviceMiembros.guardar(miembros);
		attributes.addFlashAttribute("success", "Registro guardado con éxito");
				
		return "redirect:/miembros/administrar";	
	}
	
	

	@GetMapping("/eliminar/{id}")
	private String eliminar(@PathVariable("id") String idMiembros, RedirectAttributes attributes)
	{
		//Eliminamos el Miembro
		serviceMiembros.eliminar(idMiembros);
		
		attributes.addFlashAttribute("success", "Registro eliminado exitosamente");
		return "redirect:/miembros/administrar";
	}
	

}
