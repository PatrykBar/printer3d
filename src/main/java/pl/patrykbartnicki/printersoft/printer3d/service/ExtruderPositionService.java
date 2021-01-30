package pl.patrykbartnicki.printersoft.printer3d.service;

import pl.patrykbartnicki.printersoft.printer3d.model.Position;
import reactor.core.publisher.Flux;

public interface ExtruderPositionService {

    Flux<Position> getExtruderPosition();

    void setExtruderPosition(Position extruderPosition);

}
