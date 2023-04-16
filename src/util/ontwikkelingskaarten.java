package util;
import domein.Ontwikkelingskaart;

import java.util.ArrayList;

import domein.Edelsteen;

public class ontwikkelingskaarten {
	
	
private ArrayList<Ontwikkelingskaart> niveau1 = new ArrayList<>();
private ArrayList<Ontwikkelingskaart> niveau2 = new ArrayList<>();
private ArrayList<Ontwikkelingskaart> niveau3 = new ArrayList<>();

	
	public ontwikkelingskaarten() {
	
	// NIVEAU 1 : 40 kaarten

	Edelsteen[] prijsVanKaart_1 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau1.add(new Ontwikkelingskaart(Edelsteen.ONYXEN, 1, prijsVanKaart_1, 1));
	
	Edelsteen[] prijsVanKaart_2 = {Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(Edelsteen.SAFFIEREN, 0, prijsVanKaart_2, 2));
	
	Edelsteen[] prijsVanKaart_3 = {Edelsteen.DIAMANTEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(Edelsteen.SAFFIEREN, 0, prijsVanKaart_3, 3));
	
	Edelsteen[] prijsVanKaart_4 = {Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(Edelsteen.ONYXEN, 0, prijsVanKaart_4, 4));
	
	Edelsteen[] prijsVanKaart_5 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau1.add(new Ontwikkelingskaart(Edelsteen.ROBIJNEN, 0, prijsVanKaart_5, 5));
	
	// NIEVEAU 2 : 30 kaarten
	
	Edelsteen[] prijsVanKaart_41 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau2.add(new Ontwikkelingskaart(Edelsteen.ONYXEN, 2, prijsVanKaart_41, 41));
	
	Edelsteen[] prijsVanKaart_42 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(Edelsteen.ONYXEN, 1, prijsVanKaart_42, 42));
	
	Edelsteen[] prijsVanKaart_43 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(Edelsteen.ROBIJNEN, 1, prijsVanKaart_43, 43));
	
	Edelsteen[] prijsVanKaart_44 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(Edelsteen.SMARAGDEN, 1, prijsVanKaart_44, 44));
	
	Edelsteen[] prijsVanKaart_45 = {Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(Edelsteen.DIAMANTEN, 2, prijsVanKaart_45, 45));
	
	// NIEVEAU 3 : 20 kaarten
	
	Edelsteen[] prijsVanKaart_71 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN};
	niveau3.add(new Ontwikkelingskaart(Edelsteen.ROBIJNEN, 4, prijsVanKaart_71, 71));
	
	Edelsteen[] prijsVanKaart_72 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(Edelsteen.ONYXEN, 5, prijsVanKaart_72, 72));
	
	Edelsteen[] prijsVanKaart_73 = {Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(Edelsteen.ONYXEN, 4, prijsVanKaart_73, 73));
	
	Edelsteen[] prijsVanKaart_74 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN};
	niveau3.add(new Ontwikkelingskaart(Edelsteen.SMARAGDEN, 4, prijsVanKaart_74, 74));
	
	Edelsteen[] prijsVanKaart_75 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(Edelsteen.DIAMANTEN, 5, prijsVanKaart_75, 75));	
	
	}
	
	public ArrayList<Ontwikkelingskaart> getNiveau1Kaarten(){
		return niveau1;
	}
	
	public ArrayList<Ontwikkelingskaart> getNiveau2Kaarten(){
		return niveau2;
	}
	
	public ArrayList<Ontwikkelingskaart> getNiveau3Kaarten(){
		return niveau3;
	}
	
}
