package sv.gob.controller.unidadMetodologia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.extensiones.Departamentos;
import sv.gob.models.extensiones.Grupo;
import sv.gob.models.extensiones.IExtensiones;
import sv.gob.models.extensiones.Municipios;
import sv.gob.models.extensiones.ZonaOperacion;
import sv.gob.service.unidadMetodologia.IMuestraService;

@Controller
public class MuestraController {
	
	@Autowired
	private IExtensiones ie;
	
	@Autowired
	private IMuestraService MuestraService;
	
	@GetMapping("/crearmuestra")
	private String CrearMuestra(Model model) {
		List<Departamentos> lista = ie.mostrarD();
		List<Municipios> lista2 = ie.mostrarM();
		List<ZonaOperacion> lista3 = ie.mostrarZ();
		List<Grupo> lista4 = ie.mostrarG();
		model.addAttribute("departamento",lista);
		model.addAttribute("municipio",lista2);
		model.addAttribute("zona",lista3);
		model.addAttribute("grupo",lista4);
		
		return "desechadas/AgregarMuestra";
	}
	
	@GetMapping("/editarmuestra")
	private String EditarMuestra(Model model) {
		
		List<Municipios> lista2 = ie.mostrarM();
		List<ZonaOperacion> lista3 = ie.mostrarZ();
		
		model.addAttribute("municipio",lista2);
		model.addAttribute("zona",lista3);
		
		return "desechadas/AgregarMuestra";
	}
	
	@GetMapping("/mostrarrmuestra")
	private String MostrarMuestra(Model model) {
		List<Grupo> lista4 = ie.mostrarG();
		model.addAttribute("grupo",lista4);
		return "desechadas/MostrarMuestras";
	}
}