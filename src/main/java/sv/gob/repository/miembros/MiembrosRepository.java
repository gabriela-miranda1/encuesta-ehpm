package sv.gob.repository.miembros;

import org.springframework.data.mongodb.repository.MongoRepository;

import sv.gob.models.miembros.Miembros;

public interface MiembrosRepository extends MongoRepository<Miembros, String>{

}
