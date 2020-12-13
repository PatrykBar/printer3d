package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.patrykbartnicki.printersoft.printer3d.model.TimeStarter;

import java.time.LocalDateTime;


@Controller
@AllArgsConstructor
public class CollectionOfDataController extends TimeStarter {

    // collection of all data for main control panel
    private ExtruderPositionController extruderPositionController;
    private HumiditiController humiditiController;
    private LightInWorkspaceController lightInWorkspaceController;
    private TemperatureController temperatureController;
    private TurnOffThePrinterController turnOffThePrinterController;


    @GetMapping("/hello")
    public String get(Model model){

        model.addAttribute("extruderPosition", extruderPositionController.get());
        model.addAttribute("humidity", humiditiController.get());
        model.addAttribute("lightStatus", lightInWorkspaceController.get());
        model.addAttribute("temperatures", temperatureController.get());
        model.addAttribute("turnOffThePrinter" ,turnOffThePrinterController.get());
        model.addAttribute("time", new TimeStarter() {
            @Override
            public LocalDateTime getLocalTime() {
                return super.getLocalTime();
            }
        });

        return "index";
    }


}
