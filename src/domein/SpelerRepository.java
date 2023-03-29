package domein;

import java.util.*;

public class SpelerRepository {
    private List<Speler> spelers;

    public SpelerRepository() {
        this.spelers = new ArrayList<>();
    }

    public void voegSpelerToe(Speler speler) {
        spelers.add(speler);
    }

    public void verwijderSpeler(Speler speler) {
        spelers.remove(speler);
    }

    public List<Speler> getSpelers() {
        return spelers;
    }

    public Speler getSpelerOpGebruikersnaam(String gebruikersnaam) {
        for (Speler speler : spelers) {
            if (speler.getGebruikersnaam().equals(gebruikersnaam)) {
                return speler;
            }
        }
        return null;
    }
}