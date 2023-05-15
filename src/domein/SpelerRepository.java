package domein;

import persistentie.Mapper;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class SpelerRepository {

    private Mapper mapper;
    private ResourceBundle bundle;

    public SpelerRepository() {
        mapper = new Mapper();
        initialize();
    }
    
    public void initialize() {
        Locale currentLocale = Locale.getDefault();
        bundle = ResourceBundle.getBundle("resources/messages", currentLocale);
        mapper.initialize();
    }

    public boolean bestaatSpeler(String gebruikersnaam, int geboortejaar) {
        return mapper.isSpelerInDatabase(gebruikersnaam, geboortejaar);
    }

}
