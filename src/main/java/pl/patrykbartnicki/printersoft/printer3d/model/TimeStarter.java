package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Data
abstract public class TimeStarter {

    @Id
    private String id;

    @CreatedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime localTime;

    public TimeStarter() {
        this.localTime = LocalDateTime.now();
    }

}