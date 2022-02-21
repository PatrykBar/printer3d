package pl.patrykbartnicki.printersoft.printer3d.service;

import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import reactor.core.publisher.Flux;

public interface HumidityService {

    Flux<Humidity> getHumidity();

}