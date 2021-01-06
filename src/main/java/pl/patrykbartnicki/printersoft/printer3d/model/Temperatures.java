package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Temperatures {

    @Id
    private String id;

    private float temperatureOfNozzle;
    private float temperatureOfWorkspace;
    private float temperatureOfTable;

    // get request for temperature of workspace
    // get request for temperature of nozzle
    // get request for temperature of table
}
