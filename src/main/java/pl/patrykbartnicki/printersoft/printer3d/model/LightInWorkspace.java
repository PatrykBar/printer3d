package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
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
