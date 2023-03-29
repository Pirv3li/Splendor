package ui;
import domein.Domeincontroller;
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
			dc.voegSpelerToe(gebruikersnaam, geboortejaar);
			System.out.println("Wil je meer spelers toevoegen ? ( 1=JA , 0=NEE )");
			int meerSpelersToevoegenJaOfNee = in.nextInt();
			in.nextLine();
			while(meerSpelersToevoegenJaOfNee!=0) {
				System.out.println("Geef u gebruikersnaam : ");
				gebruikersnaam = in.nextLine();
				System.out.println("Geef u geboortejaar : ");
				geboortejaar = in.nextInt();
				dc.voegSpelerToe(gebruikersnaam, geboortejaar);
				System.out.println("Wil je meer spelers toevoegen ? ( 1=JA , 0=NEE )");
				meerSpelersToevoegenJaOfNee = in.nextInt();
				in.nextLine();
			}
			dc.startSpel(); // moet nog aangepast worden
			dc.setstartSpelerIndex();
			String spelersOverzicht = dc.getSpelersOverzicht();
			System.out.println("Overzicht van spelers");
			System.out.println(spelersOverzicht);
		}
		in.close();
	}
}
