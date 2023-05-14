package domein;

import java.awt.image.BufferedImage;

public class Edel {

	private Edelsteen[] prijs;
	private int punten;
	private int edelnummer;
	private BufferedImage image;

	public Edel(BufferedImage image,int punten, Edelsteen[]prijs, int edelnummer) {
		this.punten = punten;
		this.prijs = prijs;
		this.edelnummer = edelnummer;
		this.image = image;
	}
	
	public BufferedImage getEdelImage() {
		return this.image;
	}
	
	public int getEdelNummer() {
		return this.edelnummer;
	}
	
	public int getPunten() {
		return this.punten;
	}

	public Edelsteen[] getPrijs() {
		return prijs;
	}



}
// test