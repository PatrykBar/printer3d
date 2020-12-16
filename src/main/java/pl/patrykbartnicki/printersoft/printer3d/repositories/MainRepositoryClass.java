package pl.patrykbartnicki.printersoft.printer3d.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface MainRepositoryClass<T, String> extends ReactiveMongoRepository<T, String> {

    @Override
    Flux<T>findAll();
}
