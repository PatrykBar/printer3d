package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import pl.patrykbartnicki.printersoft.printer3d.model.Position;
import pl.patrykbartnicki.printersoft.printer3d.service.ExtruderPositionServiceImpl;
import reactor.util.annotation.Nullable;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ExtruderPositionController {

    private final ExtruderPositionServiceImpl extruderPositionService;
    private WebDataBinder webDataBinder;

    @GetMapping("/getExtruderPositions")
    public String getExtruderPositions(Model model){

        model.addAttribute("getExtruderPositions", extruderPositionService.getExtruderPosition());

        return "extruderFiles/setExtruderPosition";
    }

    @GetMapping("/postPosition")
    public String getForPost(Model model){

        model.addAttribute("Position", new Position());

        return "extruderFiles/setExtruderPosition";
    }

    @PostMapping("/postPosition")
    public String setExtruderPosition(@ModelAttribute("Position") Position extruderPosition){

//        webDataBinder.validate();
//        BindingResult result = webDataBinder.getBindingResult();
//
//        if (result.hasErrors()){
//            result.getAllErrors().forEach(objectError -> {log.debug(objectError.toString());});
//            return "redirect:/400error";
//        }else {

            extruderPositionService.setExtruderPosition(extruderPosition);

            return "extruderFiles/changePositionOk";
//        }
    }

}