package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.model.TurnOffThePrinter;
import pl.patrykbartnicki.printersoft.printer3d.repositories.TurnOffThePrinterRepository;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
public class TurnOffThePrinterController {

    private TurnOffThePrinterRepository turnOffThePrinterRepository;

    @GetMapping(produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public Flux<TurnOffThePrinter> get(){
        return turnOffThePrinterRepository.findAll();
    }

}
