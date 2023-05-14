package domein;
import dto.InventoryDto;
import dto.EdelenDto;
import dto.EdelstenenDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import dto.OntwikkelingskaartDto;
import dto.PuntenDto;

public class Domeincontroller {
	private String language = "en"; // Default language is English
	private List<OntwikkelingskaartDto> Niveau1Kaarten;
	private List<OntwikkelingskaartDto> Niveau2Kaarten;
	private List<OntwikkelingskaartDto> Niveau3Kaarten;
	private Spel spel;
	private SpelerRepository repo;
	private ArrayList<EdelstenenDto> aantalEdelstenen;
	private List<EdelenDto> edelen;
	private List<InventoryDto> InventoryDto;
	private ArrayList<String> spelers;
	private ResourceBundle bundle;

	public Domeincontroller() {
		spel = new Spel();
		repo = new SpelerRepository();
		initialize();
	}


    // Getter and setter for language
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
	public void startSpel() {
		spel.startSpel();	
	}
	
	public void setstartSpelerIndex() {
		spel.setStartspelerIndex();
	}
	
	public int getPuntenVoorUi() {
		return spel.getPuntenVoorUi();
	}
	
	public boolean isBuyable(int kaartnummer) {
		return spel.isBuyable(kaartnummer);
	}
	
	public List<PuntenDto> getPunten() {
		ArrayList<Integer> punten = spel.telPuntenOp();
		List<PuntenDto> puntenDto = new ArrayList<>();
		puntenDto.add(new PuntenDto(punten.get(0))); 
		puntenDto.add(new PuntenDto(punten.get(1)));
		if(punten.size()>=3) {
			puntenDto.add(new PuntenDto(punten.get(2)));
		}
		if(punten.size()==4) {
			puntenDto.add(new PuntenDto(punten.get(3)));
		}
		return puntenDto;
	}

	public void voegSpelerToe(String naam, int geboortejaar) {
		spelers = spel.getSpelerNamen();
		if(spelers.contains(naam)) {
			throw new IllegalArgumentException(naam +" " + bundle.getString("alreadyAdded"));
		}
		else if(repo.bestaatSpeler(naam,geboortejaar)) {
		spel.voegSpelerToe(naam, geboortejaar);
		}
	}
	
	public String getSpelersOverzicht() {
		return spel.getSpelersOverzicht();
	}
	
	
	
	public String getEdelstenenOverzicht() {
		return spel.edelstenenOverzicht();
	}
	
	public String getOntwikkelingskaartenOverzicht() {
		return spel.toonOntwikkelingskaartenOverzicht();
	}
	
	public void setOntwikkelingskaartenOverzichtEnEdelenOverzicht() {
		try {
			spel.setOntwikkelingsKaartenOverzicht();
		} catch (IOException e) {
			e.printStackTrace();
		}
		spel.setEdelenOverzicht();
	}
	
	public String getEdelenOverzicht() {
		return spel.toonEdelenOverzicht();
	}
	
	public void neemEdelstenen(List<String> edelsteenStrings) {
	    if (edelsteenStrings == null || edelsteenStrings.isEmpty()) {
	        System.out.println("Invalid Edelstenen selected");
	        return;
	    }
	    
	    List<Edelsteen> edelstenen = new ArrayList<>();
	    for (String edelsteenString : edelsteenStrings) {
	        try {
	            Edelsteen edelsteen = Edelsteen.valueOf(edelsteenString.toUpperCase());
	            edelstenen.add(edelsteen);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Invalid Edelsteenfiche");
	            return;
	        }
	    }
	    
	    if (edelstenen.size() == 3 && new HashSet<>(edelstenen).size() == 3) {
	        spel.neem_1_Edelsteen(edelstenen.get(0),1);
	        spel.neem_1_Edelsteen(edelstenen.get(1),1);
	        spel.neem_1_Edelsteen(edelstenen.get(2),1);
	        return;
	    }
	    
	    if (edelstenen.size() == 2 && edelstenen.get(0).equals(edelstenen.get(1))) {
	        spel.neem_2_Edelstenen(edelstenen.get(0), 2);
	        return;
	    }
	    
	    System.out.println(bundle.getString("keuze"));
	}
	
	public int getInventoryCount() {
		return spel.getInventoryCount();
	}
	
	public void zetEdelstenenTerug(List<String> edelsteenStrings) {
		    spel.zetEdelstenenTerugString(edelsteenStrings);
	}
	
	public void neemEdelenAlsGenoegBonusEdelstenen() {
		spel.neemEdelAlsSpelerGenoegBonusEdelstenenHeeft();
	}
	
	 public int getStapelSizeNiveau1() {
		 return spel.getStapelSizeNiveau1();
	 }
	 
	 public int getStapelSizeNiveau2() {
		 return spel.getStapelSizeNiveau2();
	 }
	 
	 public int getStapelSizeNiveau3() {
		 return spel.getStapelSizeNiveau3();
	 }
	
	public void volgendeSpeler() {
		spel.volgendeSpeler();
	}
	
	public String getNaamVanSpelerAanDeBeurt() {
		return spel.getSpelerAanDeBeurtNaam();
	}
	
	public void koopOntwikkelingskaart(int kaartnummer) {
		try {
			spel.koopOntwikkelingskaart(kaartnummer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setOntwikkelingskaartenDtos() {
	    Niveau1Kaarten = new ArrayList<>();
	    Niveau2Kaarten = new ArrayList<>();
	    Niveau3Kaarten = new ArrayList<>();

	    if (spel.getNiveau1Kaarten().size() > 0) {
	        for (int i = 0; i < 4; i++) {
	            if (i < spel.getNiveau1Kaarten().size()) {
	                OntwikkelingskaartDto kaartDto = new OntwikkelingskaartDto(spel.getNiveau1Kaarten().get(i).getKaartnummer(), spel.getNiveau1Kaarten().get(i).getImage());
	                Niveau1Kaarten.add(kaartDto);
	            } else {
	                Niveau1Kaarten.add(null);
	            }
	        }
	    }

	    if (spel.getNiveau2Kaarten().size() > 0) {
	        for (int i = 0; i < 4; i++) {
	            if (i < spel.getNiveau2Kaarten().size()) {
	                OntwikkelingskaartDto kaartDto = new OntwikkelingskaartDto(spel.getNiveau2Kaarten().get(i).getKaartnummer(), spel.getNiveau2Kaarten().get(i).getImage());
	                Niveau2Kaarten.add(kaartDto);
	            } else {
	                Niveau2Kaarten.add(null);
	            }
	        }
	    }

	    if (spel.getNiveau3Kaarten().size() > 0) {
	        for (int i = 0; i < 4; i++) {
	            if (i < spel.getNiveau3Kaarten().size()) {
	                OntwikkelingskaartDto kaartDto = new OntwikkelingskaartDto(spel.getNiveau3Kaarten().get(i).getKaartnummer(), spel.getNiveau3Kaarten().get(i).getImage());
	                Niveau3Kaarten.add(kaartDto);
	            } else {
	                Niveau3Kaarten.add(null);
	            }
	        }
	    }
	}


	
	public List<OntwikkelingskaartDto> getNiveau1Kaarten(){
		return this.Niveau1Kaarten;
	}
	
	public List<OntwikkelingskaartDto> getNiveau2Kaarten(){
		return this.Niveau2Kaarten;
	}
	
	public List<OntwikkelingskaartDto> getNiveau3Kaarten(){
		return this.Niveau3Kaarten;
	}
	
	public void setEdelstenenAantalDto() {
		aantalEdelstenen = new ArrayList<>();
		HashMap<Edelsteen, Integer> alleEdelstenen = spel.getAlleEdelstenen();
		aantalEdelstenen.add(new EdelstenenDto(alleEdelstenen.get(Edelsteen.DIAMANTEN)));
		aantalEdelstenen.add(new EdelstenenDto(alleEdelstenen.get(Edelsteen.SAFFIEREN)));
		aantalEdelstenen.add(new EdelstenenDto(alleEdelstenen.get(Edelsteen.SMARAGDEN)));
		aantalEdelstenen.add(new EdelstenenDto(alleEdelstenen.get(Edelsteen.ROBIJNEN)));
		aantalEdelstenen.add(new EdelstenenDto(alleEdelstenen.get(Edelsteen.ONYXEN)));
	}
	
	public ArrayList<EdelstenenDto> getEdelstenenAantalDto(){
		return this.aantalEdelstenen;
	}
	
	public ArrayList<String> getSpelerNamen() {
		return spel.getSpelerNamen();
	}
	
	public void setEdelenDto() {
	    edelen = new ArrayList<>();
	    List<Edel> alleEdelen = spel.getEdelen();
	    for (int i = 0; i < alleEdelen.size() && i < 5; i++) {
	        edelen.add(new EdelenDto(alleEdelen.get(i).getEdelImage()));
	    }
	}

	
	public List<EdelenDto> getEdelen(){
		return this.edelen;
	}
	
	public void setInventoryDto(){
	    InventoryDto = new ArrayList<>();
	    List<Integer> inventory = spel.getEdelstenenInventory();
	    List<Integer> bonusInventory = spel.getBonusEdelstenenInventory();
	    InventoryDto.add(new InventoryDto(inventory.get(0), bonusInventory.get(0)));
	    InventoryDto.add(new InventoryDto(inventory.get(1), bonusInventory.get(1)));
	    InventoryDto.add(new InventoryDto(inventory.get(2), bonusInventory.get(2)));
	    InventoryDto.add(new InventoryDto(inventory.get(3), bonusInventory.get(3)));
	    InventoryDto.add(new InventoryDto(inventory.get(4), bonusInventory.get(4)));
	}

	
	public List<InventoryDto> getInventory(){
		return this.InventoryDto;
	}
	
	public void initialize() {
        Locale currentLocale = Locale.getDefault();
        bundle = ResourceBundle.getBundle("resources/messages", currentLocale);
		spel.initialize();
		repo.initialize();
    }//
}