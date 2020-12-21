package pl.patrykbartnicki.printersoft.printer3d.controllers;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.model.Temperatures;
import pl.patrykbartnicki.printersoft.printer3d.repositories.TemperaturesRepository;
import reactor.core.publisher.Flux;

@RestController
public class TemperatureController {

    private TemperaturesRepository temperaturesRepository;

    @GetMapping(value = "/temp/show",  produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Temperatures> get(){
        return temperaturesRepository.findAll();
    }


    @GetMapping("/temperatures")
    public String getTemperatures(Model model){

        model.addAttribute("temperatures", temperaturesRepository.findAll());

        return "index";
    }

}
