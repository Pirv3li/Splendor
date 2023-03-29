package persistentie;

import domein.Speler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Mapper {

    private static final String INSERT_SPELER = "INSERT INTO ID399806_g61.Speler (gebruikersnaam, geboortejaar)"
            + "VALUES (?, ?)";
    private static final String SELECT_SPELER_BY_USERNAME = "SELECT * FROM ID399806_g61.Speler WHERE gebruikersnaam = ?";

    public void voegToe(Speler speler) {

        try (
                Connection conn = DriverManager.getConnection(Connectie.JDBC_URL);
                PreparedStatement query = conn.prepareStatement(INSERT_SPELER)) {
            query.setString(1, speler.getGebruikersnaam());
            query.setInt(2, speler.getGeboortejaar());
            query.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Speler> geefSpelers() {
        List<Speler> spelers = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(Connectie.JDBC_URL);
                PreparedStatement query = conn.prepareStatement("SELECT * FROM ID340733_g26.Speler");
                ResultSet rs = query.executeQuery()) {

            while (rs.next()) {
                String gebruikersnaam = rs.getString("gebruikersnaam");
                int geboortejaar = rs.getInt("geboortejaar");

                spelers.add(new Speler(gebruikersnaam, geboortejaar));
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return spelers;
    }

    public Speler geefSpeler(String gebruikersnaam) {
        Speler speler = null;

        try (Connection conn = DriverManager.getConnection(Connectie.JDBC_URL);
                PreparedStatement query = conn.prepareStatement(SELECT_SPELER_BY_USERNAME)) {
            query.setString(1, gebruikersnaam);
            try (ResultSet rs = query.executeQuery()) {
                if (rs.next()) {
                    int geboortejaar = rs.getInt("geboortejaar");
                    speler = new Speler(gebruikersnaam, geboortejaar);
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

        return speler;
    }
}
