package domein;

import persistentie.Mapper;
import java.util.List;

public class SpelerRepository {

    private Mapper mapper;

    public SpelerRepository() {
        mapper = new Mapper();
    }

    public void voegSpelerToe(Speler speler) {
        mapper.voegToe(speler);
    }

    public Speler getSpeler(String gebruikersnaam) {
        Speler speler = mapper.geefSpeler(gebruikersnaam);
        return speler;
    }
    
    public List<Speler> getSpelers() {
    	return mapper.geefSpelers();
    }
}
