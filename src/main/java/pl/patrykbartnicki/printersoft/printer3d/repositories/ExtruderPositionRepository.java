package pl.patrykbartnicki.printersoft.printer3d.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.patrykbartnicki.printersoft.printer3d.model.ExtruderPosition;

public interface ExtruderPositionRepository extends ReactiveMongoRepository<ExtruderPosition, String> {

}