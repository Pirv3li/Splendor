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
		spel.controleerSpelersSize();
	}
	
	//public void setstartSpelerIndex() {
		//this.startSpelerIndex = spel.getStartSpelerIndex(spelers);
	//}
	
	//public int getStartSpelerIndex() {
		//return startSpelerIndex;
	//}

	public void voegSpelerToe(String naam, int geboortejaar) {
		spel.voegSpelerToe(naam, geboortejaar);
	}
	
	public String getSpelersOverzicht() {
		return spel.getSpelersOverzicht();
	}

}