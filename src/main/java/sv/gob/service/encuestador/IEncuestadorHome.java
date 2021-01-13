package sv.gob.service.encuestador;

import java.util.List;

import sv.gob.models.grupo02.Encuesta;

public interface IEncuestadorHome {
	
	List<Encuesta> mostrarDisponibles();
	List<Encuesta> mostrarPendientes();
}
