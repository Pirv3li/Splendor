package persistentie;

import domein.Speler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class Mapper {

    private ResourceBundle bundle;

    private static final String SELECT_SPELER_BY_USERNAME_AND_GEBOORTEJAAR = "SELECT * FROM ID399806_g61.Speler WHERE gebruikersnaam = ? AND geboortejaar = ?";

    public Mapper() {
        initialize();
    }

    public void initialize() {
        Locale currentLocale = Locale.getDefault();
        bundle = ResourceBundle.getBundle("resources/messages", currentLocale);
    }

    public boolean isSpelerInDatabase(String gebruikersnaam, int geboortejaar) {
        if (bundle == null) {
            initialize();
        }
        try (Connection conn = DriverManager.getConnection(Connectie.JDBC_URL);
             PreparedStatement query = conn.prepareStatement(SELECT_SPELER_BY_USERNAME_AND_GEBOORTEJAAR)) {
            query.setString(1, gebruikersnaam);
            query.setInt(2, geboortejaar);
            try (ResultSet rs = query.executeQuery()) {
                if (rs.next()) {
                    // Player found in database
                    return true;
                } else {
                    // Player not found in database
                    String message = bundle.getString("playerW") + " " + bundle.getString("name") + " " + gebruikersnaam + " " + bundle.getString("and") + " " + bundle.getString("birth") + " " + geboortejaar + " " + bundle.getString("notFound");
                    throw new IllegalArgumentException(message);
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(bundle.getString("birth")+ " " + geboortejaar + " " + bundle.getString("invalid"));
        }
    }
}
