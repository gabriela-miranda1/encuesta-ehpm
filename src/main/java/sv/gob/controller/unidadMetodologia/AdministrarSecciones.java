package sv.gob.controller.unidadMetodologia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/seccion")
public class AdministrarSecciones {
	@GetMapping("/create")
	private String crearSeccion()
	{
		return ("unidadMetodologia/CrearSeccion");
	}
}
