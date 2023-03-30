package domein;

import java.util.*;

public class Speler {

	ArrayList<Ontwikkelingskaart> ontwikkelingsKaarten;
	ArrayList<Edel> edelen;
	private String gebruikersnaam;
	private int geboortejaar;
	private int leeftijd;
	
	public Speler(String gebruikersnaam, int geboortejaar) {
		setGebruikersnaam(gebruikersnaam);
		setGeboortejaar(geboortejaar);
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
	    this.leeftijd = leeftijd;
	    
	    if (leeftijd < 6) {
	        throw new IllegalArgumentException("Gebruiker moet minstens 6 jaar oud zijn.");
	    }
	    
	    this.geboortejaar = geboortejaar;
	}
	
	public int getLeeftijd() {
		return this.leeftijd;
	}
	
	public void setGemsInventory(Edelsteen soort, int aantal) {
		
	}


	public int telPuntenOp() {
		int sum = 0;
		for (Ontwikkelingskaart Ontwikkelingskaart : ontwikkelingsKaarten) {
			sum += Ontwikkelingskaart.getPunten();
		}
		return sum;
	}

}