package pl.patrykbartnicki.printersoft.printer3d.service;

import pl.patrykbartnicki.printersoft.printer3d.model.Temperature;
import reactor.core.publisher.Flux;

public interface TemperatureService {

    Flux<Temperature> getTemperatures();

}
