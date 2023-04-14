package domein;
import java.util.*;

public class Domeincontroller {
	
	Spel spel;
	ArrayList<Speler> spelers;
	SpelerRepository spelerRepository;

	public Domeincontroller() {
		spel = new Spel();
	}

	public void startSpel() {
		spel.startSpel();	
	}
	
	public void setstartSpelerIndex() {
		spel.setStartspelerIndex();
	}
	
//	public int getStartSpelerIndex() {
//		return spel.getstartspelerindex();
//	}

	public void voegSpelerToe(String naam, int geboortejaar) {
		spel.voegSpelerToe(naam, geboortejaar);
	}
	
	public String getSpelersOverzicht() {
		return spel.getSpelersOverzicht();
	}
	
	public String getEdelstenenOverzicht() {
		return spel.edelstenenOverzicht();
	}
	
	public String getOntwikkelingskaartenOverzicht() {
		return spel.ontwikkelingskaartenOverzicht();
	}

}