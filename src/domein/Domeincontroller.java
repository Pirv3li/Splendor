package domein;
import java.util.*;

public class Domeincontroller {

	Spel spel;
	ArrayList<Speler> spelers;
	SpelerRepository spelerRepository;

	public Domeincontroller() {
		spel = new Spel(spelers);
	}

	public void startSpel() {
		// TODO - implement Domeincontroller.startSpel
	}

	public void voegSpelerToe(Speler speler) {
	    if (spelers.size() < 4) {
	        spelers.add(speler);
	    } else {
	        throw new IllegalArgumentException("Er kunnen maximaal 4 spelers meedoen.");
	    }
	}


}