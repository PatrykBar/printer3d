package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class TurnOffThePrinter {

    @Id
    private String id;

    private boolean statusOfPrinter;

    // if temperature of nozzle/table/workspace is too high turn off printer
    // if button of turn off the printer is pressed sent another message with acceptation of turning off the printer
}