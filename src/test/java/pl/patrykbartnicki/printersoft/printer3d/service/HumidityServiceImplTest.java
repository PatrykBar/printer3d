package pl.patrykbartnicki.printersoft.printer3d.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import pl.patrykbartnicki.printersoft.printer3d.TestcontainersAndDatabaseConfigForTests;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import pl.patrykbartnicki.printersoft.printer3d.repositories.HumidityRepository;
import reactor.core.publisher.Flux;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

class HumidityServiceImplTest extends TestcontainersAndDatabaseConfigForTests {

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
        Humidity humidity = new Humidity(20,20);
        humidityRepository.insert(humidity);
        given(humidityService.getHumidity()).willReturn(Flux.just());

        //When
        Flux<Humidity> humidities = humidityService.getHumidity();

        //Then
        assertNotNull(humidities);
        verify(humidityRepository, times(1)).findAll();
    }

    @AfterEach
    void tearDown() {
        humidityRepository.deleteAll();
    }

}