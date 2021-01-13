package sv.gob.service.controlCalidad;

import java.util.List;

import sv.gob.models.grupo02.Encuesta;

public interface IControlEncuestaService {
	List<Encuesta> mostrarRevision();
	List<Encuesta> mostrarPila();
}
