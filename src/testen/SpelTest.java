package testen;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import domein.Edelsteen;
import domein.Ontwikkelingskaart;
import domein.Spel;

import java.util.HashMap;
import java.util.List;

public class SpelTest {
    private Spel spel;

    @Before
    public void DoIt() {
        spel = new Spel();
    }

    @Test
    public void testStartSpelWithInvalidNumberOfPlayers() {
        try {
            spel.startSpel();
            Assert.fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException x) {
            Assert.assertEquals("Het aantal spelers moet tussen 2 en 4 zijn.", x.getMessage());
        }
    }

    @Test
    public void testStartSpelWithValidNumberOfPlayers() {
        spel.voegSpelerToe("Speler 1", 2000);
        spel.voegSpelerToe("Speler 2", 1995);
        spel.startSpel();
        HashMap<Edelsteen, Integer> edelstenen = spel.getAlleEdelstenen();
        Assert.assertEquals(4, edelstenen.get(Edelsteen.SMARAGDEN).intValue());
        Assert.assertEquals(4, edelstenen.get(Edelsteen.DIAMANTEN).intValue());
        Assert.assertEquals(4, edelstenen.get(Edelsteen.SAFFIEREN).intValue());
        Assert.assertEquals(4, edelstenen.get(Edelsteen.ONYXEN).intValue());
        Assert.assertEquals(4, edelstenen.get(Edelsteen.ROBIJNEN).intValue());
    }

    @Test
    public void testVoegSpelerToeWithMaxPlayersReached() {
        spel.voegSpelerToe("Speler 1", 2000);
        spel.voegSpelerToe("Speler 2", 1995);
        spel.voegSpelerToe("Speler 3", 1998);
        spel.voegSpelerToe("Speler 4", 1992);
        try {
            spel.voegSpelerToe("Speler 5", 1999);
            Assert.fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException x) {
            Assert.assertEquals("Er kunnen maximaal 4 spelers meedoen.", x.getMessage());
        }
    }

    @Test
    public void testGetNiveau1Kaarten() {
        List<Ontwikkelingskaart> niveau1Kaarten = spel.getNiveau1Kaarten();
        Assert.assertNotNull(niveau1Kaarten);
    }

    @Test
    public void testGetNiveau2Kaarten() {
        List<Ontwikkelingskaart> niveau2Kaarten = spel.getNiveau2Kaarten();
        Assert.assertNotNull(niveau2Kaarten);
    }

    @Test
    public void testGetNiveau3Kaarten() {
        List<Ontwikkelingskaart> niveau3Kaarten = spel.getNiveau3Kaarten();
        Assert.assertNotNull(niveau3Kaarten);
    }
    

    @Test
    public void testGetAlleEdelstenen() {
        spel.voegSpelerToe("Speler 1", 2000);
        spel.voegSpelerToe("Speler 2", 1995);
        spel.startSpel();
        HashMap<Edelsteen, Integer> edelstenen = spel.getAlleEdelstenen();
        Assert.assertEquals(4, edelstenen.get(Edelsteen.SMARAGDEN).intValue());
        Assert.assertEquals(4, edelstenen.get(Edelsteen.DIAMANTEN).intValue());
        Assert.assertEquals(4, edelstenen.get(Edelsteen.SAFFIEREN).intValue());
        Assert.assertEquals(4, edelstenen.get(Edelsteen.ONYXEN).intValue());
        Assert.assertEquals(4, edelstenen.get(Edelsteen.ROBIJNEN).intValue());
    }

}


