package sv.gob.service.jefeDeCampo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import sv.gob.models.EncuestasPendientes;
import sv.gob.models.PilaDeEncuestas;

@Service
public class JefeCampoService implements IJefeCampoService{
	
	private List<PilaDeEncuestas> lista1= null;
	private List<EncuestasPendientes> lista2 = null;
	
	public JefeCampoService() 
	{
		lista1 = new LinkedList<>();
		lista2 = new LinkedList<>();
		
		PilaDeEncuestas encuesta1 = new PilaDeEncuestas();
		encuesta1.setIdentificacion("O40");
		encuesta1.setUbicacionGeografica("San Salvador - San Salvador");
		encuesta1.setDomicilio("Direccion");
		encuesta1.setMes("Noviembre");

		PilaDeEncuestas encuesta2 = new PilaDeEncuestas();
		encuesta2.setIdentificacion("O41");
		encuesta2.setUbicacionGeografica("San Salvador - San Salvador");
		encuesta2.setDomicilio("Direccion");
		encuesta2.setMes("Noviembre");
	
		PilaDeEncuestas encuesta3 = new PilaDeEncuestas();
		encuesta3.setIdentificacion("O42");
		encuesta3.setUbicacionGeografica("San Salvador - San Salvador");
		encuesta3.setDomicilio("Direccion");
		encuesta3.setMes("Noviembre");
		
		PilaDeEncuestas encuesta4 = new PilaDeEncuestas();
		encuesta4.setIdentificacion("O43");
		encuesta4.setUbicacionGeografica("San Salvador - San Salvador");
		encuesta4.setDomicilio("Direccion");
		encuesta4.setMes("Noviembre");
				
		PilaDeEncuestas encuesta5 = new PilaDeEncuestas();
		encuesta5.setIdentificacion("O44");
		encuesta5.setUbicacionGeografica("San Salvador - San Salvador");
		encuesta5.setDomicilio("Direccion");
		encuesta5.setMes("Noviembre");
		
		PilaDeEncuestas encuesta6 = new PilaDeEncuestas();
		encuesta6.setIdentificacion("O45");
		encuesta6.setUbicacionGeografica("San Salvador - San Salvador");
		encuesta6.setDomicilio("Direccion");
		encuesta6.setMes("Noviembre");
		
		PilaDeEncuestas encuesta7 = new PilaDeEncuestas();
		encuesta7.setIdentificacion("O46");
		encuesta7.setUbicacionGeografica("San Salvador - San Salvador");
		encuesta7.setDomicilio("Direccion");
		encuesta7.setMes("Noviembre");
		
		PilaDeEncuestas encuesta8 = new PilaDeEncuestas();
		encuesta8.setIdentificacion("O47");
		encuesta8.setUbicacionGeografica("San Salvador - San Salvador");
		encuesta8.setDomicilio("Direccion");
		encuesta8.setMes("Noviembre");
		
		EncuestasPendientes encuestaP1 = new EncuestasPendientes();
		encuestaP1.setIdentificacion("O02");
		encuestaP1.setDireccion("Direccion");
		encuestaP1.setEncuestador("Juan Perez");
		encuestaP1.setUltimaVisita("30/10/2020");
		
		EncuestasPendientes encuestaP2 = new EncuestasPendientes();
		encuestaP2.setIdentificacion("O03");
		encuestaP2.setDireccion("Direccion");
		encuestaP2.setEncuestador("Juan Perez");
		encuestaP2.setUltimaVisita("30/10/2020");
		
		EncuestasPendientes encuestaP3 = new EncuestasPendientes();
		encuestaP3.setIdentificacion("O07");
		encuestaP3.setDireccion("Direccion");
		encuestaP3.setEncuestador("Juan Perez");
		encuestaP3.setUltimaVisita("30/10/2020");
		
		EncuestasPendientes encuestaP4 = new EncuestasPendientes();
		encuestaP4.setIdentificacion("O12");
		encuestaP4.setDireccion("Direccion");
		encuestaP4.setEncuestador("Juan Perez");
		encuestaP4.setUltimaVisita("30/10/2020");
		
		lista1.add(encuesta1);
		lista1.add(encuesta2);
		lista1.add(encuesta3);
		lista1.add(encuesta4);
		lista1.add(encuesta5);
		lista1.add(encuesta6);
		lista1.add(encuesta7);
		lista1.add(encuesta8);
		
		lista2.add(encuestaP1);
		lista2.add(encuestaP2);
		lista2.add(encuestaP3);
		lista2.add(encuestaP4);

	}

	@Override
	public List<PilaDeEncuestas> mostrar() {
		// TODO Auto-generated method stub
		return lista1;
	}

	@Override
	public List<EncuestasPendientes> mostrar2() {
		// TODO Auto-generated method stub
		return lista2;
	}

}
