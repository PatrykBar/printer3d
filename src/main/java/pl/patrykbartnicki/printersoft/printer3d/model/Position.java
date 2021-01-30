package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
@NoArgsConstructor
public class Position {

    @Id
    private String id;

    private int positionX;
    private int positionY;
    private int positionZ;

    public Position(int positionX, int positionY, int positionZ) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.positionZ = positionZ;
    }

    //Auto HOME

    //X HOME

    //Y HOME

    //Z HOME

    //table leveling
}