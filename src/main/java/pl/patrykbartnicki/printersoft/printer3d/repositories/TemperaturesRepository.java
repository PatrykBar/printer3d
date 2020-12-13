package pl.patrykbartnicki.printersoft.printer3d.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.patrykbartnicki.printersoft.printer3d.model.Temperatures;
import reactor.core.publisher.Flux;

public interface TemperaturesRepository extends ReactiveMongoRepository<Temperatures, String> {

    @Override
    Flux<Temperatures> findAll();

}