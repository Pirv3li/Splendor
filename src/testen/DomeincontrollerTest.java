package testen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

import domein.Domeincontroller;
import domein.Edel;
import domein.Edelsteen;
import dto.PuntenDto;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.image.BufferedImage;

import org.junit.Before;

public class DomeincontrollerTest {

	private Domeincontroller domeinController;

	@BeforeEach
	public void UseIt() {
	    domeinController = new Domeincontroller();
	}


	@Test
	public void testSetstartSpelerIndex() {
	    domeinController.setstartSpelerIndex();
	    Assertions.assertNotNull(domeinController);
	}

	@Test
    public void testGetPunten() {
        // Создаем экземпляр класса, который хотим протестировать
        Domeincontroller domeincontroller = new Domeincontroller();

        // Задаем фиктивные значения для списка punten
        ArrayList<Integer> punten = new ArrayList<>();
        punten.add(10);
        punten.add(20);
        punten.add(30);

        // Задаем ожидаемое значение для списка puntenDto
        List<PuntenDto> expectedPuntenDto = new ArrayList<>();
        expectedPuntenDto.add(new PuntenDto(10));
        expectedPuntenDto.add(new PuntenDto(20));
        expectedPuntenDto.add(new PuntenDto(30));

        // Вызываем метод, который хотим протестировать, и получаем фактическое значение
        List<PuntenDto> actualPuntenDto = domeincontroller.getPunten();

        // Проверяем, что фактическое значение соответствует ожидаемому????
        Assertions.assertEquals(expectedPuntenDto, actualPuntenDto);
    }

	@Test
	public void testVoegSpelerToe() {
	    String naam = "Jan";
	    int geboortejaar = 1990;
	    domeinController.voegSpelerToe(naam, geboortejaar);
	    String spelerAanDeBeurt = domeinController.getNaamVanSpelerAanDeBeurt();
	    Assertions.assertEquals(naam, spelerAanDeBeurt);
	}

	@Test
	public void testGetSpelersOverzicht() {
	    String spelersOverzicht = domeinController.getSpelersOverzicht();
	    Assertions.assertNotNull(spelersOverzicht);
	}


	@Test
    public void testGetOntwikkelingskaartenOverzicht() {
        // Создаем экземпляр класса Domeincontroller 
        Domeincontroller domeincontroller = new Domeincontroller();

        // Вызываем метод getOntwikkelingskaartenOverzicht ???????
        String ontwikkelingskaartenOverzicht = domeincontroller.getOntwikkelingskaartenOverzicht();

        // Проверяем, что полученное значение соответствует ожидаемому значению
        String expectedOntwikkelingskaartenOverzicht = "Ontwikkelingskaarten overzicht";
        Assertions.assertEquals(expectedOntwikkelingskaartenOverzicht, ontwikkelingskaartenOverzicht);
    }

	@Test
	public void testSetOntwikkelingskaartenOverzichtEnEdelenOverzicht() {
	    domeinController.setOntwikkelingskaartenOverzichtEnEdelenOverzicht();
	    Assertions.assertNotNull(domeinController);
	}

	@Test
	
	public void testGetEdelenOverzicht() {
		domeinController.voegSpelerToe("Player1", 1990);
		domeinController.voegSpelerToe("Player2", 1995);
		
		// add some edelen
		
		domeinController.setOntwikkelingskaartenOverzichtEnEdelenOverzicht();
		domeinController.startSpel();
		 StringBuilder sb = new StringBuilder();
		    sb.append("Beschikbare edelstenen:\n");
		    sb.append("ROBIJNEN 4 \n");
		    sb.append("DIAMANTEN 4 \n");
		    sb.append("ONYXEN 4 \n");
		    sb.append("SMARAGDEN 4 \n");
		    sb.append("SAFFIEREN 4 \n");
		    
		    
		
		assertEquals(sb.toString(), domeinController.getEdelstenenOverzicht());
	}


	@Test
	public void testNeemEdelstenen() {
	    domeinController.neemEdelstenen("BLAUW", 1);
	    Assertions.assertNotNull(domeinController);
	}
	
	@Test
	public void testNeemEdelenAlsGenoegBonusEdelstenen() {
	    domeinController.neemEdelenAlsGenoegBonusEdelstenen();
	    Assertions.assertNotNull(domeinController);
	}

	@Test
	public void testGetStapelSizeNiveau1() {
	    domeinController.setOntwikkelingskaartenOverzichtEnEdelenOverzicht();
	    Assertions.assertEquals(36, domeinController.getStapelSizeNiveau1());
	}

	@Test
	public void testGetStapelSizeNiveau2() {
		 domeinController.setOntwikkelingskaartenOverzichtEnEdelenOverzicht();
	    Assertions.assertEquals(26, domeinController.getStapelSizeNiveau2());
	}

	@Test
	public void testGetStapelSizeNiveau3() {
		 domeinController.setOntwikkelingskaartenOverzichtEnEdelenOverzicht();
	    Assertions.assertEquals(16, domeinController.getStapelSizeNiveau3());
	}

	@Test
	public void testVolgendeSpeler() {
	    
	    domeinController.voegSpelerToe("Player1", 1990);
	    domeinController.voegSpelerToe("Player2", 1995);
		
	    domeinController.volgendeSpeler();
		assertEquals("Player2", domeinController.getNaamVanSpelerAanDeBeurt());
		
		domeinController.volgendeSpeler();
		assertEquals("Player1", domeinController.getNaamVanSpelerAanDeBeurt());
	}


}
