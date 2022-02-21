package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.patrykbartnicki.printersoft.printer3d.service.HumidityServiceImpl;
import pl.patrykbartnicki.printersoft.printer3d.service.TemperatureServiceImpl;

@Controller
@RequiredArgsConstructor
public class CollectionOfDataController{

    private final HumidityServiceImpl humidityService;
    private final TemperatureServiceImpl temperatureService;

    @GetMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("humiditys", humidityService.getHumidity());
        model.addAttribute("temperature", temperatureService.getTemperatures());
        return "index";
    }

}