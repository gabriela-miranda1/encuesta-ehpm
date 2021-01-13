package sv.gob.controller.encuestador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.gob.models.grupo02.Encuesta;
import sv.gob.models.Asignacion02;
import sv.gob.service.encuestador.IEncuestadorHome;
import sv.gob.service.encuestador.IEncuestadorLlenado;

@Controller
@RequestMapping("/encuestador")
public class EncuestadorController {
	
	@Autowired
	private IEncuestadorHome EncuestadorHomeService;

	@Autowired
	private IEncuestadorLlenado encuesta;
	
	@GetMapping("/home")
	private String EncuestadorHome(Model model)
	{
		List<Encuesta> listaD=EncuestadorHomeService.mostrarDisponibles();
		List<Encuesta> listaP=EncuestadorHomeService.mostrarPendientes();
		
		model.addAttribute("disponible", listaD);
		model.addAttribute("pendiente", listaP);
		
		return "encuestador/EncuestadorHome";
	}

	@GetMapping("/llenado")
	private String llenado(Model model)
	{
		List<Asignacion02> lista = encuesta.mostrar();
		model.addAttribute("encuestas",lista);
		return "encuestador/EncuestadorLlenado";
	}

	@GetMapping("/llenado/seccion")
	private String seccion(Model model)
	{
		List<Asignacion02> lista = encuesta.mostrar();
		model.addAttribute("encuestas",lista);
		return "encuestador/EncuestadorLlenadoSeccion";
	}
}
