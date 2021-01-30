package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.patrykbartnicki.printersoft.printer3d.service.TemperatureServiceImpl;

@Controller
@RequiredArgsConstructor
public class TemperatureController {

    private final TemperatureServiceImpl temperatureService;

//    @GetMapping(value = "/temp/show")
//    public Flux<Temperatures> get(){
//        return temperatureService.getTemperatures();
//    }

    @GetMapping("/temperatures/showTable")
    public String getTemperaturesForTable(Model model){

        model.addAttribute("temperatures", temperatureService.getTemperatures());

        return "temperatureFiles/tempTable";
    }

    @GetMapping("/temperatures/showChart")
    public String getTemperaturesForChart(Model model){

        model.addAttribute("temperatures", temperatureService.getTemperatures());

        return "temperatureFiles/tempChart";
    }

}