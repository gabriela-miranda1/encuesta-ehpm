package sv.gob.controller.levantamiento;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jornada/cuestionarios")
public class JornadasCuestionarios {
	
	@GetMapping("/administrar")
	private String adminCuestionariosDeJornada()
	{
		return "jornadas_cuestionarios/Administrar";
	}

	@GetMapping("/agregar")
	private String agregarCuestionariosDeJornada()
	{
		return "jornadas_cuestionarios/Agregar";
	}

}
