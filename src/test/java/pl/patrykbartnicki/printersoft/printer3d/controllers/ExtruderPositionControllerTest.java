package pl.patrykbartnicki.printersoft.printer3d.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import pl.patrykbartnicki.printersoft.printer3d.model.Position;
import pl.patrykbartnicki.printersoft.printer3d.service.ExtruderPositionServiceImpl;
import reactor.core.publisher.Flux;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


class ExtruderPositionControllerTest {

    @Mock
    ExtruderPositionServiceImpl extruderPositionService;
    @Mock
    Model model;

    ExtruderPositionController extruderPositionController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        extruderPositionController = new ExtruderPositionController(extruderPositionService);
    }

    @Test
    public void get_extruder_position() {
        Position position = new Position(20, 20,20);
        position.setId("1");
        HashSet positions = new HashSet();
        positions.add(position);
        //Given
        given(extruderPositionService.getExtruderPosition()).willReturn(Flux.fromIterable(positions));
        //When
        String viewName = extruderPositionController.getExtruderPositions(model);

        //Then
        assertEquals("extruderFiles/setExtruderPosition", viewName);
        verify(extruderPositionService, times(1)).getExtruderPosition();
        verify(model, times(1)).addAttribute(eq("getExtruderPositions"), any());
    }

    @Test
    public void set_extruder_position() {
        Position position = new Position(20, 20,20);
        position.setId("1");
        HashSet positions = new HashSet();
        positions.add(position);
        //Given
        given(extruderPositionService.getExtruderPosition()).willReturn(Flux.fromIterable(positions));

        //When
        String viewName = extruderPositionController.setExtruderPosition(position);

        //Then
        assertEquals("extruderFiles/changePositionOk", viewName);
        verify(extruderPositionService, times(1)).setExtruderPosition(position);
    }
}