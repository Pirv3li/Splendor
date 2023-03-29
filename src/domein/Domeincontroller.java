package domein;
import java.util.*;

public class Domeincontroller {

	Spel spel;
	ArrayList<Speler> spelers;
	SpelerRepository spelerRepository;

	public Domeincontroller() {
		
	}

	public void startSpel() {
		// TODO - implement Domeincontroller.startSpel
	}

	public void voegSpelerToe(String naam, int geboortejaar) {
	    if (spelers.size() < 4) {
	    	Speler speler = new Speler(naam,geboortejaar);
	        spelers.add(speler);
	    } else {
	        throw new IllegalArgumentException("Er kunnen maximaal 4 spelers meedoen.");
	    }
	}


}