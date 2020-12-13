package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.model.ExtruderPosition;
import pl.patrykbartnicki.printersoft.printer3d.repositories.ExtruderPositionRepository;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
public class ExtruderPositionController {

    private ExtruderPositionRepository extruderPositionRepository;

    @GetMapping(produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public Flux<ExtruderPosition> get(){
        return extruderPositionRepository.findAll();
    }

}
