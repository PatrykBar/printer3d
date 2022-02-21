package pl.patrykbartnicki.printersoft.printer3d.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.patrykbartnicki.printersoft.printer3d.model.Position;

public interface ExtruderPositionRepository extends ReactiveMongoRepository<Position, String> {

}