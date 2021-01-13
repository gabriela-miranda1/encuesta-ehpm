package sv.gob.controller.grupo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.gob.models.Grupos;
import sv.gob.service.administrador.IGrupoService;

@Controller
@RequestMapping("/grupo")
public class GrupoController {
	
	@Autowired
	private IGrupoService grupo;
	
	@GetMapping("/crear")
	private String CrearGrupo(Model model)
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
		List<Grupos> listaMostrarGrupo = grupo.mostrar2();

		model.addAttribute("mostrarGrupo",listaMostrarGrupo);

		return "grupo/Administrar";
	}

}
