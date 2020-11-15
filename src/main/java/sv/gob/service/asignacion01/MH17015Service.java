package sv.gob.service.asignacion01;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import sv.gob.models.PersonaEjemplo;

@Service
public class MH17015Service implements IMH17015Service{
	
	private List<PersonaEjemplo> lista= null;
	
	public MH17015Service()
	{
		lista = new LinkedList<>();
		
		PersonaEjemplo persona1 = new PersonaEjemplo();
		persona1.setNombre("Pablo");
		persona1.setApellido("Avelar");
		persona1.setCarrera("Ing. de Sistemas Informáticos");
		
		PersonaEjemplo persona2 = new PersonaEjemplo();
		persona2.setNombre("Rafael");
		persona2.setApellido("Viscarra");
		persona2.setCarrera("Ing. de Sistemas Informáticos");
		
		PersonaEjemplo persona3 = new PersonaEjemplo();
		persona3.setNombre("Lucy");
		persona3.setApellido("Montoya");
		persona3.setCarrera("Ing. de Sistemas Informáticos");
		
		PersonaEjemplo persona4 = new PersonaEjemplo();
		persona4.setNombre("Carlos");
		persona4.setApellido("Avelar");
		persona4.setCarrera("Ing. Industrial");
		
		
		lista.add(persona1);
		lista.add(persona2);
		lista.add(persona3);
		lista.add(persona4);
	}
	
	@Override
	public List<PersonaEjemplo> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}
	

}
