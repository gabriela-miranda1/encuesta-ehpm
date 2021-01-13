package sv.gob.controller.grupoMiembro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grupo/miembros")
public class GrupoMiembrosController {
    
    @GetMapping("/administrar")
    private String admininistrarGrupo()
    {
        return "grupoMiembro/Administrar";
    }
}
