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
	private int spelerIndex;
	private List<Ontwikkelingskaart> Niveau1Kaarten;
	private List<Ontwikkelingskaart> Niveau2Kaarten;
	private List<Ontwikkelingskaart> Niveau3Kaarten;
	private int niveau1StapelSize;
	private int niveau2StapelSize;
	private int niveau3StapelSize;
	ontwikkelingskaarten kaarten;
	private int edelstenenCount;
	private ResourceBundle bundle;


	public Spel() {
		spelers = new ArrayList<Speler>();
		try {
			kaarten = new ontwikkelingskaarten();
		} catch (IOException e) {
			e.printStackTrace();
			initialize();
		}
	}
	
	public void startSpel() {
 		if (spelers.size() < MIN_SPELERS || spelers.size() > MAX_SPELERS) {
 			throw new IllegalArgumentException(bundle.getString("spelerAantal"));
 		}
 		setAlleEdelstenen(spelers.size());
	}

	public void voegSpelerToe(String naam, int geboortejaar) {
	    if (spelers.size() <= 4) {
	    	Speler speler = new Speler(naam,geboortejaar);
	        spelers.add(speler);
	    } else {
	        throw new IllegalArgumentException(bundle.getString("max"));
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
	    int startSpelerIndex = -1;
	    for (int i = 0; i < spelers.size(); i++) {
	        Speler speler = spelers.get(i);
	        if (speler.getLeeftijd() < youngestAge) {
	            youngestAge = speler.getLeeftijd();
	            startSpelerIndex = i;
	        } else if (speler.getLeeftijd() == youngestAge) {
	            if (spelers.get(startSpelerIndex).getGebruikersnaam().length() < speler.getGebruikersnaam().length()) {
	                startSpelerIndex = i;
	            } else if (spelers.get(startSpelerIndex).getGebruikersnaam().length() == speler.getGebruikersnaam().length()) {
	                String currentUsername = spelers.get(startSpelerIndex).getGebruikersnaam();
	                String newUsername = speler.getGebruikersnaam();
	                if (newUsername.compareToIgnoreCase(currentUsername) > 0) {
	                    startSpelerIndex = i;
	                }
	            }
	        }
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
	        sb.append(bundle.getString("uiSpeler")).append(" ").append(i).append(": ")
	            .append(speler.getGebruikersnaam()).append(", ")
	            .append(speler.getGeboortejaar());
	        if (i == startspelerIndex+1) {
	            sb.append(" (startspeler)");
	        }
	        sb.append("     "+bundle.getString("uiPrestige")+speler.telPuntenOp());
	        sb.append("     "+bundle.getString("uiInv"));
			for (Map.Entry<Edelsteen, Integer> entry : speler.getEdelstenenInventory().entrySet()) {
		        sb.append(entry.getKey() + " " + entry.getValue() + ", ");
		    }
			sb.append("     "+ bundle.getString("uiBonusInv"));
			for (Map.Entry<Edelsteen, Integer> entry : speler.getBonusEdelstenenInventory().entrySet()) {
		        sb.append(entry.getKey() + " " + entry.getValue() + ", ");
		    }
			sb.append("     "+bundle.getString("uiKaartInv"));
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
	    sb.append(bundle.getString("uiGemBesch")+"\n");
	    for (Map.Entry<Edelsteen, Integer> entry : edelstenen.entrySet()) {
	        sb.append(entry.getKey() + " " + entry.getValue() + "\n");
	    }
	    return sb.toString();
	}
		    
	 public String toonOntwikkelingskaartenOverzicht() {
		    StringBuilder sb = new StringBuilder();
		    sb.append(bundle.getString("niv1")+"\n");
		    for (Ontwikkelingskaart kaart : Niveau1Kaarten) {
		    	sb.append(bundle.getString("uiKaartnum") + kaart.getKaartnummer() + ": ");
		    	sb.append("\t"+ bundle.getString("uiBonus") + kaart.getBonus());
		    	sb.append(",         "+bundle.getString("uiPunt") + kaart.getPunten());
		    	sb.append(",         "+bundle.getString("uiCost"));
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
		        sb.append(bundle.getString("niv2")+"\n");
		        for (Ontwikkelingskaart kaart2 : Niveau2Kaarten) {
			        sb.append(bundle.getString("uiKaartnum") + kaart2.getKaartnummer() + ": ");
			        sb.append("\t"+ bundle.getString("uiBonus") + kaart2.getBonus());
			        sb.append(",         "+bundle.getString("uiPunt") + kaart2.getPunten());
			        sb.append(",         "+bundle.getString("uiCost"));
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
			     sb.append(bundle.getString("niv3")+"\n");
			     for (Ontwikkelingskaart kaart3 : Niveau3Kaarten) {
			    	 sb.append(bundle.getString("uiKaartnum") + kaart3.getKaartnummer() + ": ");
			    	 sb.append("\t"+ bundle.getString("uiBonus") + kaart3.getBonus());
			    	 sb.append(",         "+bundle.getString("uiPunt") + kaart3.getPunten());
			    	 sb.append(",         "+bundle.getString("uiCost"));
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
	 
	 public int getInventoryCount() {
		 return this.edelstenenCount;
	 }
		    
	 
	 public String toonEdelenOverzicht() {
		 StringBuilder sb = new StringBuilder();
		 for(Edel edel : edelen) {
			 sb.append(bundle.getString("uiEdelNum")+edel.getEdelNummer()+": ");
			 sb.append("\t"+ bundle.getString("score")+":"+edel.getPunten());
			 sb.append("         "+bundle.getString("uiCost"));
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
		 else {
			 throw new IllegalArgumentException(bundle.getString("notEnough"));
		 }
		 spelers.get(spelerIndex).voegGemsToeAanInventory(edelsteen, aantal);
		 edelstenenCount = spelers.get(spelerIndex).getEdelstenenInventory().values().stream().mapToInt(Integer::intValue).sum();
	 }
	 		
	 public void neem_2_Edelstenen(Edelsteen edelsteen, int aantal) {
		 int currentAantal = edelstenen.get(edelsteen);
		 if(currentAantal>= 4 && aantal == 2) {
			 edelstenen.put(edelsteen, currentAantal - aantal);
		 }
		 else {
			 throw new IllegalArgumentException(bundle.getString("less4")); 
		 }
		 spelers.get(spelerIndex).voegGemsToeAanInventory(edelsteen, aantal);
		 edelstenenCount = spelers.get(spelerIndex).getEdelstenenInventory().values().stream().mapToInt(Integer::intValue).sum();
	 }
	 
		public void zetEdelstenenTerugString(List<String> edelsteenStrings) {
			 if (edelsteenStrings == null || edelsteenStrings.isEmpty()) {
			        System.out.println(bundle.getString("keuze"));
			        return;
			    }
			    
			    List<Edelsteen> edelstenen = new ArrayList<>();
			    for (String edelsteenString : edelsteenStrings) {
			        try {
			            Edelsteen edelsteen = Edelsteen.valueOf(edelsteenString.toUpperCase());
			            edelstenen.add(edelsteen);
			        } catch (IllegalArgumentException e) {
			            System.out.println(bundle.getString("keuze"));
			            return;
			        }
			    }

				 if(edelstenenCount>10) {
					    if (edelstenen.size() == 1 && new HashSet<>(edelstenen).size() == 1) {
					        zetEdelstenenTerug(edelstenen.get(0),1);
					        return;
					    }
					    
					    if (edelstenen.size() == 2 && edelstenen.get(0).equals(edelstenen.get(1))) {
					        zetEdelstenenTerug(edelstenen.get(0), 1);
				            zetEdelstenenTerug(edelstenen.get(0), 1);
					        return;
					    }
					    
					    if (edelstenen.size() == 2 && new HashSet<>(edelstenen).size() == 2) {
					        zetEdelstenenTerug(edelstenen.get(0),1);
					        zetEdelstenenTerug(edelstenen.get(1),1);
					        return;
					    }
					    if (edelstenen.size() == 3 && new HashSet<>(edelstenen).size() == 3) {
					        zetEdelstenenTerug(edelstenen.get(0),1);
					        zetEdelstenenTerug(edelstenen.get(1),1);
					        zetEdelstenenTerug(edelstenen.get(2),1);
					        return;
					    }
					    
					    if (edelstenen.size() == 3) {
					        if (edelstenen.get(0).equals(edelstenen.get(1)) && !edelstenen.get(0).equals(edelstenen.get(2))) {
					            zetEdelstenenTerug(edelstenen.get(0), 1);
					            zetEdelstenenTerug(edelstenen.get(0), 1);
					            zetEdelstenenTerug(edelstenen.get(2), 1);
					            return;
					        }
					        if (edelstenen.get(0).equals(edelstenen.get(2)) && !edelstenen.get(0).equals(edelstenen.get(1))) {
					            zetEdelstenenTerug(edelstenen.get(0), 1);
					            zetEdelstenenTerug(edelstenen.get(0), 1);
					            zetEdelstenenTerug(edelstenen.get(1), 1);
					            return;
					        }
					        if (edelstenen.get(1).equals(edelstenen.get(2)) && !edelstenen.get(0).equals(edelstenen.get(1))) {
					            zetEdelstenenTerug(edelstenen.get(1), 1);
					            zetEdelstenenTerug(edelstenen.get(1), 1);
					            zetEdelstenenTerug(edelstenen.get(0), 1);
					            return;
					        }
					    }

				 }
			    
		}
	 
	 public void zetEdelstenenTerug(Edelsteen edelsteen, int aantal) {
		 int currentAantal = edelstenen.get(edelsteen);
		 int inventoryCurrentAantal = spelers.get(spelerIndex).getEdelstenenInventory().get(edelsteen);
		 if(inventoryCurrentAantal>=1) {
			 edelstenen.put(edelsteen, currentAantal + aantal);
			 spelers.get(spelerIndex).getEdelstenenInventory().put(edelsteen, inventoryCurrentAantal - aantal);
			 edelstenenCount = spelers.get(spelerIndex).getEdelstenenInventory().values().stream().mapToInt(Integer::intValue).sum();
		 }
		 else {
			 throw new IllegalArgumentException(bundle.getString("broke"));
		 }
	 }
	 
	 public ArrayList<Integer> telPuntenOp() {
		    ArrayList<Integer> punten = new ArrayList<Integer>();
		    for (Speler speler : spelers) {
		        punten.add(speler.telPuntenOp());
		    }
		    return punten;
		}
	 
	 public int getPuntenVoorUi() {
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
	 
	 public boolean isBuyable(int kaartnummer) {
		 HashMap<Edelsteen, Integer>inventory = spelers.get(spelerIndex).getEdelstenenInventory();
		 HashMap<Edelsteen, Integer>bonusInventory = spelers.get(spelerIndex).getBonusEdelstenenInventory();
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
		 Edelsteen[] prijsInArray = gekozenOntwikkelingskaart.getPrijs();
		 HashMap<Edelsteen, Integer> prijs = new HashMap<>();
		for (Edelsteen element : prijsInArray) {
		    if (prijs.containsKey(element)) {
		        prijs.put(element, prijs.get(element) + 1);
		    } else {
		        prijs.put(element, 1);
		    }
		}
	    for (Edelsteen edelsteen : prijs.keySet()) {
	        int requiredCount = prijs.get(edelsteen);
	        int playerCount = inventory.getOrDefault(edelsteen, 0); 
	        int bonusCount = bonusInventory.getOrDefault(edelsteen, 0);
	        if (requiredCount > (playerCount + bonusCount)) {
	            return false;
	        }
	    }
	    return true;
	 }
	 
	 
	 public void koopOntwikkelingskaart(int kaartnummer) throws IOException {
		    Random random = new Random();
		    int randomIndexNiveau1 = random.nextInt(kaarten.getNiveau1Kaarten().size()-1);
		    int randomIndexNiveau2 = random.nextInt(kaarten.getNiveau2Kaarten().size()-1);
		    int randomIndexNiveau3 = random.nextInt(kaarten.getNiveau3Kaarten().size()-1);
		    List<Ontwikkelingskaart> alleOverzichtKaarten = new ArrayList<>();
		    alleOverzichtKaarten.addAll(Niveau1Kaarten);
		    alleOverzichtKaarten.addAll(Niveau2Kaarten);
		    alleOverzichtKaarten.addAll(Niveau3Kaarten);
		    Ontwikkelingskaart gekozenOntwikkelingskaart = null;
		    for (int i = 0; i < alleOverzichtKaarten.size(); i++) {
		        if (alleOverzichtKaarten.get(i).getKaartnummer() == kaartnummer) {
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
		    if (HeeftGenoegEdelstenenOfNietOmKaartTeKopen(prijs, edelstenenInventory, bonusedelstenenInventory)) {
		        if (gekozenOntwikkelingskaart.getNiveau() == 1) {
		            Niveau1Kaarten.remove(gekozenOntwikkelingskaart);
		            Ontwikkelingskaart randomCard1 = kaarten.getNiveau1Kaarten().get(randomIndexNiveau1);
		            kaarten.getNiveau1Kaarten().remove(randomCard1);
		            if(this.niveau1StapelSize>0) {
		            Niveau1Kaarten.add(randomCard1);
		            this.niveau1StapelSize -= 1;
		            }
		        } else if (gekozenOntwikkelingskaart.getNiveau() == 2) {
		            Niveau2Kaarten.remove(gekozenOntwikkelingskaart);
		            Ontwikkelingskaart randomCard2 = kaarten.getNiveau2Kaarten().get(randomIndexNiveau2);
		            kaarten.getNiveau2Kaarten().remove(randomCard2);
		            if(this.niveau1StapelSize>0) {
		            Niveau2Kaarten.add(randomCard2);
		            this.niveau2StapelSize -= 1;
		            }
		        } else {
		            Niveau3Kaarten.remove(gekozenOntwikkelingskaart);
		            Ontwikkelingskaart randomCard3 = kaarten.getNiveau3Kaarten().get(randomIndexNiveau3);
		            kaarten.getNiveau3Kaarten().remove(randomCard3);
		            if(this.niveau3StapelSize>0) {
		            Niveau3Kaarten.add(randomCard3);
		            this.niveau3StapelSize -= 1;
		            }
		        }
		        spelers.get(spelerIndex).voegOntwikkelingskaartToeAanInventory(gekozenOntwikkelingskaart);
		        spelers.get(spelerIndex).voegGemsToeAanBonusInventory(gekozenOntwikkelingskaart.getBonus());
		    }
		}
	 
	 private boolean HeeftGenoegEdelstenenOfNietOmKaartTeKopen(HashMap<Edelsteen, Integer> kaartPrijs, HashMap<Edelsteen, Integer> spelerInventory, HashMap<Edelsteen, Integer> bonusInventory) {
		 boolean cardPurchased = false; 
		 for (Edelsteen edelsteen : kaartPrijs.keySet()) {
		     int requiredCount = kaartPrijs.get(edelsteen);
		     int playerCount = spelerInventory.getOrDefault(edelsteen, 0);
		     int bonusCount = bonusInventory.getOrDefault(edelsteen, 0);

		     if (requiredCount > (playerCount + bonusCount)) {
		         throw new IllegalArgumentException(bundle.getString("broke"));
		     }
		     else {
		         int edelsteenCount = edelstenen.getOrDefault(edelsteen, 0);
		         int remainingRequiredCount = requiredCount;

		         if (bonusCount >= requiredCount) {
		             remainingRequiredCount = 0;
		             cardPurchased = true;
		         } 
		         else if(bonusCount < requiredCount) {
		             remainingRequiredCount -= bonusCount;
		             spelerInventory.put(edelsteen, playerCount - remainingRequiredCount);
		             edelstenen.put(edelsteen, edelsteenCount + remainingRequiredCount);
		             cardPurchased = true; 
		         }
		     }
		 }

		 return cardPurchased;
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
		 Edelen utilEdelen = null;
		try {
			utilEdelen = new Edelen();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
		 	}
		 }
		 
	 }
	 
	 public List<Integer> getEdelstenenInventory(){
		    List<Integer> inventory = new ArrayList<>();
		    for (Edelsteen gem : Edelsteen.values()) {
		        inventory.add(spelers.get(spelerIndex).getEdelstenenInventory().get(gem));
		    }
		    return inventory;
		}

		public List<Integer> getBonusEdelstenenInventory(){
		    List<Integer> inventory = new ArrayList<>();
		    for (Edelsteen gem : Edelsteen.values()) {
		        inventory.add(spelers.get(spelerIndex).getBonusEdelstenenInventory().get(gem));
		    }
		    return inventory;
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
		 if(spelers.size()==2) {
		 this.edelen = getRandomEdelen(edelenOverzicht,3);
		 }
		 if(spelers.size()==3) {
			 this.edelen = getRandomEdelen(edelenOverzicht,4);
			 }
		 if(spelers.size()==4) {
			 this.edelen = getRandomEdelen(edelenOverzicht,5);
			 }
		 
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
	 
	 public void initialize() {
	        Locale currentLocale = Locale.getDefault();
	        bundle = ResourceBundle.getBundle("resources/messages", currentLocale);
	        for (Speler speler : spelers) {
	        	  speler.initialize();
	        	}
	    }

}