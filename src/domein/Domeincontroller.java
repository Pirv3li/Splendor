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
	
	public int getPunten() {
		return spel.telPuntenOp();
	}

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
	
	public String getEdelenOverzicht() {
		return spel.getEdelen();
	}
	
	public void neemEdelstenen(String edelsteenString, int aantal) {
		if(aantal==1) {
	    Edelsteen edelsteen = null;
	    try {
	        edelsteen = Edelsteen.valueOf(edelsteenString.toUpperCase());
	    } catch (IllegalArgumentException e) {
	        System.out.println("Invalid Edelsteenfiche");
	    }
	    if (edelsteen != null) {
	        spel.neem_1_Edelsteen(edelsteen, aantal);
	    	}
		}
		if(aantal==2) {
			Edelsteen edelsteen = null;
			try {
		        edelsteen = Edelsteen.valueOf(edelsteenString.toUpperCase());
		    } catch (IllegalArgumentException e) {
		        System.out.println("Invalid Edelsteenfiche");
		    }
			if(edelsteen != null) {
			spel.neem_2_Edelstenen(edelsteen, aantal);
				}
			}
		}
	
	public void volgendeSpeler() {
		spel.volgendeSpeler();
	}
	
	public String getNaamVanSpelerAanDeBeurt() {
		return spel.getSpelerAanDeBeurtNaam();
	}

}