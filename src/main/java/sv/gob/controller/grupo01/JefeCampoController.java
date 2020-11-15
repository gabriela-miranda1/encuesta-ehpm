package sv.gob.controller.grupo01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.PilaDeEncuestas;
import sv.gob.models.EncuestasPendientes;
import sv.gob.service.grupo01.IJefeCampoService;


@Controller
public class JefeCampoController {
	
	@Autowired
	private IJefeCampoService pila;
	
	@Autowired
	private IJefeCampoService pendiente;
	
	@GetMapping("/pila")
	private String PilaEncuestas(Model model)
	{
		List<PilaDeEncuestas> lista = pila.mostrar();
		model.addAttribute("encuestas",lista);
		return "grupo01/PilaEncuestas";
	}
	
	@GetMapping("/pendiente")
	private String EncuestasPendientes(Model model)
	{
		List<EncuestasPendientes> lista2 = pendiente.mostrar2();
		model.addAttribute("encuestas",lista2);
		return "grupo01/EncuestasPendientes";
	}

}