package domein;

import java.util.*;

public class Spel {
	private static final int MIN_SPELERS = 2;
	private static final int MAX_SPELERS = 4;

	ArrayList<Speler> spelers;
	Edelsteenfiches gems;
	ArrayList<Edelen> edelen;
	ArrayList<Ontwikkelingskaarten> ontwikkelingsKaarten;
	private Speler isWinaar;
	private int spelerIndex;

	public Spel(ArrayList<Speler> spelers) {
		// domeinregel voor max en min spelers.
		if (spelers.size() < MIN_SPELERS || spelers.size() > MAX_SPELERS) {
			throw new IllegalArgumentException("Het aantal spelers moet tussen " + MIN_SPELERS + " en " + MAX_SPELERS + " zijn.");
		}
		
	}

	public Speler volgendeSpeler() {
		spelerIndex = (spelerIndex + 1) % spelers.size();
        return spelers.get(spelerIndex);
	}
	
	public String[] getEdelsteenfiches(int spelerIndex) {
		gems = new Edelsteenfiches(spelerIndex);
		return gems.getSoort();
	}
	
	

}