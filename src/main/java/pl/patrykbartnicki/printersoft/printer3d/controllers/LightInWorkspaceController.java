package pl.patrykbartnicki.printersoft.printer3d.controllers;

import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.model.LightInWorkspace;
import pl.patrykbartnicki.printersoft.printer3d.repositories.LightinWorkspaceRepository;

import reactor.core.publisher.Mono;

@RestController
public class LightInWorkspaceController {

    private LightinWorkspaceRepository lightinWorkspaceRepository;

    @GetMapping("/lightStatus/show")
    public Mono<LightInWorkspace> get(){
        return lightinWorkspaceRepository.findById(lightinWorkspaceRepository.count());
    }

    @GetMapping("/lightStatuss")
    public String getLightStatuss(Model model){

        model.addAttribute("lightStatuss", lightinWorkspaceRepository.findById(lightinWorkspaceRepository.count()));

        return "index";
    }


}
