package pl.patrykbartnicki.printersoft.printer3d.model;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.patrykbartnicki.printersoft.printer3d.repositories.HumidityRepository;
import reactor.core.publisher.Mono;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class HumidityTest {

    Humidity humidity;

    @BeforeEach
    void setUp() {
        humidity = new Humidity(20,30);
    }

    @Test
    void getId() throws Exception{
        String idValue = "100";

        humidity.setId(idValue);

        assertEquals(idValue, humidity.getId());
    }

    @Test
    void getHumidityOfWorkspace() throws Exception{
        int humidityOfWorkspaceValue = 100;

        humidity.setHumidityOfWorkspace(humidityOfWorkspaceValue);

        assertEquals(humidityOfWorkspaceValue, humidity.getHumidityOfWorkspace());
    }

    @Test
    void getHumidityOfDrybox() throws Exception{
        int humidityOfDryboxValue = 500;

        humidity.setHumidityOfDrybox(humidityOfDryboxValue);

        assertEquals(humidityOfDryboxValue, humidity.getHumidityOfDrybox());
    }

}