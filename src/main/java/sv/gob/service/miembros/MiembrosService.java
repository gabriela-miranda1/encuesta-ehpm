package sv.gob.service.miembros;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.gob.models.Cuestionario.Seccion;
import sv.gob.models.miembros.Miembros;
import sv.gob.repository.Cuestionario.SeccionRepository;
import sv.gob.repository.miembros.MiembrosRepository;

@Service
public class MiembrosService implements IMiembrosService{

	@Autowired
	private MiembrosRepository miembrosRepo;

	@Override
	public void guardar(Miembros miembros) {
		// TODO Auto-generated method stub
		miembrosRepo.save(miembros);
		
	}

	@Override
	public void eliminar(String idMiembros) {
		// TODO Auto-generated method stub
		miembrosRepo.deleteById(idMiembros);
		
	}

	@Override
	public List<Miembros> buscarTodas() {
		// TODO Auto-generated method stub
		return (List<Miembros>) miembrosRepo.findAll();
	}

	@Override
	public Miembros editar(String idMiembros) {
		// TODO Auto-generated method stub
		Optional<Miembros> optional = miembrosRepo.findById(idMiembros);
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;
	}
	

}
