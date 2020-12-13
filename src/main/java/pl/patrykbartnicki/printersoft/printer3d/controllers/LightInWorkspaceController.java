package pl.patrykbartnicki.printersoft.printer3d.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykbartnicki.printersoft.printer3d.model.LightInWorkspace;
import pl.patrykbartnicki.printersoft.printer3d.repositories.LightinWorkspaceRepository;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
public class LightInWorkspaceController {

    private LightinWorkspaceRepository lightinWorkspaceRepository;

    @GetMapping(produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public Flux<LightInWorkspace> get(){
        return lightinWorkspaceRepository.findAll();
    }

}
