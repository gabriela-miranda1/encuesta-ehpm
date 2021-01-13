package sv.gob.controller.administrador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sv.gob.models.Usuarios;
import sv.gob.service.administrador.IUsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuario;
	
	@GetMapping("/usuario/create")
	private String CrearUsuario(Model model)
	{
		return "grupo01/Usuario";
	}
	
	@GetMapping("/usuario/update")
	private String EditarUsuario(Model model)
	{
		return "grupo01/Usuario";
	}
	
	@GetMapping("/usuarios")
	private String MostrarUsuario(Model model)
	{
		List<Usuarios> listaMostrarUsuario = usuario.mostrar();
		model.addAttribute("mostrarUsuario",listaMostrarUsuario);
		return "grupo01/AdministrarUsuario";
	}

}
