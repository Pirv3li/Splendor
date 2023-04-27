package util;
import domein.Ontwikkelingskaart;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import domein.Edelsteen;

public class ontwikkelingskaarten {
	
	
private ArrayList<Ontwikkelingskaart> niveau1 = new ArrayList<>();
private ArrayList<Ontwikkelingskaart> niveau2 = new ArrayList<>();
private ArrayList<Ontwikkelingskaart> niveau3 = new ArrayList<>();

	
	public ontwikkelingskaarten() throws IOException {
	
	// NIVEAU 1 : 40 kaarten
	
	BufferedImage image1 = ImageIO.read(new File("/images/1.png"));
	Edelsteen[] prijsVanKaart_1 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau1.add(new Ontwikkelingskaart(image1,1, Edelsteen.ONYXEN, 1, prijsVanKaart_1, 1));

	BufferedImage image2 = ImageIO.read(new File("/images/2.png"));
	Edelsteen[] prijsVanKaart_2 = {Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image2,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_2, 2));

	BufferedImage image3 = ImageIO.read(new File("/images/3.png"));
	Edelsteen[] prijsVanKaart_3 = {Edelsteen.DIAMANTEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image3,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_3, 3));
	
	BufferedImage image4 = ImageIO.read(new File("/images/4.png"));
	Edelsteen[] prijsVanKaart_4 = {Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image4,1, Edelsteen.ONYXEN, 0, prijsVanKaart_4, 4));
	
	BufferedImage image5 = ImageIO.read(new File("/images/5.png"));
	Edelsteen[] prijsVanKaart_5 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau1.add(new Ontwikkelingskaart(image5,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_5, 5));
	
	
	BufferedImage image6 = ImageIO.read(new File("/images/6.png"));
	Edelsteen[] prijsVanKaart_6 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image6,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_6, 6));
	
	BufferedImage image7 = ImageIO.read(new File("/images/7.png"));
	Edelsteen[] prijsVanKaart_7 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN};
	niveau1.add(new Ontwikkelingskaart(image7,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_7, 7));
	
	BufferedImage image8 = ImageIO.read(new File("/images/8.png"));
	Edelsteen[] prijsVanKaart_8 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(image8,1, Edelsteen.ONYXEN, 0, prijsVanKaart_8, 8));
	
	BufferedImage image9 = ImageIO.read(new File("/images/9.png"));
	Edelsteen[] prijsVanKaart_9 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image9,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_9, 9));
	
	BufferedImage image10 = ImageIO.read(new File("/images/10.png"));
	Edelsteen[] prijsVanKaart_10 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image10,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_10, 10));
	
	
	BufferedImage image11 = ImageIO.read(new File("/images/11.png"));
	Edelsteen[] prijsVanKaart_11 = {Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image11,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_11, 11));
	
	BufferedImage image12 = ImageIO.read(new File("/images/12.png"));
	Edelsteen[] prijsVanKaart_12 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(image12,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_12, 12));
	
	BufferedImage image13 = ImageIO.read(new File("/images/13.png"));
	Edelsteen[] prijsVanKaart_13 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image13,1, Edelsteen.ONYXEN, 0, prijsVanKaart_13, 13));
	
	BufferedImage image14 = ImageIO.read(new File("/images/14.png"));
	Edelsteen[] prijsVanKaart_14 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN,Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image14,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_14, 14));
	
	BufferedImage image15 = ImageIO.read(new File("/images/15.png"));
	Edelsteen[] prijsVanKaart_15 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image15,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_15, 15));
	
	
	BufferedImage image16 = ImageIO.read(new File("/images/16.png"));
	Edelsteen[] prijsVanKaart_16 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image16,1, Edelsteen.ONYXEN, 0, prijsVanKaart_16, 16));
	
	BufferedImage image17 = ImageIO.read(new File("/images/17.png"));
	Edelsteen[] prijsVanKaart_17 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(image17,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_17, 17));
	
	BufferedImage image18 = ImageIO.read(new File("/images/18.png"));
	Edelsteen[] prijsVanKaart_18 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image18,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_18, 18));
	
	BufferedImage image19 = ImageIO.read(new File("/images/19.png"));
	Edelsteen[] prijsVanKaart_19 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image19,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_19, 19));
	
	BufferedImage image20 = ImageIO.read(new File("/images/20.png"));
	Edelsteen[] prijsVanKaart_20 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau1.add(new Ontwikkelingskaart(image20,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_20, 20));
	
	BufferedImage image21 = ImageIO.read(new File("/images/21.png"));
	Edelsteen[] prijsVanKaart_21 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image21,1, Edelsteen.ONYXEN, 0, prijsVanKaart_21, 21));
	
	BufferedImage image22 = ImageIO.read(new File("/images/22.png"));
	Edelsteen[] prijsVanKaart_22 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image22,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_22, 22));
	
	BufferedImage image23 = ImageIO.read(new File("/images/23.png"));
	Edelsteen[] prijsVanKaart_23 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image23,1, Edelsteen.ONYXEN, 0, prijsVanKaart_23, 23));
	
	BufferedImage image24 = ImageIO.read(new File("/images/24.png"));
	Edelsteen[] prijsVanKaart_24 = {Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image24,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_24, 24));
	
	BufferedImage image25 = ImageIO.read(new File("/images/25.png"));
	Edelsteen[] prijsVanKaart_25 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image25,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_25, 25));
	
	BufferedImage image26 = ImageIO.read(new File("/images/26.png"));
	Edelsteen[] prijsVanKaart_26 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image26,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_26, 26));
	
	BufferedImage image27 = ImageIO.read(new File("/images/27.png"));
	Edelsteen[] prijsVanKaart_27 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image27,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_27, 27));
	
	BufferedImage image28 = ImageIO.read(new File("/images/28.png"));
	Edelsteen[] prijsVanKaart_28 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image28,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_28, 28));
	
	BufferedImage image29 = ImageIO.read(new File("/images/29.png"));
	Edelsteen[] prijsVanKaart_29 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image29,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_29, 29));
	
	BufferedImage image30 = ImageIO.read(new File("/images/30.png"));
	Edelsteen[] prijsVanKaart_30 = {Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image30,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_30, 30));
	
	BufferedImage image31 = ImageIO.read(new File("/images/31.png"));
	Edelsteen[] prijsVanKaart_31 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(image31,1, Edelsteen.DIAMANTEN, 1, prijsVanKaart_31, 31));
	
	BufferedImage image32 = ImageIO.read(new File("/images/32.png"));
	Edelsteen[] prijsVanKaart_32 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image32,1, Edelsteen.SMARAGDEN, 1, prijsVanKaart_32, 32));
	
	BufferedImage image33 = ImageIO.read(new File("/images/33.png"));
	Edelsteen[] prijsVanKaart_33 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image33,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_33, 33));
	
	BufferedImage image34 = ImageIO.read(new File("/images/34.png"));
	Edelsteen[] prijsVanKaart_34 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image34,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_34, 34));
	
	BufferedImage image35 = ImageIO.read(new File("/images/35.png"));
	Edelsteen[] prijsVanKaart_35 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau1.add(new Ontwikkelingskaart(image35,1, Edelsteen.ROBIJNEN, 1, prijsVanKaart_35, 35));
	
	BufferedImage image36 = ImageIO.read(new File("/images/36.png"));
	Edelsteen[] prijsVanKaart_36 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image36,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_36, 36));
	
	BufferedImage image37 = ImageIO.read(new File("/images/37.png"));
	Edelsteen[] prijsVanKaart_37 = {Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image37,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_37, 37));
	
	BufferedImage image38 = ImageIO.read(new File("/images/38.png"));
	Edelsteen[] prijsVanKaart_38 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image38,1, Edelsteen.SAFFIEREN, 1, prijsVanKaart_38, 38));
	
	BufferedImage image39 = ImageIO.read(new File("/images/39.png"));
	Edelsteen[] prijsVanKaart_39 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image39,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_39, 39));
	
	BufferedImage image40 = ImageIO.read(new File("/images/40.png"));
	Edelsteen[] prijsVanKaart_40 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image40,1, Edelsteen.ONYXEN, 0, prijsVanKaart_40, 40));
	
	// NIEVEAU 2 : 30 kaarten
	BufferedImage image41 = ImageIO.read(new File("/images/41.png"));
	Edelsteen[] prijsVanKaart_41 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau2.add(new Ontwikkelingskaart(image41,2, Edelsteen.ONYXEN, 2, prijsVanKaart_41, 41));
	
	BufferedImage image42 = ImageIO.read(new File("/images/42.png"));
	Edelsteen[] prijsVanKaart_42 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(image42,2, Edelsteen.ONYXEN, 1, prijsVanKaart_42, 42));
	
	BufferedImage image43 = ImageIO.read(new File("/images/43.png"));
	Edelsteen[] prijsVanKaart_43 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image43,2, Edelsteen.ROBIJNEN, 1, prijsVanKaart_43, 43));
	
	BufferedImage image44 = ImageIO.read(new File("/images/44.png"));
	Edelsteen[] prijsVanKaart_44 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image44,2, Edelsteen.SMARAGDEN, 1, prijsVanKaart_44, 44));
	
	BufferedImage image45 = ImageIO.read(new File("/images/45.png"));
	Edelsteen[] prijsVanKaart_45 = {Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image45,2, Edelsteen.DIAMANTEN, 2, prijsVanKaart_45, 45));
	
	BufferedImage image46 = ImageIO.read(new File("/images/46.png"));
	Edelsteen[] prijsVanKaart_46 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image46,2, Edelsteen.DIAMANTEN, 1, prijsVanKaart_46, 46));
	
	BufferedImage image47 = ImageIO.read(new File("/images/47.png"));
	Edelsteen[] prijsVanKaart_47 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image47,2, Edelsteen.SMARAGDEN, 1, prijsVanKaart_47, 47));
	
	BufferedImage image48 = ImageIO.read(new File("/images/48.png"));
	Edelsteen[] prijsVanKaart_48 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image48,2, Edelsteen.SAFFIEREN, 2, prijsVanKaart_48, 48));
	
	BufferedImage image49 = ImageIO.read(new File("/images/49.png"));
	Edelsteen[] prijsVanKaart_49 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image49,2, Edelsteen.ROBIJNEN, 2, prijsVanKaart_49, 49));
	
	BufferedImage image50 = ImageIO.read(new File("/images/50.png"));
	Edelsteen[] prijsVanKaart_50 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image50,2, Edelsteen.ROBIJNEN, 2, prijsVanKaart_50, 50));
	
	BufferedImage image51 = ImageIO.read(new File("/images/51.png"));
	Edelsteen[] prijsVanKaart_51 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image51,2, Edelsteen.SAFFIEREN, 1, prijsVanKaart_51, 51));
	
	BufferedImage image52 = ImageIO.read(new File("/images/52.png"));
	Edelsteen[] prijsVanKaart_52 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image52,2, Edelsteen.ROBIJNEN, 1, prijsVanKaart_52, 52));
	
	BufferedImage image53 = ImageIO.read(new File("/images/53.png"));
	Edelsteen[] prijsVanKaart_53 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(image53,2, Edelsteen.SMARAGDEN, 3, prijsVanKaart_53, 53));
	
	BufferedImage image54 = ImageIO.read(new File("/images/54.png"));
	Edelsteen[] prijsVanKaart_54 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(image54,2, Edelsteen.ROBIJNEN, 2, prijsVanKaart_54, 54));
	
	BufferedImage image55 = ImageIO.read(new File("/images/55.png"));
	Edelsteen[] prijsVanKaart_55 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau2.add(new Ontwikkelingskaart(image55,2, Edelsteen.SAFFIEREN, 2, prijsVanKaart_55, 55));
	
	BufferedImage image56 = ImageIO.read(new File("/images/56.png"));
	Edelsteen[] prijsVanKaart_56 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(image56,2, Edelsteen.SMARAGDEN, 2, prijsVanKaart_56, 56));
	
	BufferedImage image57 = ImageIO.read(new File("/images/57.png"));
	Edelsteen[] prijsVanKaart_57 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image57,2, Edelsteen.SMARAGDEN, 2, prijsVanKaart_57, 57));
	
	BufferedImage image58 = ImageIO.read(new File("/images/58.png"));
	Edelsteen[] prijsVanKaart_58 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image58,2, Edelsteen.DIAMANTEN, 2, prijsVanKaart_58, 58));
	
	BufferedImage image59 = ImageIO.read(new File("/images/59.png"));
	Edelsteen[] prijsVanKaart_59 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau2.add(new Ontwikkelingskaart(image59,2, Edelsteen.DIAMANTEN, 3, prijsVanKaart_59, 59));
	
	BufferedImage image60 = ImageIO.read(new File("/images/60.png"));
	Edelsteen[] prijsVanKaart_60 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image60,2, Edelsteen.ONYXEN, 2, prijsVanKaart_60, 60));
	
	BufferedImage image61 = ImageIO.read(new File("/images/61.png"));
	Edelsteen[] prijsVanKaart_61 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau2.add(new Ontwikkelingskaart(image61,2, Edelsteen.SAFFIEREN, 3, prijsVanKaart_61, 61));
	
	BufferedImage image62 = ImageIO.read(new File("/images/62.png"));
	Edelsteen[] prijsVanKaart_62 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image62,2, Edelsteen.ONYXEN, 2, prijsVanKaart_62, 62));
	
	BufferedImage image63 = ImageIO.read(new File("/images/63.png"));
	Edelsteen[] prijsVanKaart_63 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image63,2, Edelsteen.DIAMANTEN, 1, prijsVanKaart_63, 63));
	
	BufferedImage image64 = ImageIO.read(new File("/images/64.png"));
	Edelsteen[] prijsVanKaart_64 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image64,2, Edelsteen.SAFFIEREN, 1, prijsVanKaart_64, 64));
	
	BufferedImage image65 = ImageIO.read(new File("/images/65.png"));
	Edelsteen[] prijsVanKaart_65 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image65,2, Edelsteen.ONYXEN, 1, prijsVanKaart_65, 65));
	
	BufferedImage image66 = ImageIO.read(new File("/images/66.png"));
	Edelsteen[] prijsVanKaart_66 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(image66,2, Edelsteen.SMARAGDEN, 2, prijsVanKaart_66, 66));
	
	BufferedImage image67 = ImageIO.read(new File("/images/67.png"));
	Edelsteen[] prijsVanKaart_67 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image67,2, Edelsteen.DIAMANTEN, 2, prijsVanKaart_67, 67));
	
	BufferedImage image68 = ImageIO.read(new File("/images/68.png"));
	Edelsteen[] prijsVanKaart_68 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image68,2, Edelsteen.ROBIJNEN, 3, prijsVanKaart_68, 68));
	
	BufferedImage image69 = ImageIO.read(new File("/images/69.png"));
	Edelsteen[] prijsVanKaart_69 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau2.add(new Ontwikkelingskaart(image69,2, Edelsteen.SAFFIEREN, 2, prijsVanKaart_69, 69));
	
	BufferedImage image70 = ImageIO.read(new File("/images/70.png"));
	Edelsteen[] prijsVanKaart_70 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image70,2, Edelsteen.ROBIJNEN, 3, prijsVanKaart_70, 70));
	
	
	// NIEVEAU 3 : 20 kaarten
	BufferedImage image71 = ImageIO.read(new File("/images/71.png"));
	Edelsteen[] prijsVanKaart_71 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN};
	niveau3.add(new Ontwikkelingskaart(image71,3, Edelsteen.ROBIJNEN, 4, prijsVanKaart_71, 71));
	
	BufferedImage image72 = ImageIO.read(new File("/images/72.png"));
	Edelsteen[] prijsVanKaart_72 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(image72,3, Edelsteen.ONYXEN, 5, prijsVanKaart_72, 72));
	
	BufferedImage image73 = ImageIO.read(new File("/images/73.png"));
	Edelsteen[] prijsVanKaart_73 = {Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(image73,3, Edelsteen.ONYXEN, 4, prijsVanKaart_73, 73));
	
	BufferedImage image74 = ImageIO.read(new File("/images/74.png"));
	Edelsteen[] prijsVanKaart_74 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN};
	niveau3.add(new Ontwikkelingskaart(image74,3, Edelsteen.SMARAGDEN, 4, prijsVanKaart_74, 74));
	
	BufferedImage image75 = ImageIO.read(new File("/images/75.png"));
	Edelsteen[] prijsVanKaart_75 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(image75,3, Edelsteen.DIAMANTEN, 5, prijsVanKaart_75, 75));
	
	BufferedImage image76 = ImageIO.read(new File("/images/76.png"));
	Edelsteen[] prijsVanKaart_76 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image76,3, Edelsteen.DIAMANTEN, 3, prijsVanKaart_76, 76));
	
	BufferedImage image77 = ImageIO.read(new File("/images/77.png"));
	Edelsteen[] prijsVanKaart_77 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,};
	niveau3.add(new Ontwikkelingskaart(image77,3, Edelsteen.ROBIJNEN, 5, prijsVanKaart_77, 77));
	
	BufferedImage image78 = ImageIO.read(new File("/images/78.png"));
	Edelsteen[] prijsVanKaart_78 = {Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image78,3, Edelsteen.SAFFIEREN, 3, prijsVanKaart_78, 78));
	
	BufferedImage image79 = ImageIO.read(new File("/images/79.png"));
	Edelsteen[] prijsVanKaart_79 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image79,3, Edelsteen.SMARAGDEN, 3, prijsVanKaart_79, 79));
	
	BufferedImage image80 = ImageIO.read(new File("/images/80.png"));
	Edelsteen[] prijsVanKaart_80 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN};
	niveau3.add(new Ontwikkelingskaart(image80,3, Edelsteen.ROBIJNEN, 4, prijsVanKaart_80, 80));
	
	BufferedImage image81 = ImageIO.read(new File("/images/81.png"));
	Edelsteen[] prijsVanKaart_81 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN};
	niveau3.add(new Ontwikkelingskaart(image81,3, Edelsteen.SAFFIEREN, 4, prijsVanKaart_81, 81));
	
	BufferedImage image82 = ImageIO.read(new File("/images/82.png"));
	Edelsteen[] prijsVanKaart_82 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN};
	niveau3.add(new Ontwikkelingskaart(image82,3, Edelsteen.ONYXEN, 4, prijsVanKaart_82, 82));
	
	BufferedImage image83 = ImageIO.read(new File("/images/83.png"));
	Edelsteen[] prijsVanKaart_83 = {Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image83,3, Edelsteen.DIAMANTEN, 4, prijsVanKaart_83, 83));
	
	BufferedImage image84 = ImageIO.read(new File("/images/84.png"));
	Edelsteen[] prijsVanKaart_84 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN};
	niveau3.add(new Ontwikkelingskaart(image84,3, Edelsteen.SMARAGDEN, 5, prijsVanKaart_84, 84));
	
	BufferedImage image85 = ImageIO.read(new File("/images/85.png"));
	Edelsteen[] prijsVanKaart_85 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image85,3, Edelsteen.DIAMANTEN, 4, prijsVanKaart_85, 85));
	
	BufferedImage image86 = ImageIO.read(new File("/images/86.png"));
	Edelsteen[] prijsVanKaart_86 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image86,3, Edelsteen.SAFFIEREN, 4, prijsVanKaart_86, 86));
	
	BufferedImage image87 = ImageIO.read(new File("/images/87.png"));
	Edelsteen[] prijsVanKaart_87 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN};
	niveau3.add(new Ontwikkelingskaart(image87,3, Edelsteen.SMARAGDEN, 4, prijsVanKaart_87, 87));
	
	BufferedImage image88 = ImageIO.read(new File("/images/88.png"));
	Edelsteen[] prijsVanKaart_88 = {Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN};
	niveau3.add(new Ontwikkelingskaart(image88,3, Edelsteen.ONYXEN, 3, prijsVanKaart_88, 88));
	
	BufferedImage image89 = ImageIO.read(new File("/images/89.png"));
	Edelsteen[] prijsVanKaart_89 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image89,3, Edelsteen.ROBIJNEN, 3, prijsVanKaart_89, 89));
	
	BufferedImage image90 = ImageIO.read(new File("/images/90.png"));
	Edelsteen[] prijsVanKaart_90 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,};
	niveau3.add(new Ontwikkelingskaart(image90,3, Edelsteen.DIAMANTEN, 5, prijsVanKaart_90, 90));
	
	
	
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
