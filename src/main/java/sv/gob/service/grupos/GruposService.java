package sv.gob.service.grupos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.gob.models.grupos.Grupos;
import sv.gob.repository.grupos.GruposRepository;

@Service
public class GruposService implements IGruposService {

	@Autowired
	private GruposRepository gruposRepo;

	@Override
	public void guardar(Grupos grupos) {
		// TODO Auto-generated method stub
		gruposRepo.save(grupos);

	}

	@Override
	public void eliminar(String idgrupos) {
		// TODO Auto-generated method stub
		gruposRepo.deleteById(idgrupos);
	}

	@Override
	public List<Grupos> buscarTodas() {
		// TODO Auto-generated method stub
		return (List<Grupos>) gruposRepo.findAll();
	}

	@Override
	public Grupos editar(String idgrupos) {
		// TODO Auto-generated method stub
		Optional<Grupos> optional = gruposRepo.findById(idgrupos);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

}
