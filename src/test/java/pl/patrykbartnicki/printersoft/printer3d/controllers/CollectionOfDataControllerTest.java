package pl.patrykbartnicki.printersoft.printer3d.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import pl.patrykbartnicki.printersoft.printer3d.service.HumidityServiceImpl;
import pl.patrykbartnicki.printersoft.printer3d.service.TemperatureServiceImpl;
import reactor.core.publisher.Flux;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

class CollectionOfDataControllerTest {

//    @Mock
//    Model model;
//
//    @Mock
//    HumidityServiceImpl humidityServiceImpl;
//
//    @Mock
//    TemperatureServiceImpl temperatureService;
//
//    CollectionOfDataController collectionOfDataController;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//        collectionOfDataController = new CollectionOfDataController(humidityServiceImpl, temperatureService);
//    }
//
//    @Test
//    public void get_index_page() {
////
////        //Given
////
////        Humidity humidity = new Humidity();
////        humidity.setId("1");
////        HashSet humidities = new HashSet();
////        humidities.add(humidity);
////
////        given(humidityServiceImpl.getHumidity()).willReturn(Flux.fromIterable(humidities));
////
////        //when
////        String viewName = collectionOfDataController.getIndexPage(model);
////
////        //then
////        assertEquals("index", viewName);
////        verify(humidityServiceImpl, times(1)).getHumidity();
////        verify(model, times(1)).addAttribute(eq("humiditys"), any());
//
//    }
}