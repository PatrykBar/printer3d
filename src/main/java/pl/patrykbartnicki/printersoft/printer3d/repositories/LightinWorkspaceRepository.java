package pl.patrykbartnicki.printersoft.printer3d.repositories;


import org.reactivestreams.Publisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.patrykbartnicki.printersoft.printer3d.model.LightInWorkspace;
import reactor.core.publisher.Mono;

public interface LightinWorkspaceRepository extends ReactiveMongoRepository<LightInWorkspace, String> {

    @Override
    <S extends LightInWorkspace> Mono<S> insert(S entity);

    @Override
    Mono<Long> count();

    @Override
    Mono findById(Publisher id);
}
