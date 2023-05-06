package gui;
import dto.EdelenDto;
import dto.InventoryDto;
import java.util.*;
import dto.EdelstenenDto;
import dto.OntwikkelingskaartDto;
import domein.Domeincontroller;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class SpelBordController {

	Domeincontroller dc;
	private List<String> selectedGems;

	
	private List<OntwikkelingskaartDto> Niveau1Kaarten;
    private List<OntwikkelingskaartDto> Niveau2Kaarten;
    private List<OntwikkelingskaartDto> Niveau3Kaarten;
    private ArrayList<EdelstenenDto> aantalEdelstenen;
    private ArrayList<String> spelerNamen;
    private List<EdelenDto> edelen;
    @FXML
    private Label labelDiamantenInInventory;
    
    @FXML
    private Label labelSaffierenInInventory;
    
    @FXML
    private Label labelSmaragdenInInventory;
    
    @FXML
    private Label labelRobijnenInInventory;
    
    @FXML
    private Label labelOnyxenInInventory;
    
    @FXML
    private Label labelSpelerInventory;
	
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
    private Button btnGem1;

    @FXML
    private Button btnGem2;
    
    @FXML
    private Button btnGem3;
    
    @FXML
    private Button btnGem4;
    
    @FXML
    private Button btnGem5;
    
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
    
    @FXML
    private Button btnEdel1;
    
    @FXML
    private Button btnEdel2;
    
    @FXML
    private Button btnEdel3;
    
    @FXML
    private Button btnEdel4;
    
    @FXML
    private Button btnEdel5;
    
    @FXML
    private Button neemEdelstenen;
    
    
    public void setDc(Domeincontroller dc) {
    	selectedGems = new ArrayList<>();
    	this.dc = dc;
    	setupButtonImages();
    	setupEdelstenenAantal();
    	setupSpelerNamen();
    	setupEdelenImages();
    	setSpelerAandebeurt();
    	setPunten();
    	setInventory();
    }
    
    private void setupEdelenImages() {
    	edelen = dc.getEdelen();
    	setImageToEdelButton(btnEdel1, edelen.get(0));
    	setImageToEdelButton(btnEdel2, edelen.get(1));
    	setImageToEdelButton(btnEdel3, edelen.get(2));
    	setImageToEdelButton(btnEdel4, edelen.get(3));
    	setImageToEdelButton(btnEdel5, edelen.get(4));
    }
    
    private void setImageToEdelButton(Button button, EdelenDto edelen) {
        if (edelen.getImage() != null) {
            Image image = SwingFXUtils.toFXImage(edelen.getImage(), null);
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(100);
            imageView.setFitWidth(90);
            button.setGraphic(imageView);
        }
    }
    
    private void setupSpelerNamen() {
    	spelerNamen = dc.getSpelerNamen();
    	lblSpeler1.setText(spelerNamen.get(0));
    	lblSpeler2.setText(spelerNamen.get(1));
    	if(spelerNamen.size()<3) {
    		lblSpeler3.setText("");
    		lblSpeler3AantalPunten.setText("");
    	}
    	if(spelerNamen.size()<4) {
    		lblSpeler4.setText("");
    		lblSpeler4AantalPunten.setText("");
    	}
    	if(spelerNamen.size()==3 || spelerNamen.size()==4) {
        	lblSpeler3.setText(spelerNamen.get(2));
    	}
    	if(spelerNamen.size()==4) {
        	lblSpeler4.setText(spelerNamen.get(3));
    	}
    }
    
    private void setupEdelstenenAantal() {
    	aantalEdelstenen = dc.getEdelstenenAantalDto();
    	lblDiamant.setText(String.valueOf(aantalEdelstenen.get(0).aantal()));
    	lblSaffier.setText(String.valueOf(aantalEdelstenen.get(1).aantal()));
    	lbSmaragd.setText(String.valueOf(aantalEdelstenen.get(2).aantal()));
    	lblRobijn.setText(String.valueOf(aantalEdelstenen.get(3).aantal()));
    	lblOnyx.setText(String.valueOf(aantalEdelstenen.get(4).aantal()));
    }
    
    private void setupButtonImages() {
    	Niveau1Kaarten = dc.getNiveau1Kaarten();
    	Niveau2Kaarten = dc.getNiveau2Kaarten();
    	Niveau3Kaarten = dc.getNiveau3Kaarten();
        setImageToButton(btnKaart1, Niveau1Kaarten.get(0));
        setImageToButton(btnKaart2, Niveau1Kaarten.get(1));
        setImageToButton(btnKaart3, Niveau1Kaarten.get(2));
        setImageToButton(btnKaart4, Niveau1Kaarten.get(3));
        
        setImageToButton(btnKaart5, Niveau2Kaarten.get(0));
        setImageToButton(btnKaart6, Niveau2Kaarten.get(1));
        setImageToButton(btnKaart7, Niveau2Kaarten.get(2));
        setImageToButton(btnKaart8, Niveau2Kaarten.get(3));
        
        setImageToButton(btnKaart9, Niveau3Kaarten.get(0));
        setImageToButton(btnKaart10, Niveau3Kaarten.get(1));
        setImageToButton(btnKaart11, Niveau3Kaarten.get(2));
        setImageToButton(btnKaart12, Niveau3Kaarten.get(3));
    }
    
    private void setImageToButton(Button button, OntwikkelingskaartDto ontwikkelingskaartDto) {
        if (ontwikkelingskaartDto.getImage() != null) {
            Image image = SwingFXUtils.toFXImage(ontwikkelingskaartDto.getImage(), null);
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(129);
            imageView.setFitWidth(90);
            button.setGraphic(imageView);
        }
    }
    

    private void checkSelectedGems3() {
        if (selectedGems.size() == 3) {
            // check if there are three different types of gems
            if (selectedGems.stream().distinct().count() == 3) {
            	dc.neemEdelstenen(selectedGems);
            	selectedGems = new ArrayList<>();
                dc.setEdelstenenAantalDto();
            	setupEdelstenenAantal();
            	dc.volgendeSpeler();
            	setSpelerAandebeurt();
            	dc.setInventoryDto();
            	setInventory();
            } else {
            	throw new IllegalArgumentException("Invalid keuze :");
            }
        } 
    }
    
    private void checkSelectedGems() {
    	if(selectedGems.size()==3) {
    		checkSelectedGems3();
    	}
    	else if (selectedGems.size() == 2) {
            // check if there are two of the same type of gem
            String firstGem = selectedGems.get(0);
            String secondGem = selectedGems.get(1);
            if (firstGem.equals(secondGem)) {
            	dc.neemEdelstenen(selectedGems);
            	selectedGems = new ArrayList<>();
                dc.setEdelstenenAantalDto();
            	setupEdelstenenAantal();
            	dc.volgendeSpeler();
            	setSpelerAandebeurt();
            	dc.setInventoryDto();
            	setInventory();
            } else {
            	throw new IllegalArgumentException("Invalid keuze :: ");
            }
        } else {
        	throw new IllegalArgumentException("Invalid keuze :::");
        }
    }
    
    private void setSpelerAandebeurt() {
    	labelSpelerInventory.setText(dc.getNaamVanSpelerAanDeBeurt()+"'s Inventory");
    }
    
    private void setPunten() {
    	String punten = String.valueOf(dc.getPunten());
    	lblSpeler1AantalPunten.setText("Punten : "+punten);
    	lblSpeler2AantalPunten.setText("Punten : "+punten);
    	if(spelerNamen.size()==3) {
    	lblSpeler3AantalPunten.setText("Punten : "+punten);}
    	if(spelerNamen.size()==4) {
    	lblSpeler4AantalPunten.setText("Punten : "+punten);}
    }
    
    private void setInventory() {
        List<InventoryDto> inventory = dc.getInventory();
        labelDiamantenInInventory.setText(String.valueOf(inventory.get(0).getEdelstenen())+" : "+String.valueOf(inventory.get(0).getBonusEdelstenen()));
        labelSaffierenInInventory.setText(String.valueOf(inventory.get(1).getEdelstenen())+" : "+String.valueOf(inventory.get(1).getBonusEdelstenen()));
        labelSmaragdenInInventory.setText(String.valueOf(inventory.get(2).getEdelstenen())+" : "+String.valueOf(inventory.get(2).getBonusEdelstenen()));
        labelRobijnenInInventory.setText(String.valueOf(inventory.get(3).getEdelstenen())+" : "+String.valueOf(inventory.get(3).getBonusEdelstenen()));
        labelOnyxenInInventory.setText(String.valueOf(inventory.get(4).getEdelstenen())+" : "+String.valueOf(inventory.get(4).getBonusEdelstenen()));
    }

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
    void neemEdelstenen(ActionEvent event) {
        try {
            if (selectedGems.size() == 3) {
                checkSelectedGems3();
            } else if (selectedGems.size() == 2) {
                checkSelectedGems();
            } else {
                throw new IllegalArgumentException("You must select either 2 or 3 gems.");
            }
        } catch (IllegalArgumentException e) {
            // reset the selected gems and update the view
            selectedGems.clear();
            setupEdelstenenAantal();
        }
        btnGem1.setStyle(null);
        btnGem2.setStyle(null);
        btnGem3.setStyle(null);
        btnGem4.setStyle(null);
        btnGem5.setStyle(null);

    }
    
    @FXML
    void btnGem1(ActionEvent event) {
       selectedGems.add("DIAMANTEN");
       btnGem1.setStyle("-fx-background-color: orange;");
    }

    @FXML
    void btnGem2(ActionEvent event) {
    	selectedGems.add("SAFFIEREN");
    	btnGem2.setStyle("-fx-background-color: orange;");
    }

    @FXML
    void btnGem3(ActionEvent event) {
    	selectedGems.add("SMARAGDEN");
    	btnGem3.setStyle("-fx-background-color: orange;");
    }

    @FXML
    void btnGem4(ActionEvent event) {
    	selectedGems.add("ROBIJNEN");
    	btnGem4.setStyle("-fx-background-color: orange;");
    }

    @FXML
    void btnGem5(ActionEvent event) {
    	selectedGems.add("ONYXEN");
    	btnGem5.setStyle("-fx-background-color: orange;");
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