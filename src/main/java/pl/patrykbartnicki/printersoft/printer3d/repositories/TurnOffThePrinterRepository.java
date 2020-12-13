package pl.patrykbartnicki.printersoft.printer3d.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.patrykbartnicki.printersoft.printer3d.model.TurnOffThePrinter;
import reactor.core.publisher.Flux;

public interface TurnOffThePrinterRepository extends ReactiveMongoRepository<TurnOffThePrinter, String> {

    @Override
    Flux<TurnOffThePrinter> findAll();
}
