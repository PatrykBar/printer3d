package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.servlet.function.RouterFunction;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class LightInWorkspace {
    @Id
    private String id;

    private boolean statusOfLight;

    // SET light on
    // SET light off
    // GET light status
}
