package domein;

import java.util.*;

public class Spel {
	private static final int MIN_SPELERS = 2;
	private static final int MAX_SPELERS = 4;
	private int startspelerIndex;
	HashMap<Edelsteen, Integer> edelstenen;
	ArrayList<Speler> spelers;
	ArrayList<Edel> edelen;
	ArrayList<Ontwikkelingskaart> ontwikkelingsKaarten;
	private int spelerIndex;

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
	
	
	public Speler volgendeSpeler() {
		spelerIndex = (spelerIndex + 1) % spelers.size();
        return spelers.get(spelerIndex);
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
}

