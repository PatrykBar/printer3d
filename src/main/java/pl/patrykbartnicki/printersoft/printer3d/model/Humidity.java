package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Humidity {

    @Id
    private String id;

    int humidityOfWorkspace;
    int humidityOfDrybox;

    // get request for humidity of workspace
    // get request for humidity of bry box
}
