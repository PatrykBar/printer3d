package pl.patrykbartnicki.printersoft.printer3d.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import reactor.core.publisher.Flux;

public interface HumidityRepository extends MainRepositoryClass<Humidity, String> {

}