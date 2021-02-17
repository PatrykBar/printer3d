package pl.patrykbartnicki.printersoft.printer3d.database;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.patrykbartnicki.printersoft.printer3d.model.*;
import pl.patrykbartnicki.printersoft.printer3d.repositories.*;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Slf4j
@Component
public class DataFiller implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private HumidityRepository humidityRepository;
    @Autowired
    private TemperaturesRepository temperaturesRepository;
    @Autowired
    private ExtruderPositionRepository extruderPositionRepository;

//    @Autowired
//    private LightinWorkspaceRepository lightinWorkspaceRepository;
//    @Autowired
//    private TurnOffThePrinterRepository turnOffThePrinterRepository;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadExtruderPosition(50, 200,1);
        loadHumidity(1000, 20 , 80);
        loadTemperature(1000, 20, 35);
//        loadLightStatus();
//        loadPrinterStatus();


        log.debug("Loading Data");
    }

    private void loadTemperature(int numberOfHumidityData, int min, int max){

        ArrayList<Temperature> temperatureArrayList = new ArrayList<>();

        temperaturesRepository.deleteAll().subscribe();

        for (int i=0; i<numberOfHumidityData; i++) {

            Double randomValue1 = ThreadLocalRandom.current().nextDouble(min, max);
            Double randomValue2 = ThreadLocalRandom.current().nextDouble(min, max);
            Double randomValue3 = ThreadLocalRandom.current().nextDouble(min, max);

            BigDecimal randomValue1_1 = BigDecimal.valueOf(randomValue1).
                    setScale(2, RoundingMode.HALF_UP);
            BigDecimal randomValue2_1 = BigDecimal.valueOf(randomValue2).
                    setScale(2, RoundingMode.HALF_UP);
            BigDecimal randomValue3_1 = BigDecimal.valueOf(randomValue3).
                    setScale(2, RoundingMode.HALF_UP);

            (temperaturesRepository.
                    insert(Mono.just(new Temperature(randomValue1_1.doubleValue(), randomValue2_1.doubleValue(), randomValue3_1.doubleValue())))).
                    delayElements(Duration.ofSeconds(1)).
                    flatMap(temperaturesRepository::save).
                    subscribe();
        }

//        Temperature temperature0 = new Temperature();
//        temperature0.setTemperatureOfNozzle((float) 25.44);
//        temperature0.setTemperatureOfTable(25.55f);
//        temperature0.setTemperatureOfWorkspace(26.44f);
//        temperatureArrayList.add(temperature0);
//
//        Temperature temperature1 = new Temperature();
//        temperature1.setTemperatureOfNozzle((float) 25.44);
//        temperature1.setTemperatureOfTable(25.55f);
//        temperature1.setTemperatureOfWorkspace(26.44f);
//        temperatureArrayList.add(temperature1);
//
//        Temperature temperature2 = new Temperature();
//        temperature2.setTemperatureOfNozzle((float) 25.5);
//        temperature2.setTemperatureOfTable(25.5f);
//        temperature2.setTemperatureOfWorkspace(26.4f);
//        temperatureArrayList.add(temperature2);
//
//        Temperature temperature3 = new Temperature();
//        temperature3.setTemperatureOfNozzle((float) 26.5);
//        temperature3.setTemperatureOfTable(26.4f);
//        temperature3.setTemperatureOfWorkspace(26.45f);
//        temperatureArrayList.add(temperature3);
//
//        Temperature temperature4 = new Temperature();
//        temperature4.setTemperatureOfNozzle((float) 24.5);
//        temperature4.setTemperatureOfTable(24.6f);
//        temperature4.setTemperatureOfWorkspace(24.44f);
//        temperatureArrayList.add(temperature4);
//
//        Temperature temperature5 = new Temperature();
//        temperature5.setTemperatureOfNozzle((float) 24.44);
//        temperature5.setTemperatureOfTable(24.55f);
//        temperature5.setTemperatureOfWorkspace(24.44f);
//        temperatureArrayList.add(temperature5);
//
//        Temperature temperature6 = new Temperature();
//        temperature6.setTemperatureOfNozzle((float) 26.44);
//        temperature6.setTemperatureOfTable(26.55f);
//        temperature6.setTemperatureOfWorkspace(36.44f);
//        temperatureArrayList.add(temperature6);
//
//        Temperature temperature7 = new Temperature();
//        temperature7.setTemperatureOfNozzle((float) 50.44);
//        temperature7.setTemperatureOfTable(30.55f);
//        temperature7.setTemperatureOfWorkspace(29.44f);
//        temperatureArrayList.add(temperature7);
//
//        Temperature temperature8 = new Temperature();
//        temperature8.setTemperatureOfNozzle((float) 120.44);
//        temperature8.setTemperatureOfTable(40.55f);
//        temperature8.setTemperatureOfWorkspace(35.44f);
//        temperatureArrayList.add(temperature8);
//
//        Temperature temperature9 = new Temperature();
//        temperature9.setTemperatureOfNozzle((float) 220.44);
//        temperature9.setTemperatureOfTable(60.55f);
//        temperature9.setTemperatureOfWorkspace(40.44f);
//        temperatureArrayList.add(temperature9);
//
//        temperaturesRepository.deleteAll().
//                thenMany(Flux.just(temperatureArrayList).
//                                flatMap(temperaturesRepository::saveAll)).
//                subscribe(System.out::println);

    }

    private void loadHumidity(int numberOfHumidityData, int min, int max){

//        ArrayList<Humidity> humidityArrayList = new ArrayList<>();

        humidityRepository.deleteAll().subscribe();

        for (int i=0; i<numberOfHumidityData; i++) {
            Random random = new Random();
            int randomValue1 = random.nextInt((max-min)+1)+min;
            int randomValue2 = random.nextInt((max-min)+1)+min;

                humidityRepository.insert(
                        Mono.just(new Humidity(randomValue1, randomValue2))).
                        flatMap(humidityRepository::save).subscribe();
        }

//        Humidity humidity0 = new Humidity();
//        humidity0.setHumidityOfDrybox(28);
//        humidity0.setHumidityOfWorkspace(45);
//        humidityArrayList.add(humidity0);
//
//        Humidity humidity1 = new Humidity();
//        humidity1.setHumidityOfDrybox(525);
//        humidity1.setHumidityOfWorkspace(525);
//        humidityArrayList.add(humidity1);
//
//        Humidity humidity2 = new Humidity();
//        humidity2.setHumidityOfDrybox(4444);
//        humidity2.setHumidityOfWorkspace(444);
//        humidityArrayList.add(humidity2);
//
//        Humidity humidity3 = new Humidity();
//        humidity3.setHumidityOfDrybox(666);
//        humidity3.setHumidityOfWorkspace(666);
//        humidityArrayList.add(humidity3);
//
//        Humidity humidity4 = new Humidity();
//        humidity4.setHumidityOfDrybox(2424);
//        humidity4.setHumidityOfWorkspace(42424);
//        humidityArrayList.add(humidity4);
//
//        Humidity humidity5 = new Humidity();
//        humidity5.setHumidityOfDrybox(34535);
//        humidity5.setHumidityOfWorkspace(3753);
//        humidityArrayList.add(humidity5);
//
//        Humidity humidity6 = new Humidity();
//        humidity6.setHumidityOfDrybox(73);
//        humidity6.setHumidityOfWorkspace(570);
//        humidityArrayList.add(humidity6);
//
//        Humidity humidity7 = new Humidity();
//        humidity7.setHumidityOfDrybox(45);
//        humidity7.setHumidityOfWorkspace(66);
//        humidityArrayList.add(humidity7);
//
//        Humidity humidity8 = new Humidity();
//        humidity8.setHumidityOfDrybox(11);
//        humidity8.setHumidityOfWorkspace(11);
//        humidityArrayList.add(humidity8);
//
//        Humidity humidity9 = new Humidity();
//        humidity9.setHumidityOfDrybox(99);
//        humidity9.setHumidityOfWorkspace(99);
//        humidityArrayList.add(humidity9);
//
//        Humidity humidity10 = new Humidity();
//        humidity10.setHumidityOfDrybox(10000);
//        humidity10.setHumidityOfWorkspace(10000);
//        humidityArrayList.add(humidity10);

//        humidityRepository.deleteAll().
//                thenMany(
//                        Flux.just(humidityArrayList).
//                                flatMap(humidityRepository::saveAll)).
//                subscribe(System.out::println);

//        System.out.println("Number of humidity records: " + humidityRepository.count());
//        System.out.println("id:" + humidity0.getId() + ", HuDB:" + humidity0.getHumidityOfDrybox());
//        System.out.println(humidityRepository.);

    }

    private void loadExtruderPosition(int numberOfPosition, int max, int min){

        ArrayList<Position> positionsArrayList = new ArrayList<>();

        extruderPositionRepository.deleteAll().subscribe();

        for (int i=0; i<numberOfPosition; i++) {
            Random random = new Random();
            int randomValue1 = random.nextInt((max-min)+1)+min;
            int randomValue2 = random.nextInt((max-min)+1)+min;
            int randomValue3 = random.nextInt((max-min)+1)+min;

            extruderPositionRepository.insert(Mono.just(new Position(randomValue1, randomValue2, randomValue3))).
                    flatMap(extruderPositionRepository::save).subscribe();
        }

    }
//
//    private void loadLightStatus(){
//        LightInWorkspace lightInWorkspace = new LightInWorkspace();
//        lightInWorkspace.setStatusOfLight(false);
//        lightinWorkspaceRepository.save(lightInWorkspace);
//    }
//
//    private void loadPrinterStatus(){
//        TurnOffThePrinter printerStatus = new TurnOffThePrinter();
//        printerStatus.setStatusOfPrinter(true);
//        turnOffThePrinterRepository.save(printerStatus);
//    }

}
