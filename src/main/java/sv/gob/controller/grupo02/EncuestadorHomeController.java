package sv.gob.controller.grupo02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.grupo02.Encuesta;
import sv.gob.service.grupo02.IEncuestadorHome;

@Controller
public class EncuestadorHomeController {
	
	@Autowired
	private IEncuestadorHome EncuestadorHomeService;
	
	@GetMapping("/prueba")
	private String EncuestadorHome(Model model)
	{
	List<Encuesta> listaD=EncuestadorHomeService.mostrarDisponibles();
	List<Encuesta> listaP=EncuestadorHomeService.mostrarPendientes();
	
	model.addAttribute("disponible",listaD);
	model.addAttribute("pendiente",listaP);
	
	return "grupo02/EncuestadorHome";
	}
}
