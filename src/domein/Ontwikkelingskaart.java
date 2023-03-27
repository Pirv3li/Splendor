package domein;

public class Ontwikkelingskaart {

	Edelsteen[] prijs;
	private int punten;
	private int niveau;
	private Edelsteen bonus;
	
	public Ontwikkelingskaart(Edelsteen bonus, int punten, int niveau, Edelsteen[]prijs) {
		this.prijs = prijs;
		this.punten = punten;
		this.niveau = niveau;
		this.bonus = bonus;
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

}