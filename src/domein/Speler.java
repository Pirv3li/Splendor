package domein;

import java.util.*;

public class Speler {

	private ArrayList<Ontwikkelingskaart> ontwikkelingsKaarten;
	private HashMap<Edelsteen, Integer> edelsteenfichesInventory;
	private String gebruikersnaam;
	private int geboortejaar;
	private int leeftijd;
	private int punten;
	private HashMap<Edelsteen, Integer> bonusEdelsteenfichesInventory;
	private ArrayList<Edel> edelen;
	
	public Speler(String gebruikersnaam, int geboortejaar) {
		setGebruikersnaam(gebruikersnaam);
		setGeboortejaar(geboortejaar);
		edelsteenfichesInventory = new HashMap<>(Map.of(
			    Edelsteen.DIAMANTEN, 0,
			    Edelsteen.SAFFIEREN, 0,
			    Edelsteen.SMARAGDEN, 0,
			    Edelsteen.ROBIJNEN, 0,
			    Edelsteen.ONYXEN, 0
			));
		ontwikkelingsKaarten = new ArrayList<>();
		bonusEdelsteenfichesInventory = new HashMap<>(Map.of(
			    Edelsteen.DIAMANTEN, 0,
			    Edelsteen.SAFFIEREN, 0,
			    Edelsteen.SMARAGDEN, 0,
			    Edelsteen.ROBIJNEN, 0,
			    Edelsteen.ONYXEN, 0
			));
		edelen = new ArrayList<>();

	}

	public String getGebruikersnaam() {
		return this.gebruikersnaam;
	}
	
	public void setGebruikersnaam(String gebruikersnaam) {
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

	public void setGeboortejaar(int geboortejaar) {
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
	
	
	
	public void voegGemsToeAanBonusInventory(Edelsteen edelsteen) {
		int currentValue = this.bonusEdelsteenfichesInventory.getOrDefault(edelsteen, 0);
		int newValue = currentValue + 1;
		this.bonusEdelsteenfichesInventory.put(edelsteen, newValue);
	}
	
	public HashMap<Edelsteen, Integer> getBonusEdelstenenInventory(){ 
		return this.bonusEdelsteenfichesInventory;
	}
	
	
	public void voegGemsToeAanInventory(Edelsteen edelsteen, int aantal) {
		int totalGems = 0;
		for (int count : edelsteenfichesInventory.values()) {
		    totalGems += count;
		}
		if(totalGems<13) {
		// Get the current value for the given Edelsteen
		int currentValue = this.edelsteenfichesInventory.getOrDefault(edelsteen, 0);

		// Add the specified aantal to the current value
		int newValue = currentValue + aantal;

		// Update the HashMap with the new value
		this.edelsteenfichesInventory.put(edelsteen, newValue);
		}
		else {
			throw new IllegalArgumentException("uw Inventory is vol");
		}

	}
	
	public void voegOntwikkelingskaartToeAanInventory(Ontwikkelingskaart ontwikkelingskaart) {
		this.ontwikkelingsKaarten.add(ontwikkelingskaart);
	}
	
	public ArrayList<Ontwikkelingskaart> getOntwikkelingskaartenInventory(){
		return this.ontwikkelingsKaarten;
	}
	
	public HashMap<Edelsteen, Integer> getEdelstenenInventory(){ 
		return this.edelsteenfichesInventory;
	}
	
	public void voegEdelenAanInventory(Edel edel) {
		this.edelen.add(edel);
	}
	
	public ArrayList<Edel> getEdelInventory(){
		return this.edelen;
	}
	
	public int telPuntenOp() {
		int sum = 0;
		for (Ontwikkelingskaart Ontwikkelingskaart : ontwikkelingsKaarten) {
			sum += Ontwikkelingskaart.getPunten();
		}
		for(Edel edelen : edelen) {
			sum += edelen.getPunten();
		}
		this.punten = sum;
		return punten;
	}

}