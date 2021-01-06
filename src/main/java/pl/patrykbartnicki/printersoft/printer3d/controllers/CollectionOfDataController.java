package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.service.HumidityServiceImpl;

@Controller
@RequiredArgsConstructor
public class CollectionOfDataController{

    private final HumidityServiceImpl humidityService;

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("humiditys", humidityService.getHumidity());

        return "index";
    }

}