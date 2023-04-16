package domein;
import util.Edelen;
import util.ontwikkelingskaarten;
import java.util.*;

public class Spel {
	private static final int MIN_SPELERS = 2;
	private static final int MAX_SPELERS = 4;
	private int startspelerIndex;
	HashMap<Edelsteen, Integer> edelstenen;
	ArrayList<Speler> spelers;
	ArrayList<Edel> edelen;
	List<Ontwikkelingskaart> ontwikkelingsKaarten;
	private int spelerIndex;
	List<Ontwikkelingskaart> Niveau1Kaarten;
	List<Ontwikkelingskaart> Niveau2Kaarten;
	List<Ontwikkelingskaart> Niveau3Kaarten;


	public Spel() {
		spelers = new ArrayList<Speler>();
	}
	
	public void startSpel() {
		// domeinregel voor max en min spelers.
 		if (spelers.size() < MIN_SPELERS || spelers.size() > MAX_SPELERS) {
 			throw new IllegalArgumentException("Het aantal spelers moet tussen " + MIN_SPELERS + " en " + MAX_SPELERS + " zijn.");
 		}
 		setAlleEdelstenen(spelers.size());
	}

	public void voegSpelerToe(String naam, int geboortejaar) {
	    if (spelers.size() <= 4) {
	    	Speler speler = new Speler(naam,geboortejaar);
	        spelers.add(speler);
	    } else {
	        throw new IllegalArgumentException("Er kunnen maximaal 4 spelers meedoen.");
	    }
	 		
	}
	
	public void setStartspelerIndex() {
		startspelerIndex = getStartSpelerIndex(spelers);
		spelerIndex = startspelerIndex;
	}
	
	
	public void volgendeSpeler() {
		spelerIndex = (spelerIndex + 1) % spelers.size();
	}
	
	//public String[] getEdelsteenfiches(int spelerIndex) {
		//gems = new Edelsteenfiche(spelerIndex);
		//return gems.getSoort();
	//}
	
	public int getStartSpelerIndex(ArrayList<Speler> spelers) {
	    int youngestAge = 169;
	    int numYoungestPlayers = 0;
//	    int longestUsernameLength = 0;
//	    int numLongestUsernamePlayers = 0;
//	    String lastUsername = "";
//	    int numLastUsernamePlayers = 0;
	    int startSpelerIndex = -1;
	    for (int i = 0; i < spelers.size(); i++) {
	        Speler speler = spelers.get(i);
	        if (speler.getLeeftijd() < youngestAge) {
	            youngestAge = speler.getLeeftijd();
	            numYoungestPlayers = 1;
	            startSpelerIndex = i;
	        } else if (speler.getLeeftijd() == youngestAge) {
	            numYoungestPlayers++;
	            if (numYoungestPlayers == 1) {
	                startSpelerIndex = i;
	            }
	        }
//	        else if (speler.getGebruikersnaam().length() > longestUsernameLength) {
//	            longestUsernameLength = speler.getGebruikersnaam().length();
//	            numLongestUsernamePlayers = 1;
//	            startSpelerIndex = i;
//	        } else if (speler.getGebruikersnaam().length() == longestUsernameLength) {
//	            numLongestUsernamePlayers++;
//	            if (numLongestUsernamePlayers == 1) {
//	                startSpelerIndex = i;
//	            }
//	        }
//	        else {
//	        String reversedUsername = new StringBuilder(speler.getGebruikersnaam()).reverse().toString();
//	        if (reversedUsername.compareTo(lastUsername) > 0) {
//	            lastUsername = reversedUsername;
//	            numLastUsernamePlayers = 1;
//	            startSpelerIndex = i;
//	        } else if (reversedUsername.equals(lastUsername)) {
//	            numLastUsernamePlayers++;
//	            if (numLastUsernamePlayers == 1) {
//	                startSpelerIndex = i;
//	            }
//	        }
//	       }
	    }
	    return startSpelerIndex;
	}
	public HashMap<Edelsteen, Integer> getAlleEdelstenen(){
		return this.edelstenen;
	}
	
	
	public void setAlleEdelstenen(int spelerIndex) {
		edelstenen = new HashMap<Edelsteen, Integer>();
		int aantal = 4;
		switch (spelerIndex) {
	    case 3:
	        aantal = 5;
	        break;
	    case 4:
	        aantal = 7;
	        break;
	        }
		edelstenen.put(Edelsteen.SMARAGDEN, aantal);
	    edelstenen.put(Edelsteen.DIAMANTEN, aantal);
        edelstenen.put(Edelsteen.SAFFIEREN, aantal);
        edelstenen.put(Edelsteen.ONYXEN, aantal);
        edelstenen.put(Edelsteen.ROBIJNEN, aantal);
	}
	
	public String getSpelersOverzicht() {
	    StringBuilder sb = new StringBuilder();
	    int i = 1;
	    for (Speler speler : spelers) {
	        sb.append("Speler ").append(i).append(": ")
	            .append(speler.getGebruikersnaam()).append(", ")
	            .append(speler.getGeboortejaar());
	        if (i == startspelerIndex+1) {
	            sb.append(" (startspeler)");
	        }
	        sb.append("     Edelsteenfiches in inventory: ");
			for (Map.Entry<Edelsteen, Integer> entry : speler.getEdelstenenInventory().entrySet()) {
		        sb.append(entry.getKey() + " " + entry.getValue() + "\n");
		    }
	        sb.append("\n");
	        i++;
	    }
	    return sb.toString();
	}
	
	public String edelstenenOverzicht() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Beschikbare edelstenen:\n");
	    for (Map.Entry<Edelsteen, Integer> entry : edelstenen.entrySet()) {
	        sb.append(entry.getKey() + " " + entry.getValue() + "\n");
	    }
	    return sb.toString();
	}
		    
	 public String toonOntwikkelingskaartenOverzicht() {
		    StringBuilder sb = new StringBuilder();
		    sb.append("Niveau 1 kaarten:\n");
		    for (Ontwikkelingskaart kaart : Niveau1Kaarten) {
		        sb.append("kaart nummer: " + kaart.getKaartnummer() + ": ");
		        sb.append("\tbonus edelsteen: " + kaart.getBonus());
		        sb.append(",         punt(en): " + kaart.getPunten());
		        sb.append(",         prijs: ");
		        Edelsteen[] prijs = kaart.getPrijs();
		        Map<Edelsteen, Integer> gemQuantities = new HashMap<>();
		        for (Edelsteen edelsteen : prijs) {
		            gemQuantities.put(edelsteen, gemQuantities.getOrDefault(edelsteen, 0) + 1);
		        }
		        boolean first = true;
		        for (Map.Entry<Edelsteen, Integer> entry : gemQuantities.entrySet()) {
		            if (!first) {
		                sb.append(" ");
		            }
		            sb.append(entry.getValue() + " " + entry.getKey().toString());
		            first = false;
		        	}
		        sb.append("\n");
		        }
		    	sb.append("\n");
		        sb.append("Niveau 2 kaarten:\n");
		        for (Ontwikkelingskaart kaart2 : Niveau2Kaarten) {
			        sb.append("kaart nummer: " + kaart2.getKaartnummer() + ": ");
			        sb.append("\tbonus edelsteen: " + kaart2.getBonus());
			        sb.append(",         punt(en): " + kaart2.getPunten());
			        sb.append(",         prijs: ");
			        Edelsteen[] prijs2 = kaart2.getPrijs();
			        Map<Edelsteen, Integer> gemQuantities2 = new HashMap<>();
			        for (Edelsteen edelsteen : prijs2) {
			            gemQuantities2.put(edelsteen, gemQuantities2.getOrDefault(edelsteen, 0) + 1);
			        }
			        boolean first2 = true;
			        for (Map.Entry<Edelsteen, Integer> entry : gemQuantities2.entrySet()) {
			            if (!first2) {
			                sb.append(" ");
			            }
			            sb.append(entry.getValue() + " " + entry.getKey().toString());
			            first2 = false;
			        }
			        sb.append("\n");
		        }
		        sb.append("\n");
			     sb.append("Niveau 3 kaarten:\n");
			     for (Ontwikkelingskaart kaart3 : Niveau1Kaarten) {
				        sb.append("kaart nummer: " + kaart3.getKaartnummer() + ": ");
				        sb.append("\tbonus edelsteen: " + kaart3.getBonus());
				        sb.append(",         punt(en): " + kaart3.getPunten());
				        sb.append(",         prijs: ");
				        Edelsteen[] prijs3 = kaart3.getPrijs();
				        Map<Edelsteen, Integer> gemQuantities3 = new HashMap<>();
				        for (Edelsteen edelsteen : prijs3) {
				            gemQuantities3.put(edelsteen, gemQuantities3.getOrDefault(edelsteen, 0) + 1);
				        }
				        boolean first3 = true;
				        for (Map.Entry<Edelsteen, Integer> entry : gemQuantities3.entrySet()) {
				            if (!first3) {
				                sb.append(" ");
				            }
				            sb.append(entry.getValue() + " " + entry.getKey().toString());
				            first3 = false;
				        }
				        sb.append("\n");
			     	}
			     sb.append("\n");
		    return sb.toString();
		        }
		    
		
	 public String getEdelen() {
		 Edelen edelen = new Edelen();
		 List<Edel> edel = edelen.getEdelen();
		 StringBuilder sb = new StringBuilder();
		 sb.append(setEdelen(edel,5));
		 return sb.toString();
	 }
	 
	 private String setEdelen(List<Edel> edelen, int count) {
		 Collections.shuffle(edelen);
		 List<Edel> selected = edelen.subList(0, count);
		 StringBuilder sb = new StringBuilder();
		 for(Edel edel : selected) {
			 sb.append("Edel nummer: "+edel.getEdelNummer()+": ");
			 sb.append("\tpunten: "+edel.getPunten());
			 sb.append("         prijs: ");
			 Edelsteen[] prijs = edel.getPrijs();
		        Map<Edelsteen, Integer> gemQuantities = new HashMap<>();
		        for (Edelsteen edelsteen : prijs) {
		            gemQuantities.put(edelsteen, gemQuantities.getOrDefault(edelsteen, 0) + 1);
		        }
		        boolean first = true;
		        for (Map.Entry<Edelsteen, Integer> entry : gemQuantities.entrySet()) {
		            if (!first) {
		                sb.append(" ");
		            }
		            sb.append(entry.getValue() + " " + entry.getKey().toString());
		            first = false;
		        }
		        sb.append("\n");
		 }
		 return sb.toString();
	 }
	 
	 public void neem_1_Edelsteen(Edelsteen edelsteen, int aantal) {
		 int currentAantal = edelstenen.get(edelsteen);
		 if(currentAantal>= aantal && aantal == 1) {
			 edelstenen.put(edelsteen, currentAantal - aantal);
		 }
		 spelers.get(spelerIndex).voegGemsToeAanInventory(edelsteen, aantal);
	 }
	 		
	 public void neem_2_Edelstenen(Edelsteen edelsteen, int aantal) {
		 int currentAantal = edelstenen.get(edelsteen);
		 if(currentAantal>= 4 && aantal == 2) {
			 edelstenen.put(edelsteen, currentAantal - aantal);
		 }
		 else {
			 throw new IllegalArgumentException("Je mag enkel 1 edelsteen pakken als er minder dan 4 edelstenen zijn !"); 
		 }
		 spelers.get(spelerIndex).voegGemsToeAanInventory(edelsteen, aantal);
	 }
	 
	 public int telPuntenOp() {
		 return spelers.get(spelerIndex).telPuntenOp();
	 }
	 
	 public String getSpelerAanDeBeurtNaam() {
		 return spelers.get(spelerIndex).getGebruikersnaam();
	 }
	 
	 
	 public void koopOntwikkelingskaart(int kaartnummer) {
		 //TODO
		 // check of speler genoeg Edelstenen heeft om kaart te kopen 
		 // verwijder kaart van lijst en voeg een andere random kaart toe 
		 // voeg de kaart toe aan inventory van speler 
	 }
	 
	 
	 private List<Ontwikkelingskaart> getRandomKaarten(List<Ontwikkelingskaart> kaarten, int count){
		 	Collections.shuffle(kaarten);
		    List<Ontwikkelingskaart> selected = kaarten.subList(0, count);
		    return selected;
	 }
	 
	 public void setOntwikkelingsKaartenOverzicht () {
		 ontwikkelingskaarten kaarten = new ontwikkelingskaarten();
	        List<Ontwikkelingskaart> niveau1Kaarten = kaarten.getNiveau1Kaarten();
	        List<Ontwikkelingskaart> niveau2Kaarten = kaarten.getNiveau2Kaarten();
	        List<Ontwikkelingskaart> niveau3Kaarten = kaarten.getNiveau3Kaarten();
		 Niveau1Kaarten = new ArrayList<>();
		 Niveau2Kaarten = new ArrayList<>();
		 Niveau3Kaarten = new ArrayList<>();
		 Niveau1Kaarten = getRandomKaarten(niveau1Kaarten, 4);
		 Niveau2Kaarten = getRandomKaarten(niveau2Kaarten, 4);
		 Niveau3Kaarten = getRandomKaarten(niveau3Kaarten, 4);
	 }

}

