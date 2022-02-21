package pl.patrykbartnicki.printersoft.printer3d.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patrykbartnicki.printersoft.printer3d.model.Position;
import pl.patrykbartnicki.printersoft.printer3d.repositories.ExtruderPositionRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ExtruderPositionServiceImpl implements ExtruderPositionService {

    @Autowired
    private final ExtruderPositionRepository extruderPositionRepository;

    @Override
    public Flux<Position> getExtruderPosition() {
        return extruderPositionRepository.findAll();
    }

    @Override
    public void setExtruderPosition(Position extruderPosition) {
        extruderPositionRepository.
                insert(Mono.just(extruderPosition)).
                flatMap(extruderPositionRepository::save).subscribe();
    }
}