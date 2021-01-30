package pl.patrykbartnicki.printersoft.printer3d.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import pl.patrykbartnicki.printersoft.printer3d.repositories.HumidityRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class HumidityServiceImpl implements HumidityService{

    @Autowired
    private final HumidityRepository humidityRepository;

    public Flux<Humidity> getHumidity() {
        return humidityRepository.findAll();
    }



//    public Mono<Humidity> getOneRecordOfHumidity() {
//
//        Flux<Humidity> fluxHum = humidityRepository.findAll();
//        ArrayList<Humidity> arraHum = new ArrayList<>(Objects.requireNonNull(fluxHum.collectList().block()));
//
//        int indexOfHumidity = arraHum.lastIndexOf(fluxHum);
//        Humidity humidity = arraHum.get(indexOfHumidity);
//
//        return Mono.just(humidity);
//    }

}