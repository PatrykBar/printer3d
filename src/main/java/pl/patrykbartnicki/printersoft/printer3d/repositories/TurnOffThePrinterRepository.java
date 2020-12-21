package pl.patrykbartnicki.printersoft.printer3d.repositories;


import org.reactivestreams.Publisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.patrykbartnicki.printersoft.printer3d.model.TurnOffThePrinter;
import reactor.core.publisher.Mono;

public interface TurnOffThePrinterRepository extends ReactiveMongoRepository<TurnOffThePrinter, String> {

    @Override
    <S extends TurnOffThePrinter> Mono<S> insert(S entity);

    @Override
    Mono<Long> count();

    @Override
    Mono findById(Publisher id);
}
