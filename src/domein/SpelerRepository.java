package domein;

import persistentie.Mapper;
import java.util.List;

public class SpelerRepository {

    private Mapper mapper;

    public SpelerRepository() {
        mapper = new Mapper();
    }

//    public void voegSpelerToe(Speler speler) {
//        mapper.voegToe(speler);
//    }

    public boolean bestaatSpeler(String gebruikersnaam, int geboortejaar) {
        return mapper.isSpelerInDatabase(gebruikersnaam, geboortejaar);
    }
    
//    public List<Speler> getSpelers() {
//    	return mapper.geefSpelers();
//    }
}
