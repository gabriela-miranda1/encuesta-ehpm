package sv.gob.controller.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class LoginController {

    @GetMapping("/login")
	private String IniciarSesion(Model model) {      
        
		return "login/login.html";
	}
	@GetMapping("/logout")
	public String logout(HttpServletRequest request){
		SecurityContextLogoutHandler logoutHandler =
		new SecurityContextLogoutHandler();
		logoutHandler.logout(request, null, null);
		return "redirect:/login";
}

	@GetMapping("/")
	private String Inicio(Model model) {
        
        
		return "login/Home.html";
	}

    
    
}
