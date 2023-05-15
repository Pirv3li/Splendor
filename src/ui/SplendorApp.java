package ui;
import domein.Domeincontroller;
import persistentie.Mapper;

import java.io.IOException;
import java.util.*;

public class SplendorApp {

    private ResourceBundle bundle;

    public void initialize() {
        Locale currentLocale = Locale.getDefault();
        bundle = ResourceBundle.getBundle("resources/messages", currentLocale);
    }
    
	public void SplendorAppStart() {
		String gebruikersnaam = "";
		int geboortejaar = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("Choose language/Kies taal (1=English, 0=Nederlands)");
		int taal = in.nextInt();
		if(taal==1) {
			Locale.setDefault(new Locale("en", "GB"));
			initialize();
		} else {
			Locale.setDefault(new Locale("nl", "BE"));
			initialize();
		}
		
		System.out.println(bundle.getString("uiStart"));
		int startSpelJaOfNee = in.nextInt();
		in.nextLine();
		if(startSpelJaOfNee==1) {
			Domeincontroller dc = new Domeincontroller();
			System.out.println(bundle.getString("uiName"));
			gebruikersnaam = in.nextLine();
			System.out.println(bundle.getString("uiBirth"));
			geboortejaar = in.nextInt();
			in.nextLine();

			boolean validInput = false;

			while (!validInput) {
			    try {
			        dc.voegSpelerToe(gebruikersnaam, geboortejaar);
			        validInput = true;
			    } catch (IllegalArgumentException e) {
			        System.out.println(e.getMessage());
			        System.out.println(bundle.getString("uiName"));
			        gebruikersnaam = in.nextLine();
			        System.out.println(bundle.getString("uiBirth"));
			        geboortejaar = in.nextInt();
			        in.nextLine();
			    }
			}

			System.out.println(bundle.getString("uiAddMore"));
			int meerSpelersToevoegenJaOfNee = in.nextInt();
			in.nextLine();

			while (meerSpelersToevoegenJaOfNee != 0) {
			    validInput = false;
			    System.out.println(bundle.getString("uiName"));
			    gebruikersnaam = in.nextLine();
			    System.out.println(bundle.getString("uiBirth"));
			    geboortejaar = in.nextInt();
			    in.nextLine();

			    while (!validInput) {
			        try {
			            dc.voegSpelerToe(gebruikersnaam, geboortejaar);
			            validInput = true;
			        } catch (IllegalArgumentException e) {
			            System.out.println(e.getMessage());
			            System.out.println(bundle.getString("uiName"));
			            gebruikersnaam = in.nextLine();
			            System.out.println(bundle.getString("uiBirth"));
			            geboortejaar = in.nextInt();
			            in.nextLine();
			        }
			    }

			    System.out.println(bundle.getString("uiAddMore"));
			    meerSpelersToevoegenJaOfNee = in.nextInt();
			    in.nextLine();
			}
			
			dc.startSpel();
			dc.setOntwikkelingskaartenOverzichtEnEdelenOverzicht();
			dc.setstartSpelerIndex();
			
			while(dc.getPuntenVoorUi()<15) {
			String spelersOverzicht = dc.getSpelersOverzicht();
			System.out.println(bundle.getString("uiSpelersOverzicht"));
			System.out.println(spelersOverzicht);
			System.out.println(bundle.getString("uiSpelOverzicht"));
			String edelstenenOverzicht = dc.getEdelstenenOverzicht();
			System.out.println(edelstenenOverzicht);
			String edelenOverzicht = dc.getEdelenOverzicht();
			System.out.println(bundle.getString("uiEdelen"));
			System.out.println(edelenOverzicht);
			String ontwikkelingsKaartenOverzicht = dc.getOntwikkelingskaartenOverzicht();
			System.out.println(bundle.getString("uiOntwikkeling"));
			System.out.println(ontwikkelingsKaartenOverzicht);
			String naamVanSpelerAanDeBeurt = dc.getNaamVanSpelerAanDeBeurt();
			dc.neemEdelenAlsGenoegBonusEdelstenen();
			int EdelsteenNemenOfKaartKopen = 0;
			boolean kaartenLoop = true;
			while(kaartenLoop) {
			while(EdelsteenNemenOfKaartKopen!=1 && EdelsteenNemenOfKaartKopen!=2) {
			System.out.println(naamVanSpelerAanDeBeurt + " "+ bundle.getString("uiBeurt"));
			EdelsteenNemenOfKaartKopen = in.nextInt();
			in.nextLine();
			}
			if(EdelsteenNemenOfKaartKopen==1) {
				List<String> edelstenen = new ArrayList<>();
				int tweeOfDrie = 0;
				while(tweeOfDrie!=2 && tweeOfDrie!=3) {
				System.out.println(bundle.getString("uiKiesGem"));
				tweeOfDrie = in.nextInt();
				in.nextLine();
				}
				if(tweeOfDrie==2) {
				System.out.println(bundle.getString("gem") + " :");
				String tweeZelfdeEdelstenen = in.nextLine();
				edelstenen.add(tweeZelfdeEdelstenen);
				edelstenen.add(tweeZelfdeEdelstenen);
				dc.neemEdelstenen(edelstenen);
				dc.volgendeSpeler();
				break;
				}
				else if(tweeOfDrie==3) {
					System.out.println(bundle.getString("gem") + " 1:");
					edelstenen.add(in.nextLine());
					System.out.println(bundle.getString("gem") + " 2:");
					edelstenen.add(in.nextLine());
					System.out.println(bundle.getString("gem") + " 3:");
					edelstenen.add(in.nextLine());
					dc.neemEdelstenen(edelstenen);
					dc.volgendeSpeler();
					break;
				}
			}
			if(EdelsteenNemenOfKaartKopen==2) {
				System.out.println(bundle.getString("uiKoopKaart"));
				int kaartnummer = in.nextInt();
				if(kaartnummer == 0) {
					break;
				}
				validInput = false;
				while(!validInput) {
				try {
				dc.koopOntwikkelingskaart(kaartnummer);
				validInput = true;
				}catch(Exception e) {
					System.out.println(e.getMessage());
					System.out.println(bundle.getString("uiKoopKaart"));
					kaartnummer = in.nextInt();
					if(kaartnummer == 0) {
						break;
					} 
							}
						}
				in.nextLine();
					}
			
			dc.volgendeSpeler();
				}
			} 
		}
		in.close();
	}
}
