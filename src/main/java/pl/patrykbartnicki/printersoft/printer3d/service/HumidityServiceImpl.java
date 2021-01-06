package pl.patrykbartnicki.printersoft.printer3d.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import pl.patrykbartnicki.printersoft.printer3d.repositories.HumidityRepository;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class HumidityServiceImpl implements HumidityService{

    @Autowired
    private final HumidityRepository humidityRepository;

    public Flux<Humidity> getHumidity() {
        return humidityRepository.findAll();
    }

}
