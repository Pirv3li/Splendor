package testen;
import domein.Edel;
import domein.Edelsteen;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.image.BufferedImage;

import org.junit.Before;
import org.junit.Test;

public class EdelTest {
	
	private Edel edel;
	private BufferedImage image;
	private int punten;
	private Edelsteen[] prijs;
	private int edelnummer;
	
	@Before
	public void setUp() {
		punten = 10;
		prijs = new Edelsteen[] {Edelsteen.ROBIJNEN, Edelsteen.SMARAGDEN};
		edelnummer = 1;
		image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
		edel = new Edel(image, punten, prijs, edelnummer);
	}
	
	@Test
	public void testGetEdelImage() {
		assertNotNull(edel.getEdelImage());
	}
	
	@Test
	public void testGetEdelNummer() {
		assertEquals(edelnummer, edel.getEdelNummer());
	}
	
	@Test
	public void testGetPunten() {
		assertEquals(punten, edel.getPunten());
	}
	
	@Test
	public void testGetPrijs() {
		assertEquals(prijs, edel.getPrijs());
	}
}
