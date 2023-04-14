package domein;

public class Ontwikkelingskaart {

	Edelsteen[] prijs;
	private int punten;
	private int niveau;
	private Edelsteen bonus;
	private int kaartnummer;
	
	public Ontwikkelingskaart(int niveau, Edelsteen bonus, int punten, Edelsteen[]prijs, int kaartnummer) {
		this.prijs = prijs;
		this.punten = punten;
		this.niveau = niveau;
		this.bonus = bonus;
		this.kaartnummer = kaartnummer;
	}

	public int getPunten() {
		return this.punten;
	}

	public int getNiveau() {
		return this.niveau;
	}

	public Edelsteen getBonus() {
		return this.bonus;
	}

	public Edelsteen[] getPrijs() {
		return this.prijs;
	}
	
	public int getKaartnummer() {
		return this.kaartnummer;
	}

}