package gui;
import dto.EdelenDto;
import dto.InventoryDto;

import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.*;
import dto.EdelstenenDto;
import dto.OntwikkelingskaartDto;
import dto.PuntenDto;
import domein.Domeincontroller;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
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
    private Label Punten1;
    
    @FXML
    private Label Punten2;
    
    @FXML
    private Label Punten3;
    
    @FXML
    private Label Punten4;

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
    
    @FXML
    private Button pass;
    
    @FXML
    private Label exceptionLabel;
    
    private ResourceBundle bundle;
    
    private int winnaarIndex;
    
    @FXML
    private Label WinnaarLabel;
    
    @FXML
    private Button InventoryDiamantButton;
    
    @FXML
    private Button InventorySaffierButton;
    
    @FXML
    private Button InventorySmaragdButton;
    
    @FXML
    private Button InventoryRobijnButton;
    
    @FXML
    private Button InventoryOnyxButton;
    
    @FXML
    private Button terugZettenButton;
    
    @FXML
    private Button WinnaarButton;
    
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
    	setLabels();
    }
    
    private void setupEdelenImages() {
        edelen = dc.getEdelen();
        for (int i = 0; i < edelen.size(); i++) {
            EdelenDto edelDto = edelen.get(i);
            switch (i) {
                case 0:
                    setImageToEdelButton(btnEdel1, edelDto);
                    btnEdel1.setVisible(true);
                    break;
                case 1:
                    setImageToEdelButton(btnEdel2, edelDto);
                    btnEdel2.setVisible(true);
                    break;
                case 2:
                    setImageToEdelButton(btnEdel3, edelDto);
                    btnEdel3.setVisible(true);
                    break;
                case 3:
                    setImageToEdelButton(btnEdel4, edelDto);
                    btnEdel4.setVisible(true);
                    break;
                case 4:
                    setImageToEdelButton(btnEdel5, edelDto);
                    btnEdel5.setVisible(true);
                    break;
            }
        }
        btnEdel1.setVisible(edelen.size() >= 1);
        btnEdel2.setVisible(edelen.size() >= 2);
        btnEdel3.setVisible(edelen.size() >= 3);
        btnEdel4.setVisible(edelen.size() >= 4);
        btnEdel5.setVisible(edelen.size() == 5);
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
    		Punten3.setText("");
    	}
    	if(spelerNamen.size()<4) {
    		lblSpeler4.setText("");
    		lblSpeler4AantalPunten.setText("");
    		Punten4.setText("");
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
        int n1Size = Niveau1Kaarten.size();
        int n2Size = Niveau2Kaarten.size();
        int n3Size = Niveau3Kaarten.size();

        if (n1Size > 0 && Niveau1Kaarten.get(0) != null) {
            setImageToButton(btnKaart1, Niveau1Kaarten.get(0));
            btnKaart1.setVisible(true);
        } else {
            btnKaart1.setVisible(false);
        }

        if (n1Size > 1 && Niveau1Kaarten.get(1) != null) {
            setImageToButton(btnKaart2, Niveau1Kaarten.get(1));
            btnKaart2.setVisible(true);
        } else {
            btnKaart2.setVisible(false);
        }

        if (n1Size > 2 && Niveau1Kaarten.get(2) != null) {
            setImageToButton(btnKaart3, Niveau1Kaarten.get(2));
            btnKaart3.setVisible(true);
        } else {
            btnKaart3.setVisible(false);
        }

        if (n1Size > 3 && Niveau1Kaarten.get(3) != null) {
            setImageToButton(btnKaart4, Niveau1Kaarten.get(3));
            btnKaart4.setVisible(true);
        } else {
            btnKaart4.setVisible(false);
        }

        if (n2Size > 0 && Niveau2Kaarten.get(0) != null) {
            setImageToButton(btnKaart5, Niveau2Kaarten.get(0));
            btnKaart5.setVisible(true);
        } else {
            btnKaart5.setVisible(false);
        }

        if (n2Size > 1 && Niveau2Kaarten.get(1) != null) {
            setImageToButton(btnKaart6, Niveau2Kaarten.get(1));
            btnKaart6.setVisible(true);
        } else {
            btnKaart6.setVisible(false);
        }

        if (n2Size > 2 && Niveau2Kaarten.get(2) != null) {
            setImageToButton(btnKaart7, Niveau2Kaarten.get(2));
            btnKaart7.setVisible(true);
        } else {
            btnKaart7.setVisible(false);
        }

        if (n2Size > 3 && Niveau2Kaarten.get(3) != null) {
            setImageToButton(btnKaart8, Niveau2Kaarten.get(3));
            btnKaart8.setVisible(true);
        } else {
            btnKaart8.setVisible(false);
        }

        if (n3Size > 0 && Niveau3Kaarten.get(0) != null) {
            setImageToButton(btnKaart9, Niveau3Kaarten.get(0));
            btnKaart9.setVisible(true);
        } else {
            btnKaart9.setVisible(false);
        }

        if (n3Size > 1 && Niveau3Kaarten.get(1) != null) {
            setImageToButton(btnKaart10, Niveau3Kaarten.get(1));
            btnKaart10.setVisible(true);
        } else {
            btnKaart10.setVisible(false);
        }

        if (n3Size > 2 && Niveau3Kaarten.get(2) != null) {
            setImageToButton(btnKaart11, Niveau3Kaarten.get(2));
            btnKaart11.setVisible(true);
        } else {
            btnKaart11.setVisible(false);
        }
        
        if (n3Size > 3 && Niveau3Kaarten.get(3) != null) {
            setImageToButton(btnKaart12, Niveau3Kaarten.get(3));
            btnKaart12.setVisible(true);
        } else {
            btnKaart12.setVisible(false);
        }
    }



    
    private void setImageToButton(Button button, OntwikkelingskaartDto ontwikkelingskaartDto) {
            Image image = SwingFXUtils.toFXImage(ontwikkelingskaartDto.getImage(), null);
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(129);
            imageView.setFitWidth(90);
            button.setGraphic(imageView);
        if(dc.isBuyable(ontwikkelingskaartDto.getKaartnummer())) {
        	button.setStyle("-fx-background-color: green");
        }
        else {
        	button.setStyle(null);
        }
    }
    
    private void isWinaar() {
    	List<PuntenDto> SpelerPunten = dc.getPunten();
    	 for (int i = 0; i < SpelerPunten.size(); i++) {
    	        if (SpelerPunten.get(i).getPunten() >= 15) {
    			winnaarIndex = i;
    			WinnaarLabel.setText(spelerNamen.get(i)+" "+bundle.getString("won")+" "+SpelerPunten.get(i).getPunten()+" "+bundle.getString("points"));
    	        WinnaarLabel.setVisible(true);
    	        WinnaarLabel.setStyle("-fx-background-image: url('images/SplendorVertikaalInlog.jpg');");
    	        WinnaarButton.setVisible(true);
    	        WinnaarButton.setText(bundle.getString("agane"));
    	        WinnaarLabel.setMouseTransparent(false);
    		}
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
            	dc.setInventoryDto();
            	setInventory();
            } else {
            	throw new IllegalArgumentException(bundle.getString("keuze"));
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
            	dc.setInventoryDto();
            	setInventory();
            } else {
            	throw new IllegalArgumentException(bundle.getString("keuze"));
            }
        } else {
        	throw new IllegalArgumentException(bundle.getString("keuze"));
        }
    }
    
    private void setSpelerAandebeurt() {
    	labelSpelerInventory.setText(dc.getNaamVanSpelerAanDeBeurt()+"'s");
    }
    
    private void setPunten() {
        List<PuntenDto> puntenDto = dc.getPunten();
        String punten1 = String.valueOf(puntenDto.get(0).getPunten());
        lblSpeler1AantalPunten.setText(punten1);
        String punten2 = String.valueOf(puntenDto.get(1).getPunten());
        lblSpeler2AantalPunten.setText(punten2);
        if (puntenDto.size() >= 3) {
            String punten3 = String.valueOf(puntenDto.get(2).getPunten());
            lblSpeler3AantalPunten.setText(punten3);
        }
        if (puntenDto.size() == 4) {
            String punten4 = String.valueOf(puntenDto.get(3).getPunten());
            lblSpeler4AantalPunten.setText(punten4);
        }
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
    
    private void setLabels() {
    	lblStapelNiveau1.setText(String.valueOf(dc.getStapelSizeNiveau1()));
    	lblStapelNiveau2.setText(String.valueOf(dc.getStapelSizeNiveau2()));
    	lblStapelNiveau3.setText(String.valueOf(dc.getStapelSizeNiveau3()));
    }
    
    @FXML
    void WinnaarButton(ActionEvent event) {
        // Get the reference to the current scene
        Scene currentScene = WinnaarButton.getScene();

        // Get the reference to the stage (window) associated with the current scene
        Stage currentStage = (Stage) currentScene.getWindow();

        // Close the current stage (window)
        currentStage.close();

        // Create a new stage for the initial scene
        Stage initialStage = new Stage();

        // Load the initial scene using FXMLLoader
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/UserLogin.fxml"));
        Parent root = null;
		try {
			root = loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        UserLoginController loginController = loader.getController();
        Domeincontroller DC = new Domeincontroller();
        loginController.setDc(DC);

        // Set up the scene and show the stage
        Scene initialScene = new Scene(root, 900, 600);
        initialScene.getStylesheets().add("/css/LoginStyle.css");
        initialStage.setScene(initialScene);
        initialStage.setTitle("Splendor");
        initialStage.show();
    }


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
    void pass(ActionEvent event) {
    	dc.volgendeSpeler();
    	setSpelerAandebeurt();
    	selectedGems = new ArrayList<>();
        dc.setEdelstenenAantalDto();
    	setupEdelstenenAantal();
    	dc.setInventoryDto();
    	setInventory();
    	setPunten();
    	dc.setOntwikkelingskaartenDtos();
    	setupButtonImages();
    }
    
    @FXML
    void neemEdelstenen(ActionEvent event) {
        try {
            if (selectedGems.size() == 3) {
                checkSelectedGems3();
                if(dc.getInventoryCount()>10) {
                	exceptionLabel.setText(bundle.getString("more10"));
                	InventoryDiamantButton.setVisible(true);
                	InventorySaffierButton.setVisible(true);
                	InventorySmaragdButton.setVisible(true);
                	InventoryRobijnButton.setVisible(true);
                	InventoryOnyxButton.setVisible(true);
                	terugZettenButton.setVisible(true);
                	btnGem1.setDisable(true);
                	btnGem2.setDisable(true);
                	btnGem3.setDisable(true);
                	btnGem4.setDisable(true);
                	btnGem5.setDisable(true);
                	neemEdelstenen.setDisable(true);
                	pass.setDisable(true);
                	btnKaart1.setDisable(true);
                 	btnKaart2.setDisable(true);
                 	btnKaart3.setDisable(true);
                 	btnKaart4.setDisable(true);
                 	btnKaart5.setDisable(true);
                 	btnKaart6.setDisable(true);
                 	btnKaart7.setDisable(true);
                 	btnKaart8.setDisable(true);
                 	btnKaart9.setDisable(true);
                 	btnKaart10.setDisable(true);
                 	btnKaart11.setDisable(true);
                 	btnKaart12.setDisable(true);

                }
                else {
                exceptionLabel.setText("");
            	dc.volgendeSpeler();
            	setSpelerAandebeurt();
            	dc.neemEdelenAlsGenoegBonusEdelstenen(); dc.setEdelenDto(); setupEdelenImages();
            	dc.setInventoryDto();
            	setInventory();
            	setPunten();
                dc.setOntwikkelingskaartenDtos();
            	setupButtonImages();
                }
            } else if (selectedGems.size() == 2) {
                checkSelectedGems();
            	 if(dc.getInventoryCount()>10) {
                 	exceptionLabel.setText(bundle.getString("more10"));
                 	InventoryDiamantButton.setVisible(true);
                 	InventorySaffierButton.setVisible(true);
                 	InventorySmaragdButton.setVisible(true);
                 	InventoryRobijnButton.setVisible(true);
                 	InventoryOnyxButton.setVisible(true);
                 	terugZettenButton.setVisible(true);
                 	btnGem1.setDisable(true);
                 	btnGem2.setDisable(true);
                 	btnGem3.setDisable(true);
                 	btnGem4.setDisable(true);
                 	btnGem5.setDisable(true);
                 	neemEdelstenen.setDisable(true);
                 	pass.setDisable(true);
                 	btnKaart1.setDisable(true);
                 	btnKaart2.setDisable(true);
                 	btnKaart3.setDisable(true);
                 	btnKaart4.setDisable(true);
                 	btnKaart5.setDisable(true);
                 	btnKaart6.setDisable(true);
                 	btnKaart7.setDisable(true);
                 	btnKaart8.setDisable(true);
                 	btnKaart9.setDisable(true);
                 	btnKaart10.setDisable(true);
                 	btnKaart11.setDisable(true);
                 	btnKaart12.setDisable(true);

                 }
            	 else {
                exceptionLabel.setText("");
            	dc.volgendeSpeler();
            	setSpelerAandebeurt();
            	dc.neemEdelenAlsGenoegBonusEdelstenen(); dc.setEdelenDto(); setupEdelenImages();
            	dc.setInventoryDto();
            	setInventory();
            	setPunten();
                dc.setOntwikkelingskaartenDtos();
            	setupButtonImages();
            	 }
            }            
            else {
                throw new IllegalArgumentException(bundle.getString("keuze"));
            }
        } catch (IllegalArgumentException e) {
        	String errorMessage = e.getMessage();
        	exceptionLabel.setText(errorMessage);
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
    void zetEdelstenenTerug(ActionEvent event) {
        boolean retry = true;
        while (retry) {
            if (dc.getInventoryCount() - selectedGems.size() <= 10) {
                try {
                    dc.zetEdelstenenTerug(selectedGems);
                    exceptionLabel.setText("");
                    dc.volgendeSpeler();
                    setSpelerAandebeurt();
                    dc.neemEdelenAlsGenoegBonusEdelstenen();
                    dc.setEdelenDto();
                    setupEdelenImages();
                    dc.setEdelstenenAantalDto();
                    setupEdelstenenAantal();
                    dc.setInventoryDto();
                    setInventory();
                    setPunten();
                    dc.setOntwikkelingskaartenDtos();
                    setupButtonImages();
                    terugZettenButton.setVisible(false);
                    InventoryDiamantButton.setVisible(false);
                    InventorySaffierButton.setVisible(false);
                    InventorySmaragdButton.setVisible(false);
                    InventoryRobijnButton.setVisible(false);
                    InventoryOnyxButton.setVisible(false);
                    terugZettenButton.setVisible(false);
                    btnGem1.setDisable(false);
                    btnGem2.setDisable(false);
                    btnGem3.setDisable(false);
                    btnGem4.setDisable(false);
                    btnGem5.setDisable(false);
                    neemEdelstenen.setDisable(false);
                    pass.setDisable(false);
                    btnKaart1.setDisable(false);
                    btnKaart2.setDisable(false);
                    btnKaart3.setDisable(false);
                    btnKaart4.setDisable(false);
                    btnKaart5.setDisable(false);
                    btnKaart6.setDisable(false);
                    btnKaart7.setDisable(false);
                    btnKaart8.setDisable(false);
                    btnKaart9.setDisable(false);
                    btnKaart10.setDisable(false);
                    btnKaart11.setDisable(false);
                    btnKaart12.setDisable(false);
                    retry = false;
                } catch (IllegalArgumentException e) {
                    exceptionLabel.setText(bundle.getString("have0"));
                    selectedGems.clear();
                    InventoryDiamantButton.setStyle(null);
                    InventorySaffierButton.setStyle(null);
                    InventorySmaragdButton.setStyle(null);
                    InventoryRobijnButton.setStyle(null);
                    InventoryOnyxButton.setStyle(null);
                    retry = false;
                }
            } else {
                exceptionLabel.setText(bundle.getString("have0"));
                selectedGems.clear();
                retry = false;
            }
        }

        InventoryDiamantButton.setStyle(null);
        InventorySaffierButton.setStyle(null);
        InventorySmaragdButton.setStyle(null);
        InventoryRobijnButton.setStyle(null);
        InventoryOnyxButton.setStyle(null);
    }


    
	@FXML
	void btnInventoryDiamant (ActionEvent event) {
		selectedGems.add("DIAMANTEN");
		InventoryDiamantButton.setStyle("-fx-background-color: blue;");
	}
	
	@FXML
	void btnInventorySaffier (ActionEvent event) {
		selectedGems.add("SAFFIEREN");
		InventorySaffierButton.setStyle("-fx-background-color: blue;");
	}
	
	@FXML
	void btnInventorySmaragd (ActionEvent event) {
		selectedGems.add("SMARAGDEN");
		InventorySmaragdButton.setStyle("-fx-background-color: blue;");
	}
	
	@FXML
	void btnInventoryRobijn (ActionEvent event) {
		selectedGems.add("ROBIJNEN");
		InventoryRobijnButton.setStyle("-fx-background-color: blue;");
	}
	
	@FXML
	void btnInventoryOnyx (ActionEvent event) {
		selectedGems.add("ONYXEN");
		InventoryOnyxButton.setStyle("-fx-background-color: blue;");
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
        Button button = (Button) event.getSource();
        String buttonId = button.getId();
        int kaartNummer = -1;
        if (buttonId.equals("btnKaart1")) {
            kaartNummer = Niveau1Kaarten.get(0).getKaartnummer();
        }
        try {
            dc.koopOntwikkelingskaart(kaartNummer);
            exceptionLabel.setText("");
            dc.setEdelstenenAantalDto();
        	setupEdelstenenAantal();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
        	dc.volgendeSpeler();
        	setSpelerAandebeurt();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
        	dc.setInventoryDto();
        	setInventory(); 
        	setPunten();
        	setLabels();
        	setupEdelenImages();
        	isWinaar();
        } catch (IllegalArgumentException e) {
        	String errorMessage = e.getMessage();
            exceptionLabel.setText(errorMessage);
        }
    }


    @FXML
    void btnKaart2(ActionEvent event) {
    	   Button button = (Button) event.getSource();
           String buttonId = button.getId();
           int kaartNummer = -1;
           if (buttonId.equals("btnKaart2")) {
               kaartNummer = Niveau1Kaarten.get(1).getKaartnummer();
           }
           try {
               dc.koopOntwikkelingskaart(kaartNummer);
               exceptionLabel.setText("");
               dc.setEdelstenenAantalDto();
           	setupEdelstenenAantal();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
           	dc.volgendeSpeler();
           	setSpelerAandebeurt();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
           	dc.setInventoryDto();
           	setInventory();
           	setPunten();
           	setLabels();
        	setupEdelenImages();
        	isWinaar();
           } catch (IllegalArgumentException e) {
        	   String errorMessage = e.getMessage();
               exceptionLabel.setText(errorMessage);
           }  
    }

    @FXML
    void btnKaart3(ActionEvent event) {
    	   Button button = (Button) event.getSource();
           String buttonId = button.getId();
           int kaartNummer = -1;
           if (buttonId.equals("btnKaart3")) {
               kaartNummer = Niveau1Kaarten.get(2).getKaartnummer();
           }
           try {
               dc.koopOntwikkelingskaart(kaartNummer);
               exceptionLabel.setText("");
               dc.setEdelstenenAantalDto();
           	setupEdelstenenAantal();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
           	dc.volgendeSpeler();
           	setSpelerAandebeurt();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
           	dc.setInventoryDto();
           	setInventory(); 
           	setPunten();
           	setLabels();
        	setupEdelenImages();
        	isWinaar();
           } catch (IllegalArgumentException e) {
        	   String errorMessage = e.getMessage();
               exceptionLabel.setText(errorMessage);
           }   

    }

    @FXML
    void btnKaart4(ActionEvent event) {
    	   Button button = (Button) event.getSource();
           String buttonId = button.getId();
           int kaartNummer = -1;
           if (buttonId.equals("btnKaart4")) {
               kaartNummer = Niveau1Kaarten.get(3).getKaartnummer();
           }
           try {
               dc.koopOntwikkelingskaart(kaartNummer);
               exceptionLabel.setText("");
               dc.setEdelstenenAantalDto();
           	setupEdelstenenAantal();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
           	dc.volgendeSpeler();
           	setSpelerAandebeurt();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
           	dc.setInventoryDto();
           	setInventory();
           	setPunten();
           	setLabels();
        	setupEdelenImages();
        	isWinaar();
           } catch (IllegalArgumentException e) {
        	   String errorMessage = e.getMessage();
               exceptionLabel.setText(errorMessage);
           }         
 
    }

    @FXML
    void btnKaart5(ActionEvent event) {
    	   Button button = (Button) event.getSource();
           String buttonId = button.getId();
           int kaartNummer = -1;
           if (buttonId.equals("btnKaart5")) {
               kaartNummer = Niveau2Kaarten.get(0).getKaartnummer();
           }
           try {
               dc.koopOntwikkelingskaart(kaartNummer);
               exceptionLabel.setText("");
               dc.setEdelstenenAantalDto();
           	setupEdelstenenAantal();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
           	dc.volgendeSpeler();
           	setSpelerAandebeurt();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
           	dc.setInventoryDto();
           	setInventory(); 
           	setPunten();
           	setLabels();
        	setupEdelenImages();
        	isWinaar();
           } catch (IllegalArgumentException e) {
        	   String errorMessage = e.getMessage();
               exceptionLabel.setText(errorMessage);
           }  

    }

    @FXML
    void btnKaart6(ActionEvent event) {
    	 Button button = (Button) event.getSource();
         String buttonId = button.getId();
         int kaartNummer = -1;
         if (buttonId.equals("btnKaart6")) {
             kaartNummer = Niveau2Kaarten.get(1).getKaartnummer();
         }
         try {
             dc.koopOntwikkelingskaart(kaartNummer);
             exceptionLabel.setText("");
             dc.setEdelstenenAantalDto();
         	setupEdelstenenAantal();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
         	dc.volgendeSpeler();
         	setSpelerAandebeurt();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
         	dc.setInventoryDto();
         	setInventory(); 
         	setPunten();
         	setLabels();
        	setupEdelenImages();
        	isWinaar();
         } catch (IllegalArgumentException e) {
        	 String errorMessage = e.getMessage();
             exceptionLabel.setText(errorMessage);
         }        

    }

    @FXML
    void btnKaart7(ActionEvent event) {
    	 Button button = (Button) event.getSource();
         String buttonId = button.getId();
         int kaartNummer = -1;
         if (buttonId.equals("btnKaart7")) {
             kaartNummer = Niveau2Kaarten.get(2).getKaartnummer();
         }
         try {
             dc.koopOntwikkelingskaart(kaartNummer);
             exceptionLabel.setText("");
             dc.setEdelstenenAantalDto();
         	setupEdelstenenAantal();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
         	dc.volgendeSpeler();
         	setSpelerAandebeurt();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
         	dc.setInventoryDto();
         	setInventory();
         	setPunten();
         	setLabels();
        	setupEdelenImages();
        	isWinaar();
         } catch (IllegalArgumentException e) {
        	 String errorMessage = e.getMessage();
             exceptionLabel.setText(errorMessage);
         }     

    }

    @FXML
    void btnKaart8(ActionEvent event) {
    	 Button button = (Button) event.getSource();
         String buttonId = button.getId();
         int kaartNummer = -1;
         if (buttonId.equals("btnKaart8")) {
             kaartNummer = Niveau2Kaarten.get(3).getKaartnummer();
         }
         try {
             dc.koopOntwikkelingskaart(kaartNummer);
             exceptionLabel.setText("");
             dc.setEdelstenenAantalDto();
         	setupEdelstenenAantal();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
         	dc.volgendeSpeler();
         	setSpelerAandebeurt();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
         	dc.setInventoryDto();
         	setInventory(); 
         	setPunten();
         	setLabels();
        	setupEdelenImages();
        	isWinaar();
         } catch (IllegalArgumentException e) {
        	 String errorMessage = e.getMessage();
             exceptionLabel.setText(errorMessage);
         }       
 
    }

    @FXML
    void btnKaart9(ActionEvent event) {
    	 Button button = (Button) event.getSource();
         String buttonId = button.getId();
         int kaartNummer = -1;
         if (buttonId.equals("btnKaart9")) {
             kaartNummer = Niveau3Kaarten.get(0).getKaartnummer();
         }
         try {
             dc.koopOntwikkelingskaart(kaartNummer);
             exceptionLabel.setText("");
             dc.setEdelstenenAantalDto();
         	setupEdelstenenAantal();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
         	dc.volgendeSpeler();
         	setSpelerAandebeurt();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
         	dc.setInventoryDto();
         	setInventory();
         	setPunten();
         	setLabels();
        	setupEdelenImages();
        	isWinaar();
         } catch (IllegalArgumentException e) {
        	 String errorMessage = e.getMessage();
             exceptionLabel.setText(errorMessage);
         }     

    }

    @FXML
    void btnKaart10(ActionEvent event) {
    	 Button button = (Button) event.getSource();
         String buttonId = button.getId();
         int kaartNummer = -1;
         if (buttonId.equals("btnKaart10")) {
             kaartNummer = Niveau3Kaarten.get(1).getKaartnummer();
         }
         try {
             dc.koopOntwikkelingskaart(kaartNummer);
             exceptionLabel.setText("");
             dc.setEdelstenenAantalDto();
         	setupEdelstenenAantal();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
         	dc.volgendeSpeler();
         	setSpelerAandebeurt();
         	dc.setInventoryDto();
         	setInventory();
         	setPunten();
         	setLabels();
        	setupEdelenImages();
        	isWinaar();
         } catch (IllegalArgumentException e) {
        	 String errorMessage = e.getMessage();
             exceptionLabel.setText(errorMessage);
         }      
    }	
    

    @FXML
    void btnKaart11(ActionEvent event) {
    	 Button button = (Button) event.getSource();
         String buttonId = button.getId();
         int kaartNummer = -1;
         if (buttonId.equals("btnKaart11")) {
             kaartNummer = Niveau3Kaarten.get(2).getKaartnummer();
         }
         try {
             dc.koopOntwikkelingskaart(kaartNummer);
             exceptionLabel.setText("");
             dc.setEdelstenenAantalDto();
         	setupEdelstenenAantal();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
         	dc.volgendeSpeler();
         	setSpelerAandebeurt();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
         	dc.setInventoryDto();
         	setInventory(); 
         	setPunten();
         	setLabels();
        	setupEdelenImages();
        	isWinaar();
         } catch (IllegalArgumentException e) {
        	 String errorMessage = e.getMessage();
             exceptionLabel.setText(errorMessage);
         }     

    }
    

    @FXML
    void btnKaart12(ActionEvent event) {
    	 Button button = (Button) event.getSource();
         String buttonId = button.getId();
         int kaartNummer = -1;
         if (buttonId.equals("btnKaart12")) {
             kaartNummer = Niveau3Kaarten.get(3).getKaartnummer();
         }
         try {
             dc.koopOntwikkelingskaart(kaartNummer);
             exceptionLabel.setText("");
             dc.setEdelstenenAantalDto();
         	setupEdelstenenAantal();
        	dc.neemEdelenAlsGenoegBonusEdelstenen(); 
        	dc.setEdelenDto();
         	dc.volgendeSpeler();
         	setSpelerAandebeurt();
            dc.setOntwikkelingskaartenDtos();
            setupButtonImages();
         	dc.setInventoryDto();
         	setInventory(); 
         	setPunten();
         	setLabels();   
         	setupEdelenImages();
         	isWinaar();
         } catch (IllegalArgumentException e) {
        	 String errorMessage = e.getMessage();
             exceptionLabel.setText(errorMessage);
         }   

    }
    
    @FXML
    private Button switchLanguageButton;
    
    @FXML
    private Label inventory;
    
    public void setResourceBundle(ResourceBundle bundle) {
        this.bundle = bundle;
        neemEdelstenen.setText(bundle.getString("take"));
        pass.setText(bundle.getString("pass"));
        switchLanguageButton.setText(bundle.getString("switch"));
        Punten1.setText(bundle.getString("score"));
        Punten2.setText(bundle.getString("score"));
        if(spelerNamen.size()==3 || spelerNamen.size()==4) {
        	Punten3.setText(bundle.getString("score"));
    	}
    	if(spelerNamen.size()==4) {
        	Punten4.setText(bundle.getString("score"));
    	}
    	inventory.setText(bundle.getString("inventory"));
    	terugZettenButton.setText(bundle.getString("return"));
    	InventoryDiamantButton.setText(bundle.getString("kies"));
    	InventorySaffierButton.setText(bundle.getString("kies"));
    	InventorySmaragdButton.setText(bundle.getString("kies"));
    	InventoryRobijnButton.setText(bundle.getString("kies"));
    	InventoryOnyxButton.setText(bundle.getString("kies"));
    }
    
    public void initialize() {
        Locale currentLocale = Locale.getDefault();
        bundle = ResourceBundle.getBundle("resources/messages", currentLocale);
        neemEdelstenen.setText(bundle.getString("take"));
        pass.setText(bundle.getString("pass"));
        switchLanguageButton.setText(bundle.getString("switch"));
        Punten1.setText(bundle.getString("score"));
        Punten2.setText(bundle.getString("score"));
        Punten3.setText(bundle.getString("score"));
        Punten4.setText(bundle.getString("score"));
        inventory.setText(bundle.getString("inventory"));
    	terugZettenButton.setText(bundle.getString("return"));
    	InventoryDiamantButton.setText(bundle.getString("kies"));
    	InventorySaffierButton.setText(bundle.getString("kies"));
    	InventorySmaragdButton.setText(bundle.getString("kies"));
    	InventoryRobijnButton.setText(bundle.getString("kies"));
    	InventoryOnyxButton.setText(bundle.getString("kies"));
    }
    
    @FXML
    public void onLanguageButtonClick() {
        if (bundle.getLocale().equals(new Locale("en", "GB"))) {
            Locale.setDefault(new Locale("nl", "BE"));
        } else {
            Locale.setDefault(new Locale("en", "GB"));
        }
        bundle = ResourceBundle.getBundle("resources/messages", Locale.getDefault());
        setResourceBundle(bundle);
        
        dc.initialize();
    }

}