package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.model.Temperatures;
import pl.patrykbartnicki.printersoft.printer3d.repositories.TemperaturesRepository;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
public class TemperatureController {

    private TemperaturesRepository temperaturesRepository;

    @GetMapping(produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public Flux<Temperatures> get(){
        return temperaturesRepository.findAll();
    }


}
