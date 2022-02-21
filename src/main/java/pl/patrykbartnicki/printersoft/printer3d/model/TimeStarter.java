package pl.patrykbartnicki.printersoft.printer3d.model;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

@Getter
abstract public class TimeStarter {

    @CreatedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime localTime;

    protected TimeStarter() {
        this.localTime = LocalDateTime.now(ZoneId.ofOffset("UTC", ZoneOffset.ofHours(1)));
    }

}