package domein;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import dto.OntwikkelingskaartDto;

public class Domeincontroller {
	
	private List<OntwikkelingskaartDto> Niveau1Kaarten;
	private List<OntwikkelingskaartDto> Niveau2Kaarten;
	private List<OntwikkelingskaartDto> Niveau3Kaarten;
	private Spel spel;
//	private ArrayList<Speler> spelers;
//	private SpelerRepository spelerRepository;
// test
	public Domeincontroller() {
		spel = new Spel();
	}

	public void startSpel() {
		spel.startSpel();	
	}
	
	public void setstartSpelerIndex() {
		spel.setStartspelerIndex();
	}
	
	public int getPunten() {
		return spel.telPuntenOp();
	}

	public void voegSpelerToe(String naam, int geboortejaar) {
		spel.voegSpelerToe(naam, geboortejaar);
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
	
	public void neemEdelstenen(String edelsteenString, int aantal) {
		if(aantal==1) {
	    Edelsteen edelsteen = null;
	    try {
	        edelsteen = Edelsteen.valueOf(edelsteenString.toUpperCase());
	    } catch (IllegalArgumentException e) {
	        System.out.println("Invalid Edelsteenfiche");
	    }
	    if (edelsteen != null) {
	        spel.neem_1_Edelsteen(edelsteen, aantal);
	    	}
		}
		if(aantal==2) {
			Edelsteen edelsteen = null;
			try {
		        edelsteen = Edelsteen.valueOf(edelsteenString.toUpperCase());
		    } catch (IllegalArgumentException e) {
		        System.out.println("Invalid Edelsteenfiche");
		    }
			if(edelsteen != null) {
			spel.neem_2_Edelstenen(edelsteen, aantal);
				}
			}
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
		Niveau1Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau1Kaarten().get(0).getKaartnummer(),spel.getNiveau1Kaarten().get(0).getImage()));
		Niveau1Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau1Kaarten().get(1).getKaartnummer(),spel.getNiveau1Kaarten().get(1).getImage()));
		Niveau1Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau1Kaarten().get(2).getKaartnummer(),spel.getNiveau1Kaarten().get(2).getImage()));
		Niveau1Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau1Kaarten().get(3).getKaartnummer(),spel.getNiveau1Kaarten().get(3).getImage()));
		
		Niveau2Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau2Kaarten().get(0).getKaartnummer(),spel.getNiveau2Kaarten().get(0).getImage()));
		Niveau2Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau2Kaarten().get(1).getKaartnummer(),spel.getNiveau2Kaarten().get(1).getImage()));
		Niveau2Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau2Kaarten().get(2).getKaartnummer(),spel.getNiveau2Kaarten().get(2).getImage()));
		Niveau2Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau2Kaarten().get(3).getKaartnummer(),spel.getNiveau2Kaarten().get(3).getImage()));
		
		Niveau3Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau3Kaarten().get(0).getKaartnummer(),spel.getNiveau3Kaarten().get(0).getImage()));
		Niveau3Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau3Kaarten().get(1).getKaartnummer(),spel.getNiveau3Kaarten().get(1).getImage()));
		Niveau3Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau3Kaarten().get(2).getKaartnummer(),spel.getNiveau3Kaarten().get(2).getImage()));
		Niveau3Kaarten.add(new OntwikkelingskaartDto(spel.getNiveau3Kaarten().get(3).getKaartnummer(),spel.getNiveau3Kaarten().get(3).getImage()));
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

}