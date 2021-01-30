package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import pl.patrykbartnicki.printersoft.printer3d.repositories.HumidityRepository;
import pl.patrykbartnicki.printersoft.printer3d.service.HumidityServiceImpl;
import reactor.core.publisher.Flux;

import java.time.LocalDateTime;

@Controller
@RequiredArgsConstructor
public class HumiditiController {

    private final HumidityServiceImpl humidityService;

//    @GetMapping(value = "/humidity/show")
//    public Flux<Humidity> get(){
//        return humidityService.getHumidity();
//    }

    @GetMapping("/humidity/showTable")
    public String getHumidityForTable(Model model){

        model.addAttribute("humiditys", humidityService.getHumidity());

        return "humidityFiles/humidityTable";
    }

    @GetMapping("/humidity/showChart")
    public String getHumidityForChart(Model model){

        model.addAttribute("humiditys", humidityService.getHumidity());

        return "humidityFiles/humidityChart";
    }

}