package sv.gob.service.administrador;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import sv.gob.models.Usuarios;

@Service
public class UsuarioService implements IUsuarioService{
	
	private List<Usuarios> lista1 = null;

	public UsuarioService() {
		
		lista1 = new LinkedList<>();
		
		Usuarios usuario1 = new Usuarios();
		usuario1.setCodigo("HH0001");
		usuario1.setApellidos("Henriquez");
		usuario1.setNombres("Alexander");
		usuario1.setCorreo("correo@correo.com");
		usuario1.setDui("22222222-3");
		usuario1.setRol("Jefe de campo");
		
		Usuarios usuario2 = new Usuarios();
		usuario2.setCodigo("QQ0001");
		usuario2.setApellidos("Quintanilla");
		usuario2.setNombres("Juan");
		usuario2.setCorreo("correo@correo.com");
		usuario2.setDui("22222222-3");
		usuario2.setRol("Encuestador");
		
		Usuarios usuario3 = new Usuarios();
		usuario3.setCodigo("MM0001");
		usuario3.setApellidos("Martinez");
		usuario3.setNombres("Tatiana");
		usuario3.setCorreo("correo@correo.com");
		usuario3.setDui("22222222-3");
		usuario3.setRol("Unidad de CC");
		
		Usuarios usuario4 = new Usuarios();
		usuario4.setCodigo("PP0001");
		usuario4.setApellidos("Perez");
		usuario4.setNombres("Alexander");
		usuario4.setCorreo("correo@correo.com");
		usuario4.setDui("22222222-3");
		usuario4.setRol("Coordinador");
		
		Usuarios usuario5 = new Usuarios();
		usuario5.setCodigo("SS0001");
		usuario5.setApellidos("Sanchez");
		usuario5.setNombres("Maria");
		usuario5.setCorreo("correo@correo.com");
		usuario5.setDui("22222222-3");
		usuario5.setRol("Jefe de campo");
		
		Usuarios usuario6 = new Usuarios();
		usuario6.setCodigo("CC0001");
		usuario6.setApellidos("Cortez");
		usuario6.setNombres("Tatiana");
		usuario6.setCorreo("correo@correo.com");
		usuario6.setDui("22222222-3");
		usuario6.setRol("Encuestador");
		
		Usuarios usuario7 = new Usuarios();
		usuario7.setCodigo("MM0002");
		usuario7.setApellidos("Martinez");
		usuario7.setNombres("Olga");
		usuario7.setCorreo("correo@correo.com");
		usuario7.setDui("22222222-3");
		usuario7.setRol("Encuestador");
		
		Usuarios usuario8 = new Usuarios();
		usuario8.setCodigo("MM0003");
		usuario8.setApellidos("Martinez");
		usuario8.setNombres("Maria");
		usuario8.setCorreo("correo@correo.com");
		usuario8.setDui("22222222-3");
		usuario8.setRol("Encuestador");
		
		lista1.add(usuario1);
		lista1.add(usuario2);
		lista1.add(usuario3);
		lista1.add(usuario4);
		lista1.add(usuario5);
		lista1.add(usuario6);
		lista1.add(usuario7);
		lista1.add(usuario8);
		
	}

	@Override
	public List<Usuarios> mostrar() {
		// TODO Auto-generated method stub
		return lista1;
	}
	
	

}
