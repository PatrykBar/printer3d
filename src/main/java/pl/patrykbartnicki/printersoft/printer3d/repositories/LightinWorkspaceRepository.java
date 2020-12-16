package pl.patrykbartnicki.printersoft.printer3d.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.patrykbartnicki.printersoft.printer3d.model.LightInWorkspace;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LightinWorkspaceRepository extends MainRepositoryClass<LightInWorkspace, String> {

    @Override
    default <S extends LightInWorkspace> Mono<S> insert(S entity) {
        return null;
    }
}
