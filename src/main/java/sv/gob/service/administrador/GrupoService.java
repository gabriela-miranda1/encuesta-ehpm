package sv.gob.service.administrador;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import sv.gob.models.Grupos;

@Service
public class GrupoService implements IGrupoService{
	
	private List<Grupos> lista2 = null;

	public GrupoService() {
		lista2 = new LinkedList<>();
		
		Grupos grupo1 = new Grupos();
		grupo1.setCodigo("GP0001");
		grupo1.setNombre("Grupo 01");
		grupo1.setZonaDeOperacion("Oriental");
		
		Grupos grupo2 = new Grupos();
		grupo2.setCodigo("GP0002");
		grupo2.setNombre("Grupo 02");
		grupo2.setZonaDeOperacion("Oriental");
		
		Grupos grupo3 = new Grupos();
		grupo3.setCodigo("GP0003");
		grupo3.setNombre("Grupo 03");
		grupo3.setZonaDeOperacion("Occidental");
		
		Grupos grupo4 = new Grupos();
		grupo4.setCodigo("GP0004");
		grupo4.setNombre("Grupo 04");
		grupo4.setZonaDeOperacion("Oriente");
		
		Grupos grupo5 = new Grupos();
		grupo5.setCodigo("GP0005");
		grupo5.setNombre("Grupo 05");
		grupo5.setZonaDeOperacion("AMSS");
		
		Grupos grupo6 = new Grupos();
		grupo6.setCodigo("GP0006");
		grupo6.setNombre("Grupo 06");
		grupo6.setZonaDeOperacion("AMSS");
		
		Grupos grupo7 = new Grupos();
		grupo7.setCodigo("GP0007");
		grupo7.setNombre("Grupo 07");
		grupo7.setZonaDeOperacion("Central I");
		
		Grupos grupo8 = new Grupos();
		grupo8.setCodigo("GP0008");
		grupo8.setNombre("Grupo 08");
		grupo8.setZonaDeOperacion("Central II");
		
		lista2.add(grupo1);
		lista2.add(grupo2);
		lista2.add(grupo3);
		lista2.add(grupo4);
		lista2.add(grupo5);
		lista2.add(grupo6);
		lista2.add(grupo7);
		lista2.add(grupo8);
		
	}

	@Override
	public List<Grupos> mostrar2() {
		// TODO Auto-generated method stub
		return lista2;
	}
	
	
	

}
