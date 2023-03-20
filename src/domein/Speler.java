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
	
	public Speler() {
		// TODO - implement Speler.Speler
	}

	public String getGebruikersnaam() {
		return this.gebruikersnaam;
	}

	public void setGebruikersnaam(String gebruikersnaam) {
		this.gebruikersnaam = gebruikersnaam;
	}

	public int getGeboortejaar() {
		return this.geboortejaar;
	}

	public void setGeboortejaar(int geboortejaar) {
		this.geboortejaar = geboortejaar;
	}

	public boolean getAanDeBeurt() {
		return this.aanDeBeurt;
	}

	public void setAanDeBeurt(boolean aanDeBeurt) {
		this.aanDeBeurt = aanDeBeurt;
	}

	public boolean getIsStartSpeler() {
		return this.isStartSpeler;
	}

	public void setIsStartSpeler(boolean isStartSpeler) {
		this.isStartSpeler = isStartSpeler;
	}

	public int telPuntenOp() {
		// TODO - implement Speler.telPuntenOp
	}

}