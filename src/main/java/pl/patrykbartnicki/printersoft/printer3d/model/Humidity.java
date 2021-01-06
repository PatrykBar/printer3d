package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Humidity{

    @Id
    private String id;

    private int humidityOfWorkspace;
    private int humidityOfDrybox;

    // get request for humidity of workspace
    // get request for humidity of bry box
}
