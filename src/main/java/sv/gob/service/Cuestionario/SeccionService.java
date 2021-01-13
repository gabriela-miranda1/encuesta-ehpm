package sv.gob.service.Cuestionario;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.gob.models.Cuestionario.Seccion;
import sv.gob.repository.Cuestionario.SeccionRepository;

@Service
public class SeccionService implements ISeccionService {
	
	@Autowired
	private SeccionRepository seccionRepo;

	@Override
	public void guardar(Seccion seccion) {
		seccionRepo.save(seccion);
		
	}

	@Override
	public void eliminar(String idSeccion) {
		seccionRepo.deleteById(idSeccion);
		
	}

	@Override
	public List<Seccion> buscarTodas() {
		return (List<Seccion>) seccionRepo.findAll();
	}

	@Override
	public Seccion editar(String idSeccion) {
		// TODO Auto-generated method stub
		Optional<Seccion> optional = seccionRepo.findById(idSeccion);
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;
	}

	@Override
	public void editar2(String idSeccion) {
		seccionRepo.findById(idSeccion);
	}
}

