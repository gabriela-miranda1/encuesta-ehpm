package sv.gob.controller.jefeDeCampo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.gob.models.PilaDeEncuestas;
import sv.gob.service.jefeDeCampo.IJefeCampoService;
import sv.gob.models.EncuestasPendientes;


@Controller
@RequestMapping("/jefeDeCampo")
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
		return "desechadas/PilaEncuestas";
	}
	
	@GetMapping("/home")
	private String EncuestasPendientes(Model model)
	{
		List<EncuestasPendientes> lista2 = pendiente.mostrar2();
		model.addAttribute("encuestas2",lista2);
		
		return "jefeDeCampo/EncuestasPendientes";
	}

}
