package testen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import domein.Domeincontroller;
import domein.Edel;
import domein.Edelsteen;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.image.BufferedImage;

import org.junit.Before;

public class DomeincontrollerTest {

	private Domeincontroller domeinController;

	@BeforeEach
	public void setUp() {
	    domeinController = new Domeincontroller();
	}


	@Test
	public void testSetstartSpelerIndex() {
	    domeinController.setstartSpelerIndex();
	    Assertions.assertNotNull(domeinController);
	}

	@Test
	public void testGetPunten() {
		domeinController.voegSpelerToe("Player1", 1990);
		domeinController.voegSpelerToe("Player2", 1995);
		domeinController.startSpel();
		
		
	    Assertions.assertEquals(0, domeinController.getPunten());
	}

	@Test
	public void testVoegSpelerToe() {
	    String naam = "Jan";
	    int geboortejaar = 1990;
	    domeinController.voegSpelerToe(naam, geboortejaar);
	    Assertions.assertEquals(naam, domeinController.getNaamVanSpelerAanDeBeurt());
	}

	@Test
	public void testGetSpelersOverzicht() {
	    String spelersOverzicht = domeinController.getSpelersOverzicht();
	    Assertions.assertNotNull(spelersOverzicht);
	}

	//@Test
	//public void testGetEdelstenenOverzicht() {
	//    String edelstenenOverzicht = domeinController.getEdelstenenOverzicht();
	 //   Assertions.assertNotNull(edelstenenOverzicht);
	//}

	@Test
	public void testGetOntwikkelingskaartenOverzicht() {
	    String ontwikkelingskaartenOverzicht = domeinController.getOntwikkelingskaartenOverzicht();
	    Assertions.assertNotNull(ontwikkelingskaartenOverzicht);
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
		    sb.append("ROBIJNEN 4\n");
		    sb.append("DIAMANTEN 4\n");
		    sb.append("ONYXEN 4\n");
		    sb.append("SMARAGDEN 4\n");
		    sb.append("SAFFIEREN 4\n");
		    
		
		assertEquals(sb, domeinController.getEdelstenenOverzicht());
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

	//@Test
	//public void testGetNaamVanSpelerAanDeBeurt() {
	  //  String naam = "Jan";
	   

}
