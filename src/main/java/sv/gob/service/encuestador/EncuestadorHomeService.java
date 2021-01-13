package sv.gob.service.encuestador;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import sv.gob.models.grupo02.Encuesta;

@Service
public class EncuestadorHomeService implements IEncuestadorHome{
	List<Encuesta> listaD = null;
	List<Encuesta> listaP = null;
	
	public EncuestadorHomeService()
	{	
        listaD = new LinkedList<>();
		Encuesta encuestaD1 = new Encuesta();
		Encuesta encuestaD2 = new Encuesta();
		Encuesta encuestaD3 = new Encuesta();
		
		encuestaD1.setId("040");
		encuestaD1.setUbicacion("San Salvador-San Salvador");
		encuestaD1.setDomicilio("Direccion");
		encuestaD1.setMes("Noviembre");
		
		encuestaD2.setId("041");
		encuestaD2.setUbicacion("San Salvador-San Salvador");
		encuestaD2.setDomicilio("Direccion");
		encuestaD2.setMes("Noviembre");
		
		encuestaD3.setId("042");
		encuestaD3.setUbicacion("San Salvador-San Salvador");
		encuestaD3.setDomicilio("Direccion");
		encuestaD3.setMes("Noviembre");
		
		listaD.add(encuestaD1);
		listaD.add(encuestaD2);
		listaD.add(encuestaD3);
		
		listaP = new LinkedList<>();
		Encuesta encuestaP1 = new Encuesta();
		Encuesta encuestaP2 = new Encuesta();
		Encuesta encuestaP3 = new Encuesta();
		
		encuestaP1.setId("002");
        encuestaP1.setDomicilio("Direccion");
        encuestaP1.setFecha("13/11/2020");
        encuestaP1.setHora("01:00:00");

        encuestaP2.setId("003");
        encuestaP2.setDomicilio("Direccion");
        encuestaP2.setFecha("12/12/2020");
        encuestaP2.setHora("09:35:25");

        encuestaP3.setId("007");
        encuestaP3.setDomicilio("Direccion");
        encuestaP3.setFecha("01/10/2020");
        encuestaP3.setHora("23:25:00");
		
		listaP.add(encuestaP1);
		listaP.add(encuestaP2);
		listaP.add(encuestaP3);
	}

	@Override
	public List<Encuesta> mostrarDisponibles() {
		// TODO Auto-generated method stub
		return listaD;
	}

	@Override
	public List<Encuesta> mostrarPendientes() {
		// TODO Auto-generated method stub
		return listaP;
	}
}
