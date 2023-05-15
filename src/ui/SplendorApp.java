package ui;
import domein.Domeincontroller;
import java.io.IOException;
import java.util.*;

public class SplendorApp {
	
	public void SplendorAppStart() {
		String gebruikersnaam = "";
		int geboortejaar = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("Start spel ( 1=JA , 0=NEE )");
		int startSpelJaOfNee = in.nextInt();
		in.nextLine();
		if(startSpelJaOfNee==1) {
			Domeincontroller dc = new Domeincontroller();
			System.out.println("Geef u gebruikersnaam : ");
			gebruikersnaam = in.nextLine();
			System.out.println("Geef u geboortejaar : ");
			geboortejaar = in.nextInt();
			in.nextLine();

			boolean validInput = false;

			while (!validInput) {
			    try {
			        dc.voegSpelerToe(gebruikersnaam, geboortejaar);
			        validInput = true;
			    } catch (IllegalArgumentException e) {
			        System.out.println(e.getMessage());
			        System.out.println("Geef u gebruikersnaam : ");
			        gebruikersnaam = in.nextLine();
			        System.out.println("Geef u geboortejaar : ");
			        geboortejaar = in.nextInt();
			        in.nextLine();
			    }
			}

			System.out.println("Wil je meer spelers toevoegen ? ( 1=JA , 0=NEE )");
			int meerSpelersToevoegenJaOfNee = in.nextInt();
			in.nextLine();

			while (meerSpelersToevoegenJaOfNee != 0) {
			    validInput = false;
			    System.out.println("Geef u gebruikersnaam : ");
			    gebruikersnaam = in.nextLine();
			    System.out.println("Geef u geboortejaar : ");
			    geboortejaar = in.nextInt();
			    in.nextLine();

			    while (!validInput) {
			        try {
			            dc.voegSpelerToe(gebruikersnaam, geboortejaar);
			            validInput = true;
			        } catch (IllegalArgumentException e) {
			            System.out.println(e.getMessage());
			            System.out.println("Geef u gebruikersnaam : ");
			            gebruikersnaam = in.nextLine();
			            System.out.println("Geef u geboortejaar : ");
			            geboortejaar = in.nextInt();
			            in.nextLine();
			        }
			    }

			    System.out.println("Wil je meer spelers toevoegen ? ( 1=JA , 0=NEE )");
			    meerSpelersToevoegenJaOfNee = in.nextInt();
			    in.nextLine();
			}
			
			dc.startSpel();
			dc.setOntwikkelingskaartenOverzichtEnEdelenOverzicht();
			dc.setstartSpelerIndex();
			
			while(dc.getPuntenVoorUi()<15) {
			String spelersOverzicht = dc.getSpelersOverzicht();
			System.out.println("Overzicht van spelers");
			System.out.println(spelersOverzicht);
			System.out.println("Overzicht van spel");
			String edelstenenOverzicht = dc.getEdelstenenOverzicht();
			System.out.println(edelstenenOverzicht);
			String edelenOverzicht = dc.getEdelenOverzicht();
			System.out.println("Beschikbare edelen");
			System.out.println(edelenOverzicht);
			String ontwikkelingsKaartenOverzicht = dc.getOntwikkelingskaartenOverzicht();
			System.out.println("Beschikbare ontwikkelingskaarten");
			System.out.println(ontwikkelingsKaartenOverzicht);
			String naamVanSpelerAanDeBeurt = dc.getNaamVanSpelerAanDeBeurt();
			dc.neemEdelenAlsGenoegBonusEdelstenen();
			int EdelsteenNemenOfKaartKopen = 0;
			boolean kaartenLoop = true;
			while(kaartenLoop) {
			while(EdelsteenNemenOfKaartKopen!=1 && EdelsteenNemenOfKaartKopen!=2) {
			System.out.println(naamVanSpelerAanDeBeurt + " (Je bent aan de beurt) Neem een edelsteen(Type 1) of koop een ontwikkelingskaart(Type 2)");
			EdelsteenNemenOfKaartKopen = in.nextInt();
			in.nextLine();
			}
			if(EdelsteenNemenOfKaartKopen==1) {
				List<String> edelstenen = new ArrayList<>();
				int tweeOfDrie = 0;
				while(tweeOfDrie!=2 && tweeOfDrie!=3) {
				System.out.println("Wil je 2 van zelfde soort of 3 van verschillende soort nemen? (vul in 2 of 3)");
				tweeOfDrie = in.nextInt();
				in.nextLine();
				}
				if(tweeOfDrie==2) {
				System.out.println("Edelsteen :");
				String tweeZelfdeEdelstenen = in.nextLine();
				edelstenen.add(tweeZelfdeEdelstenen);
				edelstenen.add(tweeZelfdeEdelstenen);
				dc.neemEdelstenen(edelstenen);
				dc.volgendeSpeler();
				break;
				}
				else if(tweeOfDrie==3) {
					System.out.println("Edelsteen 1:");
					edelstenen.add(in.nextLine());
					System.out.println("Edelsteen 2:");
					edelstenen.add(in.nextLine());
					System.out.println("Edelsteen 3:");
					edelstenen.add(in.nextLine());
					dc.neemEdelstenen(edelstenen);
					dc.volgendeSpeler();
					break;
				}
			}
			if(EdelsteenNemenOfKaartKopen==2) {
				System.out.println("geef kaartnummer van kaart dat je wilt kopen (0 om terug te gaan): ");
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
					System.out.println("geef kaartnummer van kaart dat je wilt kopen (0 om terug te gaan): ");
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
