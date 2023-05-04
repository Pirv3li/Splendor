package domein;
import util.Edelen;
import util.ontwikkelingskaarten;

import java.io.IOException;
import java.util.*;

public class Spel {
	private static final int MIN_SPELERS = 2;
	private static final int MAX_SPELERS = 4;
	private int startspelerIndex;
	private HashMap<Edelsteen, Integer> edelstenen;
	private ArrayList<Speler> spelers;
	private List<Edel> edelen;
//	private List<Ontwikkelingskaart> ontwikkelingsKaarten;
	private int spelerIndex;
	private List<Ontwikkelingskaart> Niveau1Kaarten;
	private List<Ontwikkelingskaart> Niveau2Kaarten;
	private List<Ontwikkelingskaart> Niveau3Kaarten;
	private int niveau1StapelSize;
	private int niveau2StapelSize;
	private int niveau3StapelSize;


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
	
	public List<Ontwikkelingskaart> getNiveau1Kaarten(){
		return this.Niveau1Kaarten;
	}
	
	public List<Ontwikkelingskaart> getNiveau2Kaarten(){
		return this.Niveau2Kaarten;
	}
	
	public List<Ontwikkelingskaart> getNiveau3Kaarten(){
		return this.Niveau3Kaarten;
	}
	
	public void setStartspelerIndex() {
		startspelerIndex = getStartSpelerIndex(spelers);
		spelerIndex = startspelerIndex;
	}
	
	
	public void volgendeSpeler() {
		spelerIndex = (spelerIndex + 1) % spelers.size();
	}
	
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
	
	public HashMap<Edelsteen, Integer> getEdelstenen(){
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
	        sb.append("     prestigepunten : "+speler.telPuntenOp());
	        sb.append("     Edelsteenfiches in inventory: ");
			for (Map.Entry<Edelsteen, Integer> entry : speler.getEdelstenenInventory().entrySet()) {
		        sb.append(entry.getKey() + " " + entry.getValue() + ", ");
		    }
			sb.append("     bonus edelsteenfiches in inventory: ");
			for (Map.Entry<Edelsteen, Integer> entry : speler.getBonusEdelstenenInventory().entrySet()) {
		        sb.append(entry.getKey() + " " + entry.getValue() + ", ");
		    }
			sb.append("     Ontwikkelingskaarten in inventory: ");
	        for (Ontwikkelingskaart kaart : speler.getOntwikkelingskaartenInventory()) {
	            sb.append(kaart.getKaartnummer()).append(", ");
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
			     for (Ontwikkelingskaart kaart3 : Niveau3Kaarten) {
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
		    
	 
	 public String toonEdelenOverzicht() {
		 StringBuilder sb = new StringBuilder();
		 for(Edel edel : edelen) {
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
	 
	 public int getStapelSizeNiveau1() {
		 return this.niveau1StapelSize;
	 }
	 
	 public int getStapelSizeNiveau2() {
		 return this.niveau2StapelSize;
	 }
	 
	 public int getStapelSizeNiveau3() {
		 return this.niveau3StapelSize;
	 }
	 
	 
	 public void koopOntwikkelingskaart(int kaartnummer) throws IOException {
		 Random random = new Random();
		 ontwikkelingskaarten kaarten = new ontwikkelingskaarten();
		 int randomIndexNiveau1 = random.nextInt(kaarten.getNiveau1Kaarten().size());
		 int randomIndexNiveau2 = random.nextInt(kaarten.getNiveau2Kaarten().size());
		 int randomIndexNiveau3 = random.nextInt(kaarten.getNiveau3Kaarten().size());
		 List<Ontwikkelingskaart> alleOverzichtKaarten = new ArrayList<>();
		 alleOverzichtKaarten.addAll(Niveau1Kaarten);
		 alleOverzichtKaarten.addAll(Niveau2Kaarten);
		 alleOverzichtKaarten.addAll(Niveau3Kaarten);
		 Ontwikkelingskaart gekozenOntwikkelingskaart = null;
		 for(int i=0; i<alleOverzichtKaarten.size(); i++) {
		 if(alleOverzichtKaarten.get(i).getKaartnummer()==kaartnummer) {
			 	gekozenOntwikkelingskaart = alleOverzichtKaarten.get(i);
		 	}
		 }
		 HashMap<Edelsteen, Integer> edelstenenInventory = spelers.get(spelerIndex).getEdelstenenInventory();
		 HashMap<Edelsteen, Integer> bonusedelstenenInventory = spelers.get(spelerIndex).getBonusEdelstenenInventory(); 
		 Edelsteen[] prijsInArray = gekozenOntwikkelingskaart.getPrijs();
		 HashMap<Edelsteen, Integer> prijs = new HashMap<>();

		// Loop over the array and update the counts in the HashMap
		for (Edelsteen element : prijsInArray) {
		    if (prijs.containsKey(element)) {
		        // Increment the count if the element is already in the HashMap
		        prijs.put(element, prijs.get(element) + 1);
		    } else {
		        // Add the element to the HashMap with a count of 1 if it's not already in there
		        prijs.put(element, 1);
		    }
		}
		if(HeeftGenoegEdelstenenOfNietOmKaartTeKopen(prijs,edelstenenInventory,bonusedelstenenInventory)) {
			if (gekozenOntwikkelingskaart.getNiveau() == 1) {
	            Niveau1Kaarten.remove(gekozenOntwikkelingskaart);
	            kaarten.getNiveau1Kaarten().remove(gekozenOntwikkelingskaart.getKaartnummer()-1);
	            Ontwikkelingskaart randomCard1 = kaarten.getNiveau1Kaarten().get(randomIndexNiveau1);
	            Niveau1Kaarten.add(randomCard1);
	            this.niveau1StapelSize -= 1;
	        } else if (gekozenOntwikkelingskaart.getNiveau() == 2) {
	            Niveau2Kaarten.remove(gekozenOntwikkelingskaart);
	            kaarten.getNiveau2Kaarten().remove(gekozenOntwikkelingskaart.getKaartnummer()-1);
	            Ontwikkelingskaart randomCard2 = kaarten.getNiveau2Kaarten().get(randomIndexNiveau2);
	            Niveau2Kaarten.add(randomCard2);
	            this.niveau2StapelSize -= 1;
	        } else {
	            Niveau3Kaarten.remove(gekozenOntwikkelingskaart);
	            kaarten.getNiveau3Kaarten().remove(gekozenOntwikkelingskaart.getKaartnummer()-1);
	            Ontwikkelingskaart randomCard3 = kaarten.getNiveau3Kaarten().get(randomIndexNiveau3);
	            Niveau3Kaarten.add(randomCard3);
	            this.niveau3StapelSize -= 1;
	        }
			spelers.get(spelerIndex).voegOntwikkelingskaartToeAanInventory(gekozenOntwikkelingskaart);
			spelers.get(spelerIndex).voegGemsToeAanBonusInventory(gekozenOntwikkelingskaart.getBonus());

		}
	 }
	 
	 private boolean HeeftGenoegEdelstenenOfNietOmKaartTeKopen(HashMap<Edelsteen, Integer> kaartPrijs, HashMap<Edelsteen, Integer> spelerInventory, HashMap<Edelsteen, Integer> bonusInventory) {
		    // Iterate over the required gem prices of the card
		    for (Edelsteen edelsteen : kaartPrijs.keySet()) {
		        int requiredCount = kaartPrijs.get(edelsteen);
		        int playerCount = spelerInventory.getOrDefault(edelsteen, 0); 
		        int bonusCount = bonusInventory.getOrDefault(edelsteen, 0);
		        if (requiredCount > (playerCount + bonusCount)) {
		            throw new IllegalArgumentException("U heeft niet genoeg Edelstenen om deze ontwikkelingskaart te kopen!");
		        }
		        else {
		            if (bonusCount >= requiredCount) {
		            	int edelsteenCount = edelstenen.getOrDefault(edelsteen, 0);
				        edelstenen.put(edelsteen, edelsteenCount + requiredCount);
		            	return true;
		            } 
		            else if(bonusCount < requiredCount && bonusCount + playerCount == requiredCount) {
		                spelerInventory.put(edelsteen, 0);
		            }
		            else if(bonusCount < requiredCount && bonusCount + playerCount > requiredCount) {
		            		spelerInventory.put(edelsteen, playerCount - requiredCount);
		            }
		            int edelsteenCount = edelstenen.getOrDefault(edelsteen, 0);
		            edelstenen.put(edelsteen, edelsteenCount + requiredCount);
		        }
		    }
		    return true;
		}
	 
	 private boolean heeftGenoegBonusEdelstenenOmEdelTeNemen (HashMap<Edelsteen, Integer> edelPrijs, HashMap<Edelsteen,Integer> bonusInventory) {
		 for (Edelsteen edelsteen : edelPrijs.keySet()) {
		        int requiredCount = edelPrijs.get(edelsteen);
		        int bonusCount = bonusInventory.getOrDefault(edelsteen, 0);
		        if (requiredCount > bonusCount) {
		        	return false;
		        	}
		       
		        }
		 return true;
	 }
	 
	 public void neemEdelAlsSpelerGenoegBonusEdelstenenHeeft() {
		 HashMap<Edelsteen,Integer> bonusInventory = spelers.get(spelerIndex).getBonusEdelstenenInventory();
		 Random random = new Random();
		 Edelen utilEdelen = null;
		try {
			utilEdelen = new Edelen();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 int randomEdel = random.nextInt(utilEdelen.getEdelen().size());
		 for(int i=0; i<edelen.size(); i++) {
		 Edelsteen[] prijsInArray = edelen.get(i).getPrijs();
		 HashMap<Edelsteen,Integer> prijs = new HashMap<>();
		 for (Edelsteen element : prijsInArray) {
			    if (prijs.containsKey(element)) {
			        prijs.put(element, prijs.get(element) + 1);
			    } else {
			        prijs.put(element, 1);
			    }
			}
		 if(heeftGenoegBonusEdelstenenOmEdelTeNemen(prijs,bonusInventory)) {
			 spelers.get(spelerIndex).voegEdelenAanInventory(edelen.get(i));
			 edelen.remove(i);
			 utilEdelen.getEdelen().remove(i);
			 edelen.add(utilEdelen.getEdelen().get(randomEdel));
		 	}
		 }
		 
	 }
	 
	 public ArrayList<String> getSpelerNamen(){
		 ArrayList<String> spelerNamen = new ArrayList<>();
		 for(int i = 0 ; i<spelers.size() ; i++) {
			 spelerNamen.add(spelers.get(i).getGebruikersnaam());
		 }
		 return spelerNamen;
	 }
	 
	 public List<Edel> getEdelen(){
		 return this.edelen;
	 }
	 
	 private List<Edel> getRandomEdelen(List<Edel> edelen, int count){
		 Collections.shuffle(edelen);
		 List<Edel> selected = edelen.subList(0, count);
		 return selected;
	 }
	 
	 public void setEdelenOverzicht() {
		 Edelen edelen = null;
		try {
			edelen = new Edelen();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 this.edelen = new ArrayList<>();
		 List<Edel> edelenOverzicht = edelen.getEdelen();
		 this.edelen = getRandomEdelen(edelenOverzicht,5);
	 }
	 
	 private List<Ontwikkelingskaart> getRandomKaarten(List<Ontwikkelingskaart> kaarten, int count){
		 	Collections.shuffle(kaarten);
		    List<Ontwikkelingskaart> selected = kaarten.subList(0, count);
		    return selected;
	 }
	 
	 public void setOntwikkelingsKaartenOverzicht () throws IOException {
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
		 this.niveau1StapelSize = niveau1Kaarten.size() - 4;
		 this.niveau2StapelSize = niveau2Kaarten.size() - 4;
		 this.niveau3StapelSize = niveau3Kaarten.size() - 4;
	 }

}