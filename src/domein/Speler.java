package domein;

import java.util.*;

public class Speler {

	ArrayList<Ontwikkelingskaarten> ontwikkelingsKaarten;
	ArrayList<Edelsteenfiches> gems;
	ArrayList<Edelen> edelen;
	private String gebruikersnaam;
	private int geboortejaar;
	private boolean aanDeBeurt;
	private boolean isStartSpeler;
	
	public Speler(String gebruikersnaam, int geboortejaar) {
		setGebruikersnaam(gebruikersnaam);
		setGeboortejaar(geboortejaar);
		//TODO aanDeBeurt, isStartSpeler : ? 
	}

	public String getGebruikersnaam() {
		return this.gebruikersnaam;
	}

	private void setGebruikersnaam(String gebruikersnaam) {
		// Domeinregels voor gebruikersnaam, kijk naar exceptions om te verstaan wat ze doen. 
		
		if (gebruikersnaam == null || gebruikersnaam.isBlank()) {
	        throw new IllegalArgumentException("Gebruikersnaam mag niet leeg zijn.");
	    }
	    
	    if (!Character.isLetter(gebruikersnaam.charAt(0))) {
	        throw new IllegalArgumentException("Gebruikersnaam mag enkel met een letter starten.");
	    }
	    
	    for (int i = 0; i < gebruikersnaam.length(); i++) {
	        char c = gebruikersnaam.charAt(i);
	        if (!Character.isLetterOrDigit(c) && c != ' ' && c != '_') {
	            throw new IllegalArgumentException("Gebruikersnaam mag enkel letters, cijfers, spacies en _ bevatten.");
	        }
	    }
		this.gebruikersnaam = gebruikersnaam;
	}

	public int getGeboortejaar() {
		return this.geboortejaar;
	}

	private void setGeboortejaar(int geboortejaar) {
		// domeinregels voor geboortejaar, kijk naar exception om te verstaan wat ze doen. 
	    int huidigJaar = Calendar.getInstance().get(Calendar.YEAR);
	    
	    if (geboortejaar < 1900 || geboortejaar > huidigJaar) {
	        throw new IllegalArgumentException("Geboortejaar is ongeldig.");
	    }
	    
	    int leeftijd = huidigJaar - geboortejaar;
	    
	    if (leeftijd < 6) {
	        throw new IllegalArgumentException("Gebruiker moet minstens 6 jaar oud zijn.");
	    }
	    
	    this.geboortejaar = geboortejaar;
	}


	public boolean getAanDeBeurt() {
		return this.aanDeBeurt;
	}

	private void setAanDeBeurt(boolean aanDeBeurt) {
		this.aanDeBeurt = aanDeBeurt;
	}

	public boolean getIsStartSpeler() {
		return this.isStartSpeler;
	}

	private void setIsStartSpeler(boolean isStartSpeler) {
		this.isStartSpeler = isStartSpeler;
	}

	public int telPuntenOp() {
		// TODO - implement Speler.telPuntenOp
	}

}