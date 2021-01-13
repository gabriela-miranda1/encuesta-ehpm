package sv.gob.controller.jornada;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jornada/cuestionarios")
public class JornadasCuestionariosController {
	
	@GetMapping("/administrar")
	private String adminCuestionariosDeJornada()
	{
		return "jornadasCuestionarios_desechadas/Administrar";
	}

	@GetMapping("/agregar")
	private String agregarCuestionariosDeJornada()
	{
		return "jornadasCuestionarios_desechadas/Agregar";
	}

}
