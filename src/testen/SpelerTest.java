package testen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.awt.image.BufferedImage;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import domein.Edel;
import domein.Edelsteen;
import domein.Ontwikkelingskaart;
import domein.Speler;

class SpelerTest {
    private Speler speler;

    @BeforeEach
    void beforeEach() {
        speler = new Speler("Test", 2000);
    }

    @ParameterizedTest
    @CsvSource({
        "a, true, 2000",
        "1, false, 2000",
        "Test, true, 2000",
        "Test Test, true, 2000",
        "Test_123, true, 2000",
        "Test.123, false, 2000",
        "Test!, false, 2000"
    })
    void testGebruikersnaam(String gebruikersnaam, boolean expected, int geboortejaar) {
        if (expected) {
            speler = new Speler(gebruikersnaam, geboortejaar);
            assertEquals(gebruikersnaam, speler.getGebruikersnaam());
        } else {
            assertThrows(IllegalArgumentException.class, () -> speler = new Speler(gebruikersnaam, geboortejaar));
        }
    }

    @ParameterizedTest
    @CsvSource({
        "Test, 1899, false",
        "Test, 1900, true",
        "Test, 2000, true",
        "Test, 2100, false",
    })
    void testGeboortejaar(String gebruikersnaam, int geboortejaar, boolean expected) {
        if (expected) {
            speler = new Speler(gebruikersnaam, geboortejaar);
            assertEquals(geboortejaar, speler.getGeboortejaar());
        } else {
            assertThrows(IllegalArgumentException.class, () -> speler = new Speler(gebruikersnaam, geboortejaar));
        }
    }

    @ParameterizedTest
    @CsvSource({
        "Test, 1985, true",
        "Test, 2010, true",
        "Test, 2017, true",
        "Test, 2025, false",
    })
    void testLeeftijd(String gebruikersnaam, int geboortejaar, boolean expected) {
        if (expected) {
            speler = new Speler(gebruikersnaam, geboortejaar);
            assertEquals(Calendar.getInstance().get(Calendar.YEAR) - geboortejaar, speler.getLeeftijd());
        } else {
            assertThrows(IllegalArgumentException.class, () -> speler = new Speler(gebruikersnaam, geboortejaar));
        }
    }

    @Test
    void testVoegGemsToeAanBonusInventory() {
        speler.voegGemsToeAanBonusInventory(Edelsteen.DIAMANTEN);
        speler.voegGemsToeAanBonusInventory(Edelsteen.SAFFIEREN);
        speler.voegGemsToeAanBonusInventory(Edelsteen.SAFFIEREN);
        speler.voegGemsToeAanBonusInventory(Edelsteen.ROBIJNEN);

        HashMap<Edelsteen, Integer> expectedInventory = new HashMap<>(Map.of(
            Edelsteen.DIAMANTEN, 1,
            Edelsteen.SAFFIEREN, 2,
            Edelsteen.SMARAGDEN, 0,
            Edelsteen.ROBIJNEN, 1,
            Edelsteen.ONYXEN, 0
        ));

        assertEquals(expectedInventory, speler.getBonusEdelstenenInventory());
    }

    @Test
    void testVoegGemsToeAanInventory() {
        speler.voegGemsToeAanInventory(Edelsteen.DIAMANTEN, 2);
        speler.voegGemsToeAanInventory(Edelsteen.SAFFIEREN, 1);
        speler.voegGemsToeAanInventory(Edelsteen.ROBIJNEN, 3);
        speler.voegGemsToeAanInventory(Edelsteen.ONYXEN, 1);

        HashMap<Edelsteen, Integer> expectedInventory = new HashMap<>(Map.of(
            Edelsteen.DIAMANTEN, 2,
            Edelsteen.SAFFIEREN, 1,
            Edelsteen.SMARAGDEN, 0,
            Edelsteen.ROBIJNEN, 3,
            Edelsteen.ONYXEN, 1
        ));

        assertEquals(expectedInventory, speler.getEdelstenenInventory());
    }
    
    @ParameterizedTest
    @CsvSource({
            "2, 3, 4, 5, 6, 20",
            "1, 2, 3, 4, 5, 15",
            "3, 4, 5, 6, 7, 25"
    })
    void testTelPuntenOp(int punten1, int punten2, int punten3, int punten4, int punten5, int expectedTotal) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        Edelsteen[] prijs = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN};
        Ontwikkelingskaart kaart1 = new Ontwikkelingskaart(image, 1, Edelsteen.DIAMANTEN, punten1, prijs, 1);
        Ontwikkelingskaart kaart2 = new Ontwikkelingskaart(image, 2, Edelsteen.ROBIJNEN, punten2, prijs, 2);
        Ontwikkelingskaart kaart3 = new Ontwikkelingskaart(image, 3, Edelsteen.SMARAGDEN, punten3, prijs, 3);
        Ontwikkelingskaart kaart4 = new Ontwikkelingskaart(image, 1, Edelsteen.ONYXEN, punten4, prijs, 4);
        Ontwikkelingskaart kaart5 = new Ontwikkelingskaart(image, 2, Edelsteen.SAFFIEREN, punten5, prijs, 5);

        Edelsteen[] prijsEdel = {Edelsteen.ROBIJNEN, Edelsteen.SMARAGDEN};
        Edel edel1 = new Edel(image, 3, prijsEdel, 1);
        Edel edel2 = new Edel(image, 4, prijsEdel, 2);
        Edel edel3 = new Edel(image, 2, prijsEdel, 3);

        speler.voegOntwikkelingskaartToeAanInventory(kaart1);
        speler.voegOntwikkelingskaartToeAanInventory(kaart2);
        speler.voegOntwikkelingskaartToeAanInventory(kaart3);
        speler.voegOntwikkelingskaartToeAanInventory(kaart4);
        speler.voegOntwikkelingskaartToeAanInventory(kaart5);
        speler.voegEdelenAanInventory(edel1);
        speler.voegEdelenAanInventory(edel2);
        speler.voegEdelenAanInventory(edel3);

        int totalPoints = speler.telPuntenOp();

        assertEquals(expectedTotal, totalPoints);
    }



    
}
