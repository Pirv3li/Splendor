package testen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import domein.Speler;
import domein.Edelsteen;
import domein.Ontwikkelingskaart;

import java.util.Calendar;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SpelerTest {
    private Speler speler;

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
            speler = new Speler(gebruikersnaam,geboortejaar);
            assertEquals(geboortejaar, speler.getGeboortejaar());
        } else {
            assertThrows(IllegalArgumentException.class, () -> speler= new Speler(gebruikersnaam,geboortejaar));
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
            speler = new Speler(gebruikersnaam,geboortejaar);
            assertEquals(Calendar.getInstance().get(Calendar.YEAR) - geboortejaar, speler.getLeeftijd());
        } else {
            assertThrows(IllegalArgumentException.class, () -> speler = new Speler(gebruikersnaam,geboortejaar));
        }
    }

//    @ParameterizedTest
//    @CsvSource({
//    		"SMARAGDEN, 2, {SMARAGDEN=2}",
//            "ONYXEN, 1, {ONYXEN=1}",
//            "SAFFIEREN, 2, {SAFFIEREN=2}",
//            "ROBIJNEN, 1, {ROBIJNEN=1}",
//            "DIAMANDEN, 2, {DIAMANDEN=2}",
//    })
//    void testVoegGemsToeAanInventory(Edelsteen edelsteen, int aantal, HashMap<Edelsteen, Integer> expected) {
//    	speler = new Speler("Test", 1990);
//        speler.voegGemsToeAanInventory(edelsteen, aantal);
//        assertEquals(expected, speler.getEdelstenenInventory());
//    }


}
