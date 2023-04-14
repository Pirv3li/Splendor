package domein;

public class Edel {

	Edelsteen[] prijs;
	private int punten;
	private int edelnummer;

	public Edel(int punten, Edelsteen[]prijs, int edelnummer) {
		this.punten = punten;
		this.prijs = prijs;
		this.edelnummer = edelnummer;
	}
	
	public int getEdelNummer() {
		return this.edelnummer;
	}
	
	public int getPunten() {
		return this.punten;
	}

	public void setPunten(int punten) {
		this.punten = punten;
	}



}