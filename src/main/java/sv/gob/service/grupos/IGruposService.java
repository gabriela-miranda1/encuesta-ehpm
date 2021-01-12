package sv.gob.service.grupos;

import java.util.List;

import sv.gob.models.grupos.Grupos;

public interface IGruposService {
	void guardar(Grupos grupos);
	void eliminar(String idgrupos);
	List<Grupos> buscarTodas();
	Grupos editar(String idgrupos);

}
