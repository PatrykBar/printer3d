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


    @GetMapping("/extruderPositions")
    public String getExtruderPositions(Model model){

        model.addAttribute("extruderPositions", extruderPositionController.get());

        return "index";
    }

    @GetMapping("/humidity")
    public String getHumidity(Model model){

        model.addAttribute("humidity", humiditiController.get());

        return "index";
    }

    @GetMapping("/lightStatuss")
    public String getLightStatuss(Model model){

        model.addAttribute("lightStatuss", lightInWorkspaceController.get());

        return "index";
    }

    @GetMapping("/temperatures")
    public String getTemperatures(Model model){

        model.addAttribute("temperatures", temperatureController.get());

        return "index";
    }

    @GetMapping("/turnOffThePrinters")
    public String geTurnOffThePrinters(Model model){

        model.addAttribute("turnOffThePrinters" ,turnOffThePrinterController.get());

        return "index";
    }

    @GetMapping("/times")
    public String getTimes(Model model){

        model.addAttribute("times", new TimeStarter() {
            @Override
            public LocalDateTime getLocalTime() {
                return super.getLocalTime();
            }
        });

        return "index";
    }




}
