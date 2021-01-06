package pl.patrykbartnicki.printersoft.printer3d.database;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.patrykbartnicki.printersoft.printer3d.model.*;
import pl.patrykbartnicki.printersoft.printer3d.repositories.*;
import reactor.core.publisher.Flux;

import java.util.ArrayList;

@Slf4j
@Component
public class DataFiller implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private HumidityRepository humidityRepository;
    @Autowired
    private TemperaturesRepository temperaturesRepository;
//    @Autowired
//    private LightinWorkspaceRepository lightinWorkspaceRepository;
//    @Autowired
//    private TurnOffThePrinterRepository turnOffThePrinterRepository;
//    @Autowired
//    private ExtruderPositionRepository extruderPositionRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//        loadExtruderPosition();
        loadHumidity();
        loadTemperature();
//        loadLightStatus();
//        loadPrinterStatus();

        log.debug("Loading Data");
    }

    private void loadTemperature(){

        ArrayList<Temperatures> temperaturesArrayList = new ArrayList<>();

        Temperatures temperatures0 = new Temperatures();
        temperatures0.setTemperatureOfNozzle((float) 25.44);
        temperatures0.setTemperatureOfTable(25.55f);
        temperatures0.setTemperatureOfWorkspace(26.44f);
        temperaturesArrayList.add(temperatures0);

        Temperatures temperatures1 = new Temperatures();
        temperatures1.setTemperatureOfNozzle((float) 25.44);
        temperatures1.setTemperatureOfTable(25.55f);
        temperatures1.setTemperatureOfWorkspace(26.44f);
        temperaturesArrayList.add(temperatures1);

        Temperatures temperatures2 = new Temperatures();
        temperatures2.setTemperatureOfNozzle((float) 25.5);
        temperatures2.setTemperatureOfTable(25.5f);
        temperatures2.setTemperatureOfWorkspace(26.4f);
        temperaturesArrayList.add(temperatures2);

        Temperatures temperatures3 = new Temperatures();
        temperatures3.setTemperatureOfNozzle((float) 26.5);
        temperatures3.setTemperatureOfTable(26.4f);
        temperatures3.setTemperatureOfWorkspace(26.45f);
        temperaturesArrayList.add(temperatures3);

        Temperatures temperatures4 = new Temperatures();
        temperatures4.setTemperatureOfNozzle((float) 24.5);
        temperatures4.setTemperatureOfTable(24.6f);
        temperatures4.setTemperatureOfWorkspace(24.44f);
        temperaturesArrayList.add(temperatures4);

        Temperatures temperatures5 = new Temperatures();
        temperatures5.setTemperatureOfNozzle((float) 24.44);
        temperatures5.setTemperatureOfTable(24.55f);
        temperatures5.setTemperatureOfWorkspace(24.44f);
        temperaturesArrayList.add(temperatures5);

        Temperatures temperatures6 = new Temperatures();
        temperatures6.setTemperatureOfNozzle((float) 26.44);
        temperatures6.setTemperatureOfTable(26.55f);
        temperatures6.setTemperatureOfWorkspace(36.44f);
        temperaturesArrayList.add(temperatures6);

        Temperatures temperatures7 = new Temperatures();
        temperatures7.setTemperatureOfNozzle((float) 50.44);
        temperatures7.setTemperatureOfTable(30.55f);
        temperatures7.setTemperatureOfWorkspace(29.44f);
        temperaturesArrayList.add(temperatures7);

        Temperatures temperatures8 = new Temperatures();
        temperatures8.setTemperatureOfNozzle((float) 120.44);
        temperatures8.setTemperatureOfTable(40.55f);
        temperatures8.setTemperatureOfWorkspace(35.44f);
        temperaturesArrayList.add(temperatures8);

        Temperatures temperatures9 = new Temperatures();
        temperatures9.setTemperatureOfNozzle((float) 220.44);
        temperatures9.setTemperatureOfTable(60.55f);
        temperatures9.setTemperatureOfWorkspace(40.44f);
        temperaturesArrayList.add(temperatures9);

        temperaturesRepository.deleteAll().
                thenMany(Flux.just(temperaturesArrayList).
                                flatMap(temperaturesRepository::saveAll)).
                subscribe(System.out::println);

    }

    private void loadHumidity(){

        ArrayList<Humidity> humidityArrayList = new ArrayList<>();

        Humidity humidity0 = new Humidity();
        humidity0.setHumidityOfDrybox(28);
        humidity0.setHumidityOfWorkspace(45);
        humidityArrayList.add(humidity0);

        Humidity humidity1 = new Humidity();
        humidity1.setHumidityOfDrybox(525);
        humidity1.setHumidityOfWorkspace(525);
        humidityArrayList.add(humidity1);

        Humidity humidity2 = new Humidity();
        humidity2.setHumidityOfDrybox(4444);
        humidity2.setHumidityOfWorkspace(444);
        humidityArrayList.add(humidity2);

        Humidity humidity3 = new Humidity();
        humidity3.setHumidityOfDrybox(666);
        humidity3.setHumidityOfWorkspace(666);
        humidityArrayList.add(humidity3);

        Humidity humidity4 = new Humidity();
        humidity4.setHumidityOfDrybox(2424);
        humidity4.setHumidityOfWorkspace(42424);
        humidityArrayList.add(humidity4);

        Humidity humidity5 = new Humidity();
        humidity5.setHumidityOfDrybox(34535);
        humidity5.setHumidityOfWorkspace(3753);
        humidityArrayList.add(humidity5);

        Humidity humidity6 = new Humidity();
        humidity6.setHumidityOfDrybox(73);
        humidity6.setHumidityOfWorkspace(570);
        humidityArrayList.add(humidity6);

        Humidity humidity7 = new Humidity();
        humidity7.setHumidityOfDrybox(45);
        humidity7.setHumidityOfWorkspace(66);
        humidityArrayList.add(humidity7);

        Humidity humidity8 = new Humidity();
        humidity8.setHumidityOfDrybox(11);
        humidity8.setHumidityOfWorkspace(11);
        humidityArrayList.add(humidity8);

        Humidity humidity9 = new Humidity();
        humidity9.setHumidityOfDrybox(99);
        humidity9.setHumidityOfWorkspace(99);
        humidityArrayList.add(humidity9);

        Humidity humidity10 = new Humidity();
        humidity10.setHumidityOfDrybox(10000);
        humidity10.setHumidityOfWorkspace(10000);
        humidityArrayList.add(humidity10);

        humidityRepository.deleteAll().
                thenMany(
                        Flux.just(humidityArrayList).
                                flatMap(humidityRepository::saveAll)).
                subscribe(System.out::println);


//        System.out.println("Number of humidity records: " + humidityRepository.count());
//        System.out.println("id:" + humidity0.getId() + ", HuDB:" + humidity0.getHumidityOfDrybox());
//        System.out.println(humidityRepository.);

    }

//    private void loadExtruderPosition(){
//        ExtruderPosition extruderPosition0 = new ExtruderPosition();
//        extruderPosition0.setPositionX(1);
//        extruderPosition0.setPositionY(1);
//        extruderPosition0.setPositionZ(1);
//        extruderPositionRepository.save(extruderPosition0);
//
//        ExtruderPosition extruderPosition1 = new ExtruderPosition();
//        extruderPosition1.setPositionX(1);
//        extruderPosition1.setPositionY(1);
//        extruderPosition1.setPositionZ(1);
//        extruderPositionRepository.save(extruderPosition1);
//
//        ExtruderPosition extruderPosition2 = new ExtruderPosition();
//        extruderPosition2.setPositionX(1);
//        extruderPosition2.setPositionY(1);
//        extruderPosition2.setPositionZ(1);
//        extruderPositionRepository.save(extruderPosition2);
//
//        ExtruderPosition extruderPosition3 = new ExtruderPosition();
//        extruderPosition3.setPositionX(1);
//        extruderPosition3.setPositionY(1);
//        extruderPosition3.setPositionZ(1);
//        extruderPositionRepository.save(extruderPosition3);
//
//        ExtruderPosition extruderPosition4 = new ExtruderPosition();
//        extruderPosition4.setPositionX(1);
//        extruderPosition4.setPositionY(1);
//        extruderPosition4.setPositionZ(1);
//        extruderPositionRepository.save(extruderPosition4);
//
//        ExtruderPosition extruderPosition5 = new ExtruderPosition();
//        extruderPosition5.setPositionX(1);
//        extruderPosition5.setPositionY(1);
//        extruderPosition5.setPositionZ(1);
//        extruderPositionRepository.save(extruderPosition5);
//
//        ExtruderPosition extruderPosition6 = new ExtruderPosition();
//        extruderPosition6.setPositionX(1);
//        extruderPosition6.setPositionY(1);
//        extruderPosition6.setPositionZ(1);
//        extruderPositionRepository.save(extruderPosition6);
//
//        ExtruderPosition extruderPosition7 = new ExtruderPosition();
//        extruderPosition7.setPositionX(1);
//        extruderPosition7.setPositionY(1);
//        extruderPosition7.setPositionZ(1);
//        extruderPositionRepository.save(extruderPosition7);
//
//        ExtruderPosition extruderPosition8 = new ExtruderPosition();
//        extruderPosition8.setPositionX(1);
//        extruderPosition8.setPositionY(1);
//        extruderPosition8.setPositionZ(1);
//        extruderPositionRepository.save(extruderPosition8);
//
//        ExtruderPosition extruderPosition9 = new ExtruderPosition();
//        extruderPosition9.setPositionX(1);
//        extruderPosition9.setPositionY(1);
//        extruderPosition9.setPositionZ(1);
//        extruderPositionRepository.save(extruderPosition9);
//
//    }
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
