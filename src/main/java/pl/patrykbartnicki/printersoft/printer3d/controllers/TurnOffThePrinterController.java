package pl.patrykbartnicki.printersoft.printer3d.controllers;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.model.TurnOffThePrinter;
import pl.patrykbartnicki.printersoft.printer3d.repositories.TurnOffThePrinterRepository;
import reactor.core.publisher.Mono;

@RestController
public class TurnOffThePrinterController {

    private TurnOffThePrinterRepository turnOffThePrinterRepository;

    @GetMapping("/printerStatus/show")
    public Mono<TurnOffThePrinter> get(){
        return turnOffThePrinterRepository.findById(turnOffThePrinterRepository.count());
    }

    @GetMapping("/turnOffThePrinters")
    public String geTurnOffThePrinters(Model model){

        model.addAttribute("turnOffThePrinters" , turnOffThePrinterRepository.findById(turnOffThePrinterRepository.count()));

        return "index";
    }

}
