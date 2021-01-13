package sv.gob.controller.grupo;

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

import sv.gob.models.grupos.Grupos;
import sv.gob.models.miembros.Miembros;
import sv.gob.service.administrador.IGrupoService;
import sv.gob.service.grupos.GruposService;
import sv.gob.service.grupos.IGruposService;

@Controller
@RequestMapping("/grupo")
public class GrupoController {
	
	
	@Autowired
	private IGruposService grupo2;
	
	@GetMapping("/crear")
	private String CrearGrupo(Grupos grupos)
	{
		return "grupo/Crear";
	}
	
	@GetMapping("/editar")
	private String EditarGrupo(Model model)
	{
		return "grupo/Editar";
	}
	
	@GetMapping("/administrar")
	private String MostrarGrupo(Model model)
	{
		List<Grupos> lista = grupo2.buscarTodas();

		model.addAttribute("mostrarGrupo",lista);

		return "grupo/Administrar";
	}
	@GetMapping("/editar/{id}")
	private String Editar(@PathVariable("id") String idGrupos, Model model, RedirectAttributes attributes)
	{
		Grupos grupo= grupo2.editar(idGrupos);
		model.addAttribute("grupos",grupo);
		return "grupo/Editar";
	}
	
	@PostMapping("/save")
	private String guardar(@Valid Grupos grupos, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()){
			System.out.println("Existieron errores en el formulario"); 
			return "grupo/Crear";
		}	
				
		// Guadamos el objeto grupo en la bd
		grupo2.guardar(grupos);
		attributes.addFlashAttribute("success", "Registro guardado con éxito");
		return "redirect:/grupo/administrar";	
	}

	@GetMapping("/eliminar/{id}")
	private String eliminar(@PathVariable("id") String idGrupos, Model model, RedirectAttributes attributes)
	{
		//Eliminamos el grupo
		     	grupo2.eliminar(idGrupos);
		     	
				attributes.addFlashAttribute("success", "Registro eliminado exitosamente");
				return "redirect:/grupo/administrar";
		
	}
}
