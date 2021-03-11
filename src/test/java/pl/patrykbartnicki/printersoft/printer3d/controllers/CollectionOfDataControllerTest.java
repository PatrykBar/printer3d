package pl.patrykbartnicki.printersoft.printer3d.controllers;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import pl.patrykbartnicki.printersoft.printer3d.TestcontainersAndDatabaseConfigForTests;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import pl.patrykbartnicki.printersoft.printer3d.service.HumidityServiceImpl;
import pl.patrykbartnicki.printersoft.printer3d.service.TemperatureServiceImpl;
import reactor.core.publisher.Flux;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class CollectionOfDataControllerTest{

    @Mock
    Model model;

    @Mock
    HumidityServiceImpl humidityServiceImpl;

    @Mock
    TemperatureServiceImpl temperatureService;

    CollectionOfDataController collectionOfDataController;

    private static TestcontainersAndDatabaseConfigForTests testcontainersAndDatabaseConfigForTests =
            new TestcontainersAndDatabaseConfigForTests();

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        collectionOfDataController = new CollectionOfDataController(humidityServiceImpl, temperatureService);

        testcontainersAndDatabaseConfigForTests.startContainers();
        testcontainersAndDatabaseConfigForTests.setNameOfContainers("CollectionOfDataController");
    }

    @Test
    public void get_index_page() {

        //Given
        Humidity humidity = new Humidity(20, 30);
        humidity.setId("1");
        HashSet humidities = new HashSet();
        humidities.add(humidity);

        given(humidityServiceImpl.getHumidity()).willReturn(Flux.fromIterable(humidities));

        //when
        String viewName = collectionOfDataController.getIndexPage(model);

        //then
        assertEquals("index", viewName);
        verify(humidityServiceImpl, times(1)).getHumidity();
        verify(model, times(1)).addAttribute(eq("humiditys"), any());
    }

    @AfterAll
    static void afterAll() {
        testcontainersAndDatabaseConfigForTests.stopContainers();
    }
}