package pl.patrykbartnicki.printersoft.printer3d.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import pl.patrykbartnicki.printersoft.printer3d.model.LightInWorkspace;
import reactor.core.publisher.Flux;

public interface LightinWorkspaceRepository extends ReactiveMongoRepository<LightInWorkspace, String> {

    @Override
    Flux<LightInWorkspace> findAll();
}
