package pl.patrykbartnicki.printersoft.printer3d.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.patrykbartnicki.printersoft.printer3d.model.Humidity;
import pl.patrykbartnicki.printersoft.printer3d.repositories.HumidityRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

class HumidityServiceImplTest {
//
//    HumidityServiceImpl humidityService;
//
//    @Mock
//    HumidityRepository humidityRepository;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//        humidityService = new HumidityServiceImpl(humidityRepository);
//    }
//
//    @Test
//    public void get_humidity() throws Exception{
//
////        //Given
////
////        given(humidityService.getHumidity()).willReturn(createListOfHumidity());
////
////        //When
////        Flux<Humidity> humidities = humidityService.getHumidity();
////
////        //Then
////        assertNotNull(humidities);
////        verify(humidityRepository).findAll();
//    }
//
//    @AfterEach
//    void tearDown() {
//        humidityRepository.deleteAll();
//    }
//
//    private void createListOfHumidity(){
//
//        int numberOfHumidityData = 1000;
//        int min = 20;
//        int max = 30;
//
//        humidityRepository.deleteAll().subscribe();
//
//        for (int i=0; i<numberOfHumidityData; i++) {
//            Random random = new Random();
//            int randomValue1 = random.nextInt((max-min)+1)+min;
//            int randomValue2 = random.nextInt((max-min)+1)+min;
//
//            humidityRepository.insert(Mono.just(new Humidity(randomValue1, randomValue2))).
//                    flatMap(humidityRepository::save).subscribe();
//        }
//    }

}