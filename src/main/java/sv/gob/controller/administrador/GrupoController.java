package sv.gob.controller.administrador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.Grupos;
import sv.gob.service.administrador.IGrupoService;

@Controller
public class GrupoController {
	
	@Autowired
	private IGrupoService grupo;
	
	@GetMapping("/grupo/create")
	private String CrearGrupo(Model model)
	{
		return "grupo01/Grupo";
	}
	
	@GetMapping("/grupo/update")
	private String EditarGrupo(Model model)
	{
		return "grupo01/Grupo";
	}
	
	@GetMapping("/grupos")
	private String MostrarGrupo(Model model)
	{
		List<Grupos> listaMostrarGrupo = grupo.mostrar2();
		model.addAttribute("mostrarGrupo",listaMostrarGrupo);
		return "grupo01/AdministrarGrupo";
	}

}
