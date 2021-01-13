package sv.gob.service.miembros;

import java.util.List;

import sv.gob.models.miembros.Miembros;

public interface IMiembrosService {
	void guardar(Miembros miembros);
	void eliminar(String idMiembros);
	List<Miembros> buscarTodas();
	Miembros editar(String idMiembros);

}
