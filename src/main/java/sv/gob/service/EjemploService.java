package sv.gob.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EjemploService implements IEjemploService{
	
	private List<String> lista= null;
	
	public EjemploService() {
		// TODO Auto-generated constructor stub
		lista= new LinkedList<>();
		lista.add("Pablo");
		lista.add("Rafael");
		lista.add("Juan");
		lista.add("Lucy");		
	}
	
	@Override
	public List<String> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

}
