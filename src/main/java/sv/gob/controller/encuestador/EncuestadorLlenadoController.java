package sv.gob.controller.encuestador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.Asignacion02;
import sv.gob.service.encuestador.IEncuestadorLlenado;

@Controller
public class EncuestadorLlenadoController {
	
	@Autowired
	private IEncuestadorLlenado encuesta;
	
	@GetMapping("/llenado")
	private String llenado(Model model)
	{
		List<Asignacion02> lista = encuesta.mostrar();
		model.addAttribute("encuestas",lista);
		return "grupo01/EncuestadorLlenado";
	}

}
