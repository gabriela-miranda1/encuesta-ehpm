package sv.gob.service.controlCalidad;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import sv.gob.models.grupo02.Encuesta;

@Service
public class ControlEncuestaService implements IControlEncuestaService {
	
	List<Encuesta> listaRevision = null;
	List<Encuesta> listaPila = null;
	
	public ControlEncuestaService()
	{
		listaRevision = new LinkedList<>();
		Encuesta eR1 = new Encuesta("002","02/11/2020","Juan Perez");
		Encuesta eR2 = new Encuesta("003","02/01/2020","Kare Peñol");
		Encuesta eR3 = new Encuesta("007","02/11/2020","Juan Flores");
		Encuesta eR4 = new Encuesta("012","02/11/2020","Juan Perez");
		listaRevision.add(eR1);
		listaRevision.add(eR2);
		listaRevision.add(eR3);
		listaRevision.add(eR4);
		
		listaPila = new LinkedList<>();
		Encuesta eP1 = new Encuesta("040","San Salvador-San Salvador","04","Noviembre","No revisada");
		Encuesta eP2 = new Encuesta("041","San Salvador-San Salvador","04","Noviembre","No revisada");
		Encuesta eP3 = new Encuesta("042","San Salvador-Apopa","03","Noviembre","No revisada");
		Encuesta eP4 = new Encuesta("043","San Salvador-Soyapango","04","Octubre","No revisada");
		Encuesta eP5 = new Encuesta("044","San Salvador-Apopa","05","Octubre","No revisada");
		Encuesta eP6 = new Encuesta("045","San Salvador-San Soyapango","05","Octubre","Segunda revision");
		Encuesta eP7 = new Encuesta("046","La Libertad-Santa Tecla","04","Septiembre","Segunda revision");
		Encuesta eP8 = new Encuesta("047","La Libertad-Santa Tecla","07","Septiembre","Segunda revision");
		listaPila.add(eP1);
		listaPila.add(eP2);
		listaPila.add(eP3);
		listaPila.add(eP4);
		listaPila.add(eP5);
		listaPila.add(eP6);
		listaPila.add(eP7);
		listaPila.add(eP8);
	}

	@Override
	public List<Encuesta> mostrarRevision() {
		// TODO Auto-generated method stub
		return listaRevision;
	}

	@Override
	public List<Encuesta> mostrarPila() {
		// TODO Auto-generated method stub
		return listaPila;
	}
}
