package sv.gob.controller.administrador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/encuesta")
public class AdministrarEncuesta {
	
	@GetMapping("/create")
	private String crearEncuesta()
	{
		return "administrador/CrearEncuesta";
	}

}
