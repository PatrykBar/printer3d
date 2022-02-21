package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document
public class Humidity extends TimeStarter{

    @Id
    private String id;

    private int humidityOfWorkspace;
    private int humidityOfDrybox;

    public Humidity(int humidityOfWorkspace, int humidityOfDrybox) {
        this.humidityOfWorkspace = humidityOfWorkspace;
        this.humidityOfDrybox = humidityOfDrybox;
    }

    // get request for humidity of workspace
    // get request for humidity of bry box
}
