package pl.patrykbartnicki.printersoft.printer3d.controllers;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.model.ExtruderPosition;
import pl.patrykbartnicki.printersoft.printer3d.repositories.ExtruderPositionRepository;
import reactor.core.publisher.Flux;

import java.awt.*;

@RestController
public class ExtruderPositionController {

    private ExtruderPositionRepository extruderPositionRepository;

    @GetMapping(value = "/extruderPosition/show", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<ExtruderPosition> get(){ return extruderPositionRepository.findAll(); }

    @GetMapping("/extruderPositions")
    public String getExtruderPositions(Model model){

        model.addAttribute("extruderPositions", extruderPositionRepository.findAll());

        return "index";
    }

}
