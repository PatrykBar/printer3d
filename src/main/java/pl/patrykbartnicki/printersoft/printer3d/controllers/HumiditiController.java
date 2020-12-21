package pl.patrykbartnicki.printersoft.printer3d.controllers;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import pl.patrykbartnicki.printersoft.printer3d.repositories.HumidityRepository;
import reactor.core.publisher.Flux;

@RestController
public class HumiditiController {

    private HumidityRepository humidityRepository;

    @GetMapping(value = "/humidity/show", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Humidity> get(){
        return humidityRepository.findAll();
    }


    @GetMapping("/humidity")
    public String getHumidity(Model model){

        model.addAttribute("humidity", humidityRepository.findAll());

        return "index";
    }

}
