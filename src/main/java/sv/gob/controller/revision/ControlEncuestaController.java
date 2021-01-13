package sv.gob.controller.revision;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.grupo02.Encuesta;
import sv.gob.models.Asignacion02;
import sv.gob.service.controlCalidad.IControlEncuestaService;
import sv.gob.service.encuestador.IEncuestadorLlenado;

@Controller
public class ControlEncuestaController {
	
	@Autowired
	private IControlEncuestaService ControlEncuestaService;
	@Autowired
	private IEncuestadorLlenado encuesta;
	
	@GetMapping("/revision")
	private String EncuestasRevision(Model model)
	{
		List<Encuesta> listaRevision=ControlEncuestaService.mostrarRevision();
		model.addAttribute("revision",listaRevision);
		return "revision/EncuestasRevision";
	}


	@GetMapping("/revisar")
	private String EncuestasRevisar(Model model)
	{
		List<Encuesta> listaPila=ControlEncuestaService.mostrarPila();
		model.addAttribute("revisar",listaPila);
		return "revision/EncuestasRevisar";
	}

	
	@GetMapping("/revisar/encuesta")
	private String RevisarEncuesta(Model model)
	{
		List<Asignacion02> lista = encuesta.mostrar();
		model.addAttribute("encuestas",lista);
		return "revision/EncuestasRevisarCuestionario";
	}

	@GetMapping("/revision/encuesta")
	private String RevisionEncuesta(Model model)
	{
		List<Asignacion02> lista = encuesta.mostrar();
		model.addAttribute("encuestas",lista);
		return "revision/EncuestasRevisionCuestionario";
	}

	@GetMapping("/revision/encuesta/preguntas")
	private String RevisionEncuestaPreguntas(Model model)
	{
		List<Asignacion02> lista = encuesta.mostrar();
		model.addAttribute("encuestas",lista);
		return "revision/EncuestasRevisionPreguntas";
	}

	@GetMapping("/revisar/encuesta/preguntas")
	private String RevisarEncuestaPreguntas(Model model)
	{
		List<Asignacion02> lista = encuesta.mostrar();
		model.addAttribute("encuestas",lista);
		return "revision/EncuestasRevisarPreguntas";
	}
}
