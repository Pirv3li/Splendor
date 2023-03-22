package domein;

import java.util.*;

public class Speler {

	ArrayList<Ontwikkelingskaarten> ontwikkelingsKaarten;
	ArrayList<Edelsteenfiches> gems;
	ArrayList<Edelen> edelen;
	private String gebruikersnaam;
	private int geboortejaar;
	private boolean aanDeBeurt;
	private int leeftijd;
	
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
	    this.leeftijd = leeftijd;
	    
	    if (leeftijd < 6) {
	        throw new IllegalArgumentException("Gebruiker moet minstens 6 jaar oud zijn.");
	    }
	    
	    this.geboortejaar = geboortejaar;
	}
	
	public int getLeeftijd() {
		return this.leeftijd;
	}

	public boolean getAanDeBeurt() {
		return this.aanDeBeurt;
	}

	private void setAanDeBeurt(boolean aanDeBeurt) {
		this.aanDeBeurt = aanDeBeurt;
	}

	public Speler getStartSpeler(ArrayList<Speler> spelers) {
	    int youngestAge = 169;
	    int numYoungestPlayers = 0;
	    int longestUsernameLength = 0;
	    int numLongestUsernamePlayers = 0;
	    String lastUsername = "";
	    int numLastUsernamePlayers = 0;
	    Speler startSpeler = null;
	    for (Speler speler : spelers) {
	        if (speler.getLeeftijd() < youngestAge) {
	            youngestAge = speler.getLeeftijd();
	            numYoungestPlayers = 1;
	            startSpeler = speler;
	        } else if (speler.getLeeftijd() == youngestAge) {
	            numYoungestPlayers++;
	            if (numYoungestPlayers == 1) {
	                startSpeler = speler;
	            }
	        }
	        if (speler.getGebruikersnaam().length() > longestUsernameLength) {
	            longestUsernameLength = speler.getGebruikersnaam().length();
	            numLongestUsernamePlayers = 1;
	            startSpeler = speler;
	        } else if (speler.getGebruikersnaam().length() == longestUsernameLength) {
	            numLongestUsernamePlayers++;
	            if (numLongestUsernamePlayers == 1) {
	                startSpeler = speler;
	            }
	        }
	        String reversedUsername = new StringBuilder(speler.getGebruikersnaam()).reverse().toString();
	        if (reversedUsername.compareTo(lastUsername) > 0) {
	            lastUsername = reversedUsername;
	            numLastUsernamePlayers = 1;
	            startSpeler = speler;
	        } else if (reversedUsername.equals(lastUsername)) {
	            numLastUsernamePlayers++;
	            if (numLastUsernamePlayers == 1) {
	                startSpeler = speler;
	            }
	        }
	    }
	    return startSpeler;
	}



	public int telPuntenOp() {
		int punten = 0; 
		// implement punten toevoegen
		return punten;
	}

}