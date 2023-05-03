package testen;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.image.BufferedImage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Edelsteen;
import domein.Ontwikkelingskaart;

class OntwikkelingskaartTest {

    private BufferedImage image;
    private Edelsteen bonus;
    private Edelsteen[] prijs;
    private int punten;
    private int kaartnummer;
    private int niveau;
    
 // пока без золота - сказать папуне добавить его
    
    @BeforeEach
    void setUp() {
        image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        bonus = Edelsteen.SAFFIEREN; // moet goud zijn
        prijs = new Edelsteen[] { Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN };
        punten = 2;
        kaartnummer = 1;
        niveau = 1;
    }
//
    @Test
    void testOntwikkelingskaart() {
        Ontwikkelingskaart kaart = new Ontwikkelingskaart(image, niveau, bonus, punten, prijs, kaartnummer);
        assertEquals(image, kaart.getImage());
        assertEquals(niveau, kaart.getNiveau());
        assertEquals(bonus, kaart.getBonus());
        assertEquals(punten, kaart.getPunten());
        assertArrayEquals(prijs, kaart.getPrijs());
        assertEquals(kaartnummer, kaart.getKaartnummer());
    }

    @Test
	public void testToString() {
    	Ontwikkelingskaart kaart = new Ontwikkelingskaart(image, niveau, bonus, punten, prijs, kaartnummer);
		String expected = "kaart nummer: 1: bonus edelsteen: GROEN, punt(en): 1, prijs: BLAUW ROOD ";
		String result = kaart.toString();
		assertEquals(expected, result);
	}

}
