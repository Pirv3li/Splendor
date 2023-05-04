package gui;
import dto.OntwikkelingskaartDto;

import java.util.List;

import domein.Domeincontroller;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class SpelBordController {

	Domeincontroller dc;
	
	private List<OntwikkelingskaartDto> Niveau1Kaarten;
    private List<OntwikkelingskaartDto> Niveau2Kaarten;
    private List<OntwikkelingskaartDto> Niveau3Kaarten;
	
	@FXML
	private Button btnKaart1;
	
	@FXML
	private Button btnKaart2;
	
	@FXML
	private Button btnKaart3;
	
	@FXML
	private Button btnKaart4;
	
	@FXML
	private Button btnKaart5;
	
	@FXML
	private Button btnKaart6;
	
	@FXML
	private Button btnKaart7;
	
	@FXML
	private Button btnKaart8;
	
	@FXML
	private Button btnKaart9;
	
	@FXML
	private Button btnKaart10;
	
	@FXML
	private Button btnKaart11;
	
	@FXML
	private Button btnKaart12;

    @FXML
    private VBox VBoxSpeler1;

    @FXML
    private VBox VBoxSpeler2;

    @FXML
    private VBox VBoxSpeler3;

    @FXML
    private VBox VBoxSpeler4;

    @FXML
    private ImageView btnDiamant;

    @FXML
    private ImageView btnInventoryDiamant;

    @FXML
    private ImageView btnInventoryOnyx;

    @FXML
    private ImageView btnInventoryRobijn;

    @FXML
    private ImageView btnInventorySaffier;

    @FXML
    private ImageView btnInventorySmaragd;

    @FXML
    private ImageView btnInventoryTegel;

    @FXML
    private ImageView btnOnyx;

    @FXML
    private ImageView btnRobijn;

    @FXML
    private ImageView btnSaffier;

    @FXML
    private ImageView btnSmaragd;

    @FXML
    private ImageView btnTegel;

    @FXML
    private ImageView imgvNiveau1;

    @FXML
    private ImageView imgvNiveau2;

    @FXML
    private ImageView imgvNiveau3;

    @FXML
    private ImageView imgvSpeler1Kaart1;

    @FXML
    private ImageView imgvSpeler1Kaart2;

    @FXML
    private ImageView imgvSpeler1Kaart3;

    @FXML
    private ImageView imgvSpeler1Kaart4;

    @FXML
    private ImageView imgvSpeler1Kaart5;

    @FXML
    private ImageView imgvSpeler1Kaart6;

    @FXML
    private ImageView imgvSpeler2Kaart1;

    @FXML
    private ImageView imgvSpeler2Kaart2;

    @FXML
    private ImageView imgvSpeler2Kaart3;

    @FXML
    private ImageView imgvSpeler2Kaart4;

    @FXML
    private ImageView imgvSpeler2Kaart5;

    @FXML
    private ImageView imgvSpeler2Kaart6;

    @FXML
    private ImageView imgvSpeler3Kaart1;

    @FXML
    private ImageView imgvSpeler3Kaart2;

    @FXML
    private ImageView imgvSpeler3Kaart3;

    @FXML
    private ImageView imgvSpeler3Kaart4;

    @FXML
    private ImageView imgvSpeler3Kaart5;

    @FXML
    private ImageView imgvSpeler3Kaart6;

    @FXML
    private ImageView imgvSpeler4Kaart1;

    @FXML
    private ImageView imgvSpeler4Kaart2;

    @FXML
    private ImageView imgvSpeler4Kaart3;

    @FXML
    private ImageView imgvSpeler4Kaart4;

    @FXML
    private ImageView imgvSpeler4Kaart5;

    @FXML
    private ImageView imgvSpeler4Kaart6;

    @FXML
    private Label lbSmaragd;

    @FXML
    private Label lblDiamant;

    @FXML
    private Label lblOnyx;

    @FXML
    private Label lblRobijn;

    @FXML
    private Label lblSaffier;

    @FXML
    private Label lblSpeler1;

    @FXML
    private Label lblSpeler1AantalPunten;

    @FXML
    private Label lblSpeler1Kaarten;

    @FXML
    private Label lblSpeler2;

    @FXML
    private Label lblSpeler2AantalPunten;

    @FXML
    private Label lblSpeler2Kaarten;

    @FXML
    private Label lblSpeler3;

    @FXML
    private Label lblSpeler3AantalPunten;

    @FXML
    private Label lblSpeler3Kaarten;

    @FXML
    private Label lblSpeler4;

    @FXML
    private Label lblSpeler4AantalPunten;
    
//    public SpelBordController(Domeincontroller dc) {
//    	this.dc = dc;
//    	setupButtonImages();
//    	}
//    
//    private void setupButtonImages() {
//    	Niveau1Kaarten = dc.getNiveau1Kaarten();
//    	Niveau2Kaarten = dc.getNiveau2Kaarten();
//    	Niveau3Kaarten = dc.getNiveau3Kaarten();
//        setImageToButton(btnKaart1, Niveau1Kaarten.get(0));
//        setImageToButton(btnKaart2, Niveau1Kaarten.get(1));
//        setImageToButton(btnKaart3, Niveau1Kaarten.get(2));
//        setImageToButton(btnKaart4, Niveau1Kaarten.get(3));
//        
//        setImageToButton(btnKaart5, Niveau2Kaarten.get(0));
//        setImageToButton(btnKaart6, Niveau2Kaarten.get(1));
//        setImageToButton(btnKaart7, Niveau2Kaarten.get(2));
//        setImageToButton(btnKaart8, Niveau2Kaarten.get(3));
//        
//        setImageToButton(btnKaart9, Niveau3Kaarten.get(0));
//        setImageToButton(btnKaart10, Niveau3Kaarten.get(1));
//        setImageToButton(btnKaart11, Niveau3Kaarten.get(2));
//        setImageToButton(btnKaart12, Niveau3Kaarten.get(3));
//    }
//    
//    private void setImageToButton(Button button, OntwikkelingskaartDto ontwikkelingskaartDto) {
//        Image image = SwingFXUtils.toFXImage(ontwikkelingskaartDto.getImage(), null);
//        ImageView imageView = new ImageView(image);
//        button.setGraphic(imageView);
//    }


    @FXML
    private Label lblSpeler4Kaarten;

    @FXML
    private Label lblStapelNiveau1;

    @FXML
    private Label lblStapelNiveau2;

    @FXML
    private Label lblStapelNiveau3;

    @FXML
    private Label lblTegel;

    @FXML
    void btnEdel1(ActionEvent event) {

    }

    @FXML
    void btnEdel2(ActionEvent event) {

    }

    @FXML
    void btnEdel3(ActionEvent event) {

    }

    @FXML
    void btnEdel4(ActionEvent event) {

    }

    @FXML
    void btnEdel5(ActionEvent event) {

    }

    @FXML
    void btnGem1(ActionEvent event) {

    }

    @FXML
    void btnGem2(ActionEvent event) {

    }

    @FXML
    void btnGem3(ActionEvent event) {

    }

    @FXML
    void btnGem4(ActionEvent event) {

    }

    @FXML
    void btnGem5(ActionEvent event) {

    }

    @FXML
    void btnGem6(ActionEvent event) {

    }

    @FXML
    void btnKaart1(ActionEvent event) {
    	
    }

    @FXML
    void btnKaart2(ActionEvent event) {

    }

    @FXML
    void btnKaart3(ActionEvent event) {

    }

    @FXML
    void btnKaart4(ActionEvent event) {

    }

    @FXML
    void btnKaart5(ActionEvent event) {

    }

    @FXML
    void btnKaart6(ActionEvent event) {

    }

    @FXML
    void btnKaart7(ActionEvent event) {

    }

    @FXML
    void btnKaart8(ActionEvent event) {

    }

    @FXML
    void btnKaart9(ActionEvent event) {

    }

    @FXML
    void btnKaart10(ActionEvent event) {

    }
    

    @FXML
    void btnKaart11(ActionEvent event) {

    }
    

    @FXML
    void btnKaart12(ActionEvent event) {

    }

}
