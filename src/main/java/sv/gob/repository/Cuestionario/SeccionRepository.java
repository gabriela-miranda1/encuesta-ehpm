package sv.gob.repository.Cuestionario;

import org.springframework.data.mongodb.repository.MongoRepository;

import sv.gob.models.Cuestionario.Seccion;

public interface SeccionRepository extends MongoRepository<Seccion, String> {

}
