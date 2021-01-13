package sv.gob.service.encuestador;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import sv.gob.models.Asignacion02;

@Service
public class EncuestadorLlenadoService implements IEncuestadorLlenado{
	
	private List<Asignacion02> lista= null;
	
	public EncuestadorLlenadoService()
	{
		lista = new LinkedList<>();
		
		Asignacion02 encuesta1 = new Asignacion02();
		encuesta1.setNombre("Numero de miembros fuera del hogar");
		encuesta1.setEstado("Terminada");
		encuesta1.setCorrelativo(0);

		Asignacion02 encuesta2 = new Asignacion02();
		encuesta2.setNombre("Caracteristicas sociodemograficas");
		encuesta2.setEstado("Terminada");
		encuesta2.setCorrelativo(1);
	
		Asignacion02 encuesta3 = new Asignacion02();
		encuesta3.setNombre("Educacion");
		encuesta3.setEstado("En progreso");
		encuesta3.setCorrelativo(2);
				
		Asignacion02 encuesta4 = new Asignacion02();
		encuesta4.setNombre("Salud");
		encuesta4.setEstado("Pendiente");
		encuesta4.setCorrelativo(3);
		
		Asignacion02 encuesta5 = new Asignacion02();
		encuesta5.setNombre("Empleo e ingreso");
		encuesta5.setEstado("Pendiente");
		encuesta5.setCorrelativo(4);
		
		lista.add(encuesta1);
		lista.add(encuesta2);
		lista.add(encuesta3);
		lista.add(encuesta4);
		lista.add(encuesta5);
	}
	
	@Override
	public List<Asignacion02> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

}
