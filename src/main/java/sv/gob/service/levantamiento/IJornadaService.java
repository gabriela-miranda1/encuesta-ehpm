package sv.gob.service.levantamiento;

import java.util.List;

import sv.gob.models.extensiones.Departamentos;
import sv.gob.models.extensiones.Grupo;
import sv.gob.models.extensiones.Municipios;
import sv.gob.models.extensiones.ZonaOperacion;
import sv.gob.models.grupo02.Jornadas;

public interface IJornadaService {
	List<Jornadas> mostrar();
	
}
