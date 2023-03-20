package domein;
import java.util.ArrayList;

public class Ontwikkelingskaarten {

	ArrayList<Edelsteenfiches> prijs;
	private int punten;
	private int niveau;
	private Edelsteenfiches bonus;
	
	public Ontwikkelingskaarten() {
		// TODO - implement Ontwikkelingskaarten.Ontwikkelingskaarten
	}

	public int getPunten() {
		return this.punten;
	}

	public void setPunten(int punten) {
		this.punten = punten;
	}

	public int getNiveau() {
		return this.niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public Edelsteenfiches getBonus() {
		return this.bonus;
	}

	public void setBonus(Edelsteenfiches bonus) {
		this.bonus = bonus;
	}

	

}