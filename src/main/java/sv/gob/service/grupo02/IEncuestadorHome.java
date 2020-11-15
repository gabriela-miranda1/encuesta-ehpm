package sv.gob.service.grupo02;

import java.util.List;

import sv.gob.models.grupo02.Encuesta;

public interface IEncuestadorHome {
	
	List<Encuesta> mostrarDisponibles();
	List<Encuesta> mostrarPendientes();
}
