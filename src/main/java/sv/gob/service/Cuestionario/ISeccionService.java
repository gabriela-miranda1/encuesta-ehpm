package sv.gob.service.Cuestionario;

import java.util.List;

import sv.gob.models.Cuestionario.Seccion;


public interface ISeccionService {
	void guardar(Seccion seccion);
	void eliminar(String idSeccion);
	List<Seccion> buscarTodas();
	Seccion editar(String idSeccion);
	void editar2(String idSeccion);

}
