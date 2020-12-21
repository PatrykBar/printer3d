package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.patrykbartnicki.printersoft.printer3d.service.HumidityServiceImpl;

@Controller
@AllArgsConstructor
public class CollectionOfDataController{

    // collection of all data for main control panel
    @Autowired
    private final HumidityServiceImpl humidityService;

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("humidity", humidityService.getHumidity().collectList().block());

        return "index";
    }

}
