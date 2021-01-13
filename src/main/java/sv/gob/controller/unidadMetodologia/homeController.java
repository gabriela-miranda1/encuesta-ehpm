package sv.gob.controller.unidadMetodologia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.service.IEjemploService;

@Controller
public class homeController {
	
	@Autowired
	private IEjemploService serviceEjemplo;
	
	@GetMapping("/ejemplo")
	private String holaMundo(Model model )
	{
		List<String> lista= serviceEjemplo.mostrar();
		model.addAttribute("ejemplo",lista);
		return ("home");
	}

}
