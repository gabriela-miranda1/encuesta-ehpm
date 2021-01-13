package sv.gob.controller.jornada;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.gob.models.extensiones.*;
import sv.gob.models.grupo02.Jornadas;
import sv.gob.service.levantamiento.IJornadaService;

@Controller
@RequestMapping("/jornada")
public class JornadaController {
	
	
	@Autowired
	private IJornadaService JornadaService;
	
	@Autowired
	private IExtensiones ie;
	
	@GetMapping("/crear")
	private String CrearJornada(Model model) {
		List<Departamentos> lista = ie.mostrarD();
		List<Municipios> lista2 = ie.mostrarM();
		List<ZonaOperacion> lista3 = ie.mostrarZ();
		List<Grupo> lista4 = ie.mostrarG();
		model.addAttribute("departamento",lista);
		model.addAttribute("municipio",lista2);
		model.addAttribute("zona",lista3);
		model.addAttribute("grupo",lista4);
		
		return "jornada/Crear";
	}
	
	@GetMapping("/editar")
	private String EditarJornada(Model model) {
		List<Departamentos> lista = ie.mostrarD();
		List<Municipios> lista2 = ie.mostrarM();
		List<ZonaOperacion> lista3 = ie.mostrarZ();
		List<Grupo> lista4 = ie.mostrarG();
		model.addAttribute("departamento",lista);
		model.addAttribute("municipio",lista2);
		model.addAttribute("zona",lista3);
		model.addAttribute("grupo",lista4);
		
		return "jornada/Editar";
	}
	
	
	@GetMapping("/administrar")
	private String MostrarJornada(Model model) {
		List<Jornadas> jornada=JornadaService.mostrar();
		model.addAttribute("exito",jornada);
		return "jornada/Administrar";
	}
}