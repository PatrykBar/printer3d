package pl.patrykbartnicki.printersoft.printer3d.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.patrykbartnicki.printersoft.printer3d.model.TurnOffThePrinter;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TurnOffThePrinterRepository extends MainRepositoryClass<TurnOffThePrinter, String> {

    @Override
    default <S extends TurnOffThePrinter> Mono<S> insert(S entity) {
        return null;
    }
}
