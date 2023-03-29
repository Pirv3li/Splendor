package domein;
import persistentie.Mapper;
import java.util.*;

public class Domeincontroller {
	
	Mapper mapper;
	Spel spel;
	ArrayList<Speler> spelers;
	SpelerRepository spelerRepository;
	private int startSpelerIndex;

	public Domeincontroller() {
		spelers = new ArrayList<Speler>();
	}

	public void startSpel() {
		spel = new Spel(spelers);
		
	}
	
	public void setstartSpelerIndex() {
		this.startSpelerIndex = spel.getStartSpelerIndex(spelers);
	}
	
	public int getStartSpelerIndex() {
		return startSpelerIndex;
	}

	public void voegSpelerToe(String naam, int geboortejaar) {
	    if (spelers.size() <= 4) {
	    	Speler speler = new Speler(naam,geboortejaar);
	        spelers.add(speler);
	    } else {
	        throw new IllegalArgumentException("Er kunnen maximaal 4 spelers meedoen.");
	    }
	}
	
	public String getSpelersOverzicht() {
	    StringBuilder sb = new StringBuilder();
	    int i = 1;
	    for (Speler speler : spelers) {
	        sb.append("Speler ").append(i).append(": ")
	            .append(speler.getGebruikersnaam()).append(", ")
	            .append(speler.getGeboortejaar());
	        if (i == startSpelerIndex+1) {
	            sb.append(" (startspeler)");
	        }
	        sb.append("\n");
	        i++;
	    }
	    return sb.toString();
	}

	


}