package domein;

import java.awt.image.BufferedImage;
import java.util.Locale;
import java.util.ResourceBundle;

public class Ontwikkelingskaart {

	private Edelsteen[] prijs;
	private int punten;
	private Edelsteen bonus;
	private int kaartnummer;
	private int niveau;
	BufferedImage image;
	private ResourceBundle bundle;
	
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
	    sb.append(bundle.getString("uiKaartnum")).append(kaartnummer).append(":      ");
	    sb.append(bundle.getString("uiBonus")).append(bonus.toString()).append(", ");
	    sb.append(bundle.getString("uiPunt")).append(punten).append(", ");
	    sb.append(bundle.getString("uiCost"));
	    for (Edelsteen edelsteen : prijs) {
	        sb.append(edelsteen.toString()).append(" ");
	    }
	    return sb.toString();
	}
	
	public void initialize() {
        Locale currentLocale = Locale.getDefault();
        bundle = ResourceBundle.getBundle("resources/messages", currentLocale);
    }
}