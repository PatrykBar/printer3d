package pl.patrykbartnicki.printersoft.printer3d.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import reactor.core.publisher.Flux;

public interface HumidityRepository extends ReactiveMongoRepository<Humidity, String> {

    @Override
    default <S extends Humidity> Flux<S> findAll(Example<S> example) {
        return null;
    }
}
