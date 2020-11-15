package sv.gob.controller.asignacion01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.PersonaEjemplo;
import sv.gob.service.asignacion01.IMH17015Service;

@Controller
public class MH17015Controller {

	@Autowired
	private IMH17015Service mh17015Service;
	
	@GetMapping("/mh17015")
	private String MH17015(Model model)
	{
		List<PersonaEjemplo> lista = mh17015Service.mostrar();
		model.addAttribute("personas",lista);
		return "asignacion01/MH17015";
	}
}
