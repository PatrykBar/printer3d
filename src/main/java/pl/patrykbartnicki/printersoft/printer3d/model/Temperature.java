package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document
public class Temperature extends TimeStarter{

    @Id
    private String id;

    private double temperatureOfNozzle;
    private double temperatureOfWorkspace;
    private double temperatureOfTable;

    public Temperature(double temperatureOfNozzle, double temperatureOfWorkspace, double temperatureOfTable) {
        this.temperatureOfNozzle = temperatureOfNozzle;
        this.temperatureOfWorkspace = temperatureOfWorkspace;
        this.temperatureOfTable = temperatureOfTable;
    }

    // get request for temperature of workspace
    // get request for temperature of nozzle
    // get request for temperature of table
}
