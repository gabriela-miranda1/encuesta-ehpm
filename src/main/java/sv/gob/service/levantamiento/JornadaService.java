package sv.gob.service.levantamiento;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import sv.gob.models.extensiones.Departamentos;
import sv.gob.models.extensiones.Grupo;
import sv.gob.models.extensiones.Municipios;
import sv.gob.models.extensiones.ZonaOperacion;
import sv.gob.models.grupo02.Jornadas;

@Service
public class JornadaService implements IJornadaService{
	
	List<Jornadas> listaJornada = null;
	
	public JornadaService()
	{
		listaJornada = new LinkedList<>();
		
		//mj = mostrar jornadas
		Jornadas mj1 = new Jornadas("03/11/2020","20/11/2020","Grupo 01", 25);
		Jornadas mj2 = new Jornadas("03/11/2020","20/11/2020","Grupo 01", 25);
		Jornadas mj3 = new Jornadas("03/11/2020","20/11/2020","Grupo 02", 25);
		Jornadas mj4 = new Jornadas("03/11/2020","20/11/2020","Grupo 02", 25);
		Jornadas mj5 = new Jornadas("03/11/2020","20/11/2020","Grupo 02", 25);
		Jornadas mj6 = new Jornadas("03/11/2020","20/11/2020","Grupo 02", 25);
		Jornadas mj7 = new Jornadas("03/11/2020","20/11/2020","Grupo 02", 25);
		Jornadas mj8 = new Jornadas("03/11/2020","20/11/2020","Grupo 03", 25);
		Jornadas mj9 = new Jornadas("03/11/2020","20/11/2020","Grupo 03", 25);
		Jornadas mj10 = new Jornadas("03/11/2020","20/11/2020","Grupo 03", 25);
		Jornadas mj11 = new Jornadas("03/11/2020","20/11/2020","Grupo 03", 25);
		Jornadas mj12 = new Jornadas("03/11/2020","20/11/2020","Grupo 03", 25);
		
		listaJornada.add(mj1);
		listaJornada.add(mj2);
		listaJornada.add(mj3);
		listaJornada.add(mj4);
		listaJornada.add(mj5);
		listaJornada.add(mj6);
		listaJornada.add(mj7);
		listaJornada.add(mj8);
		listaJornada.add(mj9);
		listaJornada.add(mj10);
		listaJornada.add(mj11);
		listaJornada.add(mj12);
	}

	@Override
	public List<Jornadas> mostrar() {
		// TODO Auto-generated method stub
		return listaJornada;
	}
}
