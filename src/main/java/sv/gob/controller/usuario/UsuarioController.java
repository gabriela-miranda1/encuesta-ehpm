package sv.gob.controller.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sv.gob.models.Usuarios;
import sv.gob.service.administrador.IUsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuario;
	
	@GetMapping("/crear")
	private String CrearUsuario(Model model)
	{
		return "usuario/Crear";
	}
	
	@GetMapping("/editar")
	private String EditarUsuario(Model model)
	{
		return "usuario/Editar";
	}
	
	@GetMapping("/administrar")
	private String MostrarUsuario(Model model)
	{
		List<Usuarios> listaMostrarUsuario = usuario.mostrar();
		model.addAttribute("mostrarUsuario",listaMostrarUsuario);
		return "usuario/Administrar";
	}

}
