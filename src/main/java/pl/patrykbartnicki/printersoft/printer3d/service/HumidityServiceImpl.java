package pl.patrykbartnicki.printersoft.printer3d.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import pl.patrykbartnicki.printersoft.printer3d.repositories.HumidityRepository;
import reactor.core.publisher.Flux;

@Slf4j
@Service
@RequiredArgsConstructor
public class HumidityServiceImpl implements HumidityService {

    @Autowired
    private final HumidityRepository humidityRepository;

    @Override
    public Flux<Humidity> getHumidity() {
        log.debug("I'm in the service");
        return humidityRepository.findAll();
    }

}
