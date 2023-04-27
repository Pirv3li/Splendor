package ui;
import domein.Domeincontroller;

import java.io.IOException;
import java.util.Scanner;

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
			try {
				dc.setOntwikkelingskaartenOverzichtEnEdelenOverzicht();
			} catch (IOException e) {
				e.printStackTrace();
			}
			dc.setstartSpelerIndex();
			while(dc.getPunten()<15) {
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
			System.out.println(naamVanSpelerAanDeBeurt + " (Je bent aan de beurt) Neem een edelsteen(Type 1) of koop een ontwikkelingskaart(Type 2)");
			int EdelsteenNemenOfKaartKopen = in.nextInt();
			in.nextLine();
			if(EdelsteenNemenOfKaartKopen==1) {
			System.out.println("Edelsteen:");
			String Edelsteen = in.nextLine();
			System.out.println("aantal:");
			int aantal = in.nextInt();
			in.nextLine();
			if(aantal==1) {
				dc.neemEdelstenen(Edelsteen, aantal);
				System.out.println("Edelsteen 2:");
				String EdelsteenTwee = in.nextLine();
				dc.neemEdelstenen(EdelsteenTwee, aantal);
				System.out.println("Edelsteen 3:");
				String EdelsteenDrie = in.nextLine();
				dc.neemEdelstenen(EdelsteenDrie, aantal);
			}
			else {
				dc.neemEdelstenen(Edelsteen, aantal);
				}
			}
			if(EdelsteenNemenOfKaartKopen==2) {
				System.out.println("geef kaartnummer van kaart dat je wilt kopen : ");
				int kaartnummer = in.nextInt();
				validInput = false;
				while(!validInput) {
				try {
				dc.koopOntwikkelingskaart(kaartnummer);
				validInput = true;
				}catch(IllegalArgumentException e) {
					System.out.println(e.getMessage());
					System.out.println("geef kaartnummer van kaart dat je wilt kopen : ");
					kaartnummer = in.nextInt();
					}
				}
				in.nextLine();
			}
			dc.volgendeSpeler();
			}
		}
		in.close();
	}
}
