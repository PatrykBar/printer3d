package pl.patrykbartnicki.printersoft.printer3d.service;

import org.springframework.stereotype.Service;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import reactor.core.publisher.Flux;

@Service
public interface HumidityService {

    Flux<Humidity> getHumidity();

}
