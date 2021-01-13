package sv.gob.controller.encuesta;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/encuesta")
public class EncuestaController {
	
	@GetMapping("/administrar")
	private String crearEncuesta()
	{
		return "encuesta/Administrar";
	}

}
