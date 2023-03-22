package domein;

public class Edelsteenfiches {
	
	private static final String SMARAGDEN = "groen";
	private static final String DIAMANTEN = "wit";
	private static final String SAFFIEREN = "blauw";
	private static final String ONYXEN = "zwart";
	private static final String ROBIJNEN = "rood";
	private String[] soort;
	
	public Edelsteenfiches(int spelerIndex) {
		setSoort(spelerIndex);
	}

	public String[] getSoort() {
		return this.soort;
	}

	private void setSoort(int spelerIndex) {
		// als 2 spelers spelen dan zijn er 4 edelsteenfiches per soort... 
	    int gems = 0;
	    switch (spelerIndex) {
	        case 2:
	            gems = 4;
	            break;
	        case 3:
	            gems = 5;
	            break;
	        case 4:
	            gems = 7;
	            break;
	        default:
	            gems = 4;
	    }
	    // gems => hoeveel edelsteenfiches per soort, 5 => 5 soorten. bv soort[2] = SAFFIEREN, soort[7] = SAFFIEREN , soort[12] = SAFFIEREN... 
	    this.soort = new String[gems * 5]; 
	    for (int i = 0; i < gems * 5; i += 5) {
	        soort[i] = SMARAGDEN;
	        soort[i + 1] = DIAMANTEN;
	        soort[i + 2] = SAFFIEREN;
	        soort[i + 3] = ONYXEN;
	        soort[i + 4] = ROBIJNEN;
	    }
	}
}