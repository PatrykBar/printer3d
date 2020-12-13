package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import pl.patrykbartnicki.printersoft.printer3d.repositories.HumidityRepository;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
public class HumiditiController {

    private HumidityRepository humidityRepository;

    @GetMapping(produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public Flux<Humidity> get(){
        return humidityRepository.findAll();
    }

}
