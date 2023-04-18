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
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ONYXEN, 1, prijsVanKaart_1, 1));
	
	Edelsteen[] prijsVanKaart_2 = {Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_2, 2));
	
	Edelsteen[] prijsVanKaart_3 = {Edelsteen.DIAMANTEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_3, 3));
	
	Edelsteen[] prijsVanKaart_4 = {Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ONYXEN, 0, prijsVanKaart_4, 4));
	
	Edelsteen[] prijsVanKaart_5 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_5, 5));
	
	
	
	Edelsteen[] prijsVanKaart_6 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_6, 6));
	
	Edelsteen[] prijsVanKaart_7 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_7, 7));
	
	Edelsteen[] prijsVanKaart_8 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ONYXEN, 0, prijsVanKaart_8, 8));
	
	Edelsteen[] prijsVanKaart_9 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_9, 9));
	
	Edelsteen[] prijsVanKaart_10 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_10, 10));
	
	
	
	Edelsteen[] prijsVanKaart_11 = {Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_11, 11));
	
	Edelsteen[] prijsVanKaart_12 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_12, 12));
	
	Edelsteen[] prijsVanKaart_13 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ONYXEN, 0, prijsVanKaart_13, 13));
	
	Edelsteen[] prijsVanKaart_14 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN,Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_14, 14));
	
	Edelsteen[] prijsVanKaart_15 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_15, 15));
	
	
	
	Edelsteen[] prijsVanKaart_16 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ONYXEN, 0, prijsVanKaart_16, 16));
	
	Edelsteen[] prijsVanKaart_17 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_17, 17));
	
	Edelsteen[] prijsVanKaart_18 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_18, 18));
	
	Edelsteen[] prijsVanKaart_19 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_19, 19));
	
	Edelsteen[] prijsVanKaart_20 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_20, 20));
	
	
	Edelsteen[] prijsVanKaart_21 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ONYXEN, 0, prijsVanKaart_21, 21));
	
	Edelsteen[] prijsVanKaart_22 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_22, 22));
	
	Edelsteen[] prijsVanKaart_23 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ONYXEN, 0, prijsVanKaart_23, 23));
	
	Edelsteen[] prijsVanKaart_24 = {Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_24, 24));
	
	Edelsteen[] prijsVanKaart_25 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_25, 25));
	
	
	Edelsteen[] prijsVanKaart_26 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_26, 26));
	
	Edelsteen[] prijsVanKaart_27 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_27, 27));
	
	Edelsteen[] prijsVanKaart_28 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_28, 28));
	
	Edelsteen[] prijsVanKaart_29 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_29, 29));
	
	Edelsteen[] prijsVanKaart_30 = {Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_30, 30));
	
	
	Edelsteen[] prijsVanKaart_31 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.DIAMANTEN, 1, prijsVanKaart_31, 31));
	
	Edelsteen[] prijsVanKaart_32 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SMARAGDEN, 1, prijsVanKaart_32, 32));
	
	Edelsteen[] prijsVanKaart_33 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_33, 33));
	
	Edelsteen[] prijsVanKaart_34 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_34, 34));
	
	Edelsteen[] prijsVanKaart_35 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ROBIJNEN, 1, prijsVanKaart_35, 35));
	
	
	Edelsteen[] prijsVanKaart_36 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_36, 36));
	
	Edelsteen[] prijsVanKaart_37 = {Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_37, 37));
	
	Edelsteen[] prijsVanKaart_38 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.SAFFIEREN, 1, prijsVanKaart_38, 38));
	
	Edelsteen[] prijsVanKaart_39 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_39, 39));
	
	Edelsteen[] prijsVanKaart_40 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(1, Edelsteen.ONYXEN, 0, prijsVanKaart_40, 40));
	
	// NIEVEAU 2 : 30 kaarten
	
	Edelsteen[] prijsVanKaart_41 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ONYXEN, 2, prijsVanKaart_41, 41));
	
	Edelsteen[] prijsVanKaart_42 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ONYXEN, 1, prijsVanKaart_42, 42));
	
	Edelsteen[] prijsVanKaart_43 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ROBIJNEN, 1, prijsVanKaart_43, 43));
	
	Edelsteen[] prijsVanKaart_44 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SMARAGDEN, 1, prijsVanKaart_44, 44));
	
	Edelsteen[] prijsVanKaart_45 = {Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.DIAMANTEN, 2, prijsVanKaart_45, 45));
	
	
	
	
	Edelsteen[] prijsVanKaart_46 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.DIAMANTEN, 1, prijsVanKaart_46, 46));
	
	Edelsteen[] prijsVanKaart_47 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SMARAGDEN, 1, prijsVanKaart_47, 47));
	
	Edelsteen[] prijsVanKaart_48 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SAFFIEREN, 2, prijsVanKaart_48, 48));
	
	Edelsteen[] prijsVanKaart_49 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ROBIJNEN, 2, prijsVanKaart_49, 49));
	
	Edelsteen[] prijsVanKaart_50 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ROBIJNEN, 2, prijsVanKaart_50, 50));
	
	
	
	
	Edelsteen[] prijsVanKaart_51 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SAFFIEREN, 1, prijsVanKaart_51, 51));
	
	Edelsteen[] prijsVanKaart_52 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ROBIJNEN, 1, prijsVanKaart_52, 52));
	
	Edelsteen[] prijsVanKaart_53 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SMARAGDEN, 3, prijsVanKaart_53, 53));
	
	Edelsteen[] prijsVanKaart_54 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ROBIJNEN, 2, prijsVanKaart_54, 54));
	
	Edelsteen[] prijsVanKaart_55 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SAFFIEREN, 2, prijsVanKaart_55, 55));
	
	
	
	
	Edelsteen[] prijsVanKaart_56 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SMARAGDEN, 2, prijsVanKaart_56, 56));
	
	Edelsteen[] prijsVanKaart_57 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SMARAGDEN, 2, prijsVanKaart_57, 57));
	
	Edelsteen[] prijsVanKaart_58 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.DIAMANTEN, 2, prijsVanKaart_58, 58));
	
	Edelsteen[] prijsVanKaart_59 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.DIAMANTEN, 3, prijsVanKaart_59, 59));
	
	Edelsteen[] prijsVanKaart_60 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ONYXEN, 2, prijsVanKaart_60, 60));
	
	
	
	
	Edelsteen[] prijsVanKaart_61 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SAFFIEREN, 3, prijsVanKaart_61, 61));
	
	Edelsteen[] prijsVanKaart_62 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ONYXEN, 2, prijsVanKaart_62, 62));
	
	Edelsteen[] prijsVanKaart_63 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.DIAMANTEN, 1, prijsVanKaart_63, 63));
	
	Edelsteen[] prijsVanKaart_64 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SAFFIEREN, 1, prijsVanKaart_64, 64));
	
	Edelsteen[] prijsVanKaart_65 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ONYXEN, 1, prijsVanKaart_65, 65));
	
	
	
	Edelsteen[] prijsVanKaart_66 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SMARAGDEN, 2, prijsVanKaart_66, 66));
	
	Edelsteen[] prijsVanKaart_67 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.DIAMANTEN, 2, prijsVanKaart_67, 67));
	
	Edelsteen[] prijsVanKaart_68 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ROBIJNEN, 3, prijsVanKaart_68, 68));
	
	Edelsteen[] prijsVanKaart_69 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.SAFFIEREN, 2, prijsVanKaart_69, 69));
	
	Edelsteen[] prijsVanKaart_70 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(2, Edelsteen.ROBIJNEN, 3, prijsVanKaart_70, 70));
	
	
	// NIEVEAU 3 : 20 kaarten
	
	Edelsteen[] prijsVanKaart_71 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.ROBIJNEN, 4, prijsVanKaart_71, 71));
	
	Edelsteen[] prijsVanKaart_72 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.ONYXEN, 5, prijsVanKaart_72, 72));
	
	Edelsteen[] prijsVanKaart_73 = {Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.ONYXEN, 4, prijsVanKaart_73, 73));
	
	Edelsteen[] prijsVanKaart_74 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.SMARAGDEN, 4, prijsVanKaart_74, 74));
	
	Edelsteen[] prijsVanKaart_75 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.DIAMANTEN, 5, prijsVanKaart_75, 75));
	
	


	Edelsteen[] prijsVanKaart_76 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.DIAMANTEN, 3, prijsVanKaart_76, 76));
	
	Edelsteen[] prijsVanKaart_77 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.ROBIJNEN, 5, prijsVanKaart_77, 77));
	
	Edelsteen[] prijsVanKaart_78 = {Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.SAFFIEREN, 3, prijsVanKaart_78, 78));
	
	Edelsteen[] prijsVanKaart_79 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.SMARAGDEN, 3, prijsVanKaart_79, 79));
	
	Edelsteen[] prijsVanKaart_80 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.ROBIJNEN, 4, prijsVanKaart_80, 80));
	
	
	
	Edelsteen[] prijsVanKaart_81 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.SAFFIEREN, 4, prijsVanKaart_81, 81));
	
	Edelsteen[] prijsVanKaart_82 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.ONYXEN, 4, prijsVanKaart_82, 82));
	
	Edelsteen[] prijsVanKaart_83 = {Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.DIAMANTEN, 4, prijsVanKaart_83, 83));
	
	Edelsteen[] prijsVanKaart_84 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.SMARAGDEN, 5, prijsVanKaart_84, 84));
	
	Edelsteen[] prijsVanKaart_85 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.DIAMANTEN, 4, prijsVanKaart_85, 85));
	
	
	
	Edelsteen[] prijsVanKaart_86 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.SAFFIEREN, 4, prijsVanKaart_86, 86));
	
	Edelsteen[] prijsVanKaart_87 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.SMARAGDEN, 4, prijsVanKaart_87, 87));
	
	Edelsteen[] prijsVanKaart_88 = {Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.ONYXEN, 3, prijsVanKaart_88, 88));
	
	Edelsteen[] prijsVanKaart_89 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.ROBIJNEN, 3, prijsVanKaart_89, 89));
	
	Edelsteen[] prijsVanKaart_90 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,};
	niveau3.add(new Ontwikkelingskaart(3, Edelsteen.DIAMANTEN, 5, prijsVanKaart_90, 90));
	
	
	
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
