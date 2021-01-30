package pl.patrykbartnicki.printersoft.printer3d.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import pl.patrykbartnicki.printersoft.printer3d.repositories.HumidityRepository;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

class HumidityServiceImplTest {

    HumidityServiceImpl humidityService;

    @Mock
    HumidityRepository humidityRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        humidityService = new HumidityServiceImpl(humidityRepository);
    }

    @Test
    public void get_humidity() throws Exception{

        //Given

        given(humidityService.getHumidity()).willReturn(createListOfHumidity());

        //When
        Flux<Humidity> humidities = humidityService.getHumidity();

        //Then
        assertNotNull(humidities);
        verify(humidityRepository).findAll();
    }

    @AfterEach
    void tearDown() {
        humidityRepository.deleteAll();
    }

    private Flux<Humidity> createListOfHumidity(){
        List<Humidity> humidityList = new ArrayList<>();

        Humidity humidity = new Humidity();
        humidity.setHumidityOfWorkspace(50);
        humidity.setHumidityOfDrybox(20);
        humidityList.add(humidity);

        Humidity humidity1 = new Humidity();
        humidity1.setHumidityOfDrybox(525);
        humidity1.setHumidityOfWorkspace(525);
        humidityList.add(humidity1);

        Humidity humidity2 = new Humidity();
        humidity2.setHumidityOfDrybox(4444);
        humidity2.setHumidityOfWorkspace(444);
        humidityList.add(humidity2);

        Humidity humidity3 = new Humidity();
        humidity3.setHumidityOfDrybox(666);
        humidity3.setHumidityOfWorkspace(666);
        humidityList.add(humidity3);

        return Flux.just(humidityList).flatMap(humidityRepository::saveAll);
    }

}