package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Humidity {

    @Id
    private String id;

    int humidityOfWorkspace;
    int humidityOfDrybox;



    // get request for humidity of workspace
    // get request for humidity of bry box
}
