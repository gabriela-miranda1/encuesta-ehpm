package sv.gob.repository.grupos;

import org.springframework.data.mongodb.repository.MongoRepository;

import sv.gob.models.grupos.Grupos;

public interface GruposRepository extends MongoRepository<Grupos, String> {

}
