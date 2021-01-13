package sv.gob.controller.encuestador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.grupo02.Encuesta;
import sv.gob.service.encuestador.IEncuestadorHome;

@Controller
public class EncuestadorHomeController {
	
	@Autowired
	private IEncuestadorHome EncuestadorHomeService;
	
	@GetMapping("/encuestador")
	private String EncuestadorHome(Model model)
	{
	List<Encuesta> listaD=EncuestadorHomeService.mostrarDisponibles();
	List<Encuesta> listaP=EncuestadorHomeService.mostrarPendientes();
	
	model.addAttribute("disponible",listaD);
	model.addAttribute("pendiente",listaP);
	
	return "grupo02/EncuestadorHome";
	}
}
