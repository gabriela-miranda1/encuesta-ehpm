package sv.gob.service.jefeDeCampo;

import java.util.List;

import sv.gob.models.EncuestasPendientes;
import sv.gob.models.PilaDeEncuestas;

public interface IJefeCampoService {
	
	List<PilaDeEncuestas> mostrar();
	List<EncuestasPendientes> mostrar2();

}
