package domein;

import java.awt.image.BufferedImage;

public class Ontwikkelingskaart {

	private Edelsteen[] prijs;
	private int punten;
	private Edelsteen bonus;
	private int kaartnummer;
	private int niveau;
	BufferedImage image;
	
	public Ontwikkelingskaart(BufferedImage image, int niveau,Edelsteen bonus, int punten, Edelsteen[]prijs, int kaartnummer) {
		this.prijs = prijs;
		this.punten = punten;
		this.bonus = bonus;
		this.kaartnummer = kaartnummer;
		this.niveau = niveau;
		this.image = image;
	}
	
	public BufferedImage getImage() {
		return this.image;
	}

	public int getNiveau() {
		return this.niveau;
	}
	
	public int getPunten() {
		return this.punten;
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
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("kaart nummer: ").append(kaartnummer).append(":      ");
	    sb.append("bonus edelsteen: ").append(bonus.toString()).append(", ");
	    sb.append("punt(en): ").append(punten).append(", ");
	    sb.append("prijs: ");
	    for (Edelsteen edelsteen : prijs) {
	        sb.append(edelsteen.toString()).append(" ");
	    }
	    return sb.toString();
	}
}