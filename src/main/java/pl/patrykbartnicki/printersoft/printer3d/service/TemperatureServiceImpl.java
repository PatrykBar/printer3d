package pl.patrykbartnicki.printersoft.printer3d.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patrykbartnicki.printersoft.printer3d.model.Temperature;
import pl.patrykbartnicki.printersoft.printer3d.repositories.TemperaturesRepository;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class TemperatureServiceImpl implements TemperatureService {

    @Autowired
    private final TemperaturesRepository temperaturesRepository;

    @Override
    public Flux<Temperature> getTemperatures() {
        return temperaturesRepository.findAll();
    }
}
