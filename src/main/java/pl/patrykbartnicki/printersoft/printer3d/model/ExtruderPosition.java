package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class ExtruderPosition {

    @Id
    private String id;

    private int positionX;
    private int positionY;
    private int positionZ;

    //Auto HOME

    //X HOME

    //Y HOME

    //Z HOME

    //table leveling
}