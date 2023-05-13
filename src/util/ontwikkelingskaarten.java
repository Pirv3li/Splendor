package util;
import domein.Ontwikkelingskaart;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import domein.Edelsteen;

public class ontwikkelingskaarten {
	
	
public ArrayList<Ontwikkelingskaart> niveau1 = new ArrayList<>();
public ArrayList<Ontwikkelingskaart> niveau2 = new ArrayList<>();
public ArrayList<Ontwikkelingskaart> niveau3 = new ArrayList<>();

	
	public ontwikkelingskaarten() throws IOException {
	
	// NIVEAU 1 : 40 kaarten
		
	String cwd = System.getProperty("user.dir");
	String imagePath = cwd + "/src/images/1.png";
	BufferedImage image1 = ImageIO.read(new File(imagePath));
	Edelsteen[] prijsVanKaart_1 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau1.add(new Ontwikkelingskaart(image1,1, Edelsteen.ONYXEN, 1, prijsVanKaart_1, 1));
	
	String imagePath2 = cwd + "/src/images/2.png";
	BufferedImage image2 = ImageIO.read(new File(imagePath2));
	Edelsteen[] prijsVanKaart_2 = {Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image2,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_2, 2));

	String imagePath3 = cwd + "/src/images/3.png";
	BufferedImage image3 = ImageIO.read(new File(imagePath3));
	Edelsteen[] prijsVanKaart_3 = {Edelsteen.DIAMANTEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image3,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_3, 3));
	
	String imagePath4 = cwd + "/src/images/4.png";
	BufferedImage image4 = ImageIO.read(new File(imagePath4));
	Edelsteen[] prijsVanKaart_4 = {Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image4,1, Edelsteen.ONYXEN, 0, prijsVanKaart_4, 4));
	
	String imagePath5 = cwd + "/src/images/5.png";
	BufferedImage image5 = ImageIO.read(new File(imagePath5));
	Edelsteen[] prijsVanKaart_5 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau1.add(new Ontwikkelingskaart(image5,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_5, 5));
	
	String imagePath6 = cwd + "/src/images/6.png";
	BufferedImage image6 = ImageIO.read(new File(imagePath6));
	Edelsteen[] prijsVanKaart_6 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image6,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_6, 6));
	
	String imagePath7 = cwd + "/src/images/7.png";
	BufferedImage image7 = ImageIO.read(new File(imagePath7));
	Edelsteen[] prijsVanKaart_7 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN};
	niveau1.add(new Ontwikkelingskaart(image7,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_7, 7));
	
	String imagePath8 = cwd + "/src/images/8.png";
	BufferedImage image8 = ImageIO.read(new File(imagePath8));
	Edelsteen[] prijsVanKaart_8 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(image8,1, Edelsteen.ONYXEN, 0, prijsVanKaart_8, 8));
	
	String imagePath9 = cwd + "/src/images/9.png";
	BufferedImage image9 = ImageIO.read(new File(imagePath9));
	Edelsteen[] prijsVanKaart_9 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image9,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_9, 9));
	
	String imagePath10 = cwd + "/src/images/10.png";
	BufferedImage image10 = ImageIO.read(new File(imagePath10));
	Edelsteen[] prijsVanKaart_10 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image10,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_10, 10));
	
	String imagePath11 = cwd + "/src/images/11.png";
	BufferedImage image11 = ImageIO.read(new File(imagePath11));
	Edelsteen[] prijsVanKaart_11 = {Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image11,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_11, 11));
	
	String imagePath12 = cwd + "/src/images/12.png";
	BufferedImage image12 = ImageIO.read(new File(imagePath12));
	Edelsteen[] prijsVanKaart_12 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(image12,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_12, 12));
	
	String imagePath13 = cwd + "/src/images/13.png";
	BufferedImage image13 = ImageIO.read(new File(imagePath13));
	Edelsteen[] prijsVanKaart_13 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image13,1, Edelsteen.ONYXEN, 0, prijsVanKaart_13, 13));
	
	String imagePath14 = cwd + "/src/images/14.png";
	BufferedImage image14 = ImageIO.read(new File(imagePath14));
	Edelsteen[] prijsVanKaart_14 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN,Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image14,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_14, 14));
	
	String imagePath15 = cwd + "/src/images/15.png";
	BufferedImage image15 = ImageIO.read(new File(imagePath15));
	Edelsteen[] prijsVanKaart_15 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image15,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_15, 15));
	
	String imagePath16 = cwd + "/src/images/16.png";
	BufferedImage image16 = ImageIO.read(new File(imagePath16));
	Edelsteen[] prijsVanKaart_16 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image16,1, Edelsteen.ONYXEN, 0, prijsVanKaart_16, 16));
	
	String imagePath17 = cwd + "/src/images/17.png";
	BufferedImage image17 = ImageIO.read(new File(imagePath17));
	Edelsteen[] prijsVanKaart_17 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(image17,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_17, 17));
	
	String imagePath18 = cwd + "/src/images/18.png";
	BufferedImage image18 = ImageIO.read(new File(imagePath18));
	Edelsteen[] prijsVanKaart_18 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image18,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_18, 18));
	
	String imagePath19 = cwd + "/src/images/19.png";
	BufferedImage image19 = ImageIO.read(new File(imagePath19));
	Edelsteen[] prijsVanKaart_19 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image19,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_19, 19));
	
	String imagePath20 = cwd + "/src/images/20.png";
	BufferedImage image20 = ImageIO.read(new File(imagePath20));
	Edelsteen[] prijsVanKaart_20 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau1.add(new Ontwikkelingskaart(image20,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_20, 20));
	
	String imagePath21 = cwd + "/src/images/21.png";
	BufferedImage image21 = ImageIO.read(new File(imagePath21));
	Edelsteen[] prijsVanKaart_21 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image21,1, Edelsteen.ONYXEN, 0, prijsVanKaart_21, 21));
	
	String imagePath22 = cwd + "/src/images/22.png";
	BufferedImage image22 = ImageIO.read(new File(imagePath22));
	Edelsteen[] prijsVanKaart_22 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image22,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_22, 22));
	
	String imagePath23 = cwd + "/src/images/23.png";
	BufferedImage image23 = ImageIO.read(new File(imagePath23));
	Edelsteen[] prijsVanKaart_23 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image23,1, Edelsteen.ONYXEN, 0, prijsVanKaart_23, 23));
	
	String imagePath24 = cwd + "/src/images/24.png";
	BufferedImage image24 = ImageIO.read(new File(imagePath24));
	Edelsteen[] prijsVanKaart_24 = {Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image24,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_24, 24));
	
	String imagePath25 = cwd + "/src/images/25.png";
	BufferedImage image25 = ImageIO.read(new File(imagePath25));
	Edelsteen[] prijsVanKaart_25 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image25,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_25, 25));
	
	String imagePath26 = cwd + "/src/images/26.png";
	BufferedImage image26 = ImageIO.read(new File(imagePath26));
	Edelsteen[] prijsVanKaart_26 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image26,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_26, 26));
	
	String imagePath27 = cwd + "/src/images/27.png";
	BufferedImage image27 = ImageIO.read(new File(imagePath27));
	Edelsteen[] prijsVanKaart_27 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image27,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_27, 27));
	
	String imagePath28 = cwd + "/src/images/28.png";
	BufferedImage image28 = ImageIO.read(new File(imagePath28));
	Edelsteen[] prijsVanKaart_28 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image28,1, Edelsteen.DIAMANTEN, 0, prijsVanKaart_28, 28));
	
	String imagePath29 = cwd + "/src/images/29.png";
	BufferedImage image29 = ImageIO.read(new File(imagePath29));
	Edelsteen[] prijsVanKaart_29 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image29,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_29, 29));
	
	String imagePath30 = cwd + "/src/images/30.png";
	BufferedImage image30 = ImageIO.read(new File(imagePath30));
	Edelsteen[] prijsVanKaart_30 = {Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image30,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_30, 30));
	
	String imagePath31 = cwd + "/src/images/31.png";
	BufferedImage image31 = ImageIO.read(new File(imagePath31));
	Edelsteen[] prijsVanKaart_31 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau1.add(new Ontwikkelingskaart(image31,1, Edelsteen.DIAMANTEN, 1, prijsVanKaart_31, 31));
	
	String imagePath32 = cwd + "/src/images/32.png";
	BufferedImage image32 = ImageIO.read(new File(imagePath32));
	Edelsteen[] prijsVanKaart_32 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image32,1, Edelsteen.SMARAGDEN, 1, prijsVanKaart_32, 32));
	
	String imagePath33 = cwd + "/src/images/33.png";
	BufferedImage image33 = ImageIO.read(new File(imagePath33));
	Edelsteen[] prijsVanKaart_33 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image33,1, Edelsteen.SMARAGDEN, 0, prijsVanKaart_33, 33));
	
	String imagePath34 = cwd + "/src/images/34.png";
	BufferedImage image34 = ImageIO.read(new File(imagePath34));
	Edelsteen[] prijsVanKaart_34 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image34,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_34, 34));
	
	String imagePath35 = cwd + "/src/images/35.png";
	BufferedImage image35 = ImageIO.read(new File(imagePath35));
	Edelsteen[] prijsVanKaart_35 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau1.add(new Ontwikkelingskaart(image35,1, Edelsteen.ROBIJNEN, 1, prijsVanKaart_35, 35));
	
	String imagePath36 = cwd + "/src/images/36.png";
	BufferedImage image36 = ImageIO.read(new File(imagePath36));
	Edelsteen[] prijsVanKaart_36 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image36,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_36, 36));
	
	String imagePath37 = cwd + "/src/images/37.png";
	BufferedImage image37 = ImageIO.read(new File(imagePath37));
	Edelsteen[] prijsVanKaart_37 = {Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN};
	niveau1.add(new Ontwikkelingskaart(image37,1, Edelsteen.SAFFIEREN, 0, prijsVanKaart_37, 37));
	
	String imagePath38 = cwd + "/src/images/38.png";
	BufferedImage image38 = ImageIO.read(new File(imagePath38));
	Edelsteen[] prijsVanKaart_38 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image38,1, Edelsteen.SAFFIEREN, 1, prijsVanKaart_38, 38));
	
	String imagePath39 = cwd + "/src/images/39.png";
	BufferedImage image39 = ImageIO.read(new File(imagePath39));
	Edelsteen[] prijsVanKaart_39 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image39,1, Edelsteen.ROBIJNEN, 0, prijsVanKaart_39, 39));
	
	String imagePath40 = cwd + "/src/images/40.png";
	BufferedImage image40 = ImageIO.read(new File(imagePath40));
	Edelsteen[] prijsVanKaart_40 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN};
	niveau1.add(new Ontwikkelingskaart(image40,1, Edelsteen.ONYXEN, 0, prijsVanKaart_40, 40));
	
	// NIEVEAU 2 : 30 kaarten
	String imagePath41 = cwd + "/src/images/41.png";
	BufferedImage image41 = ImageIO.read(new File(imagePath41));
	Edelsteen[] prijsVanKaart_41 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau2.add(new Ontwikkelingskaart(image41,2, Edelsteen.ONYXEN, 2, prijsVanKaart_41, 41));
	
	String imagePath42 = cwd + "/src/images/42.png";
	BufferedImage image42 = ImageIO.read(new File(imagePath42));
	Edelsteen[] prijsVanKaart_42 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(image42,2, Edelsteen.ONYXEN, 1, prijsVanKaart_42, 42));
	
	String imagePath43 = cwd + "/src/images/43.png";
	BufferedImage image43 = ImageIO.read(new File(imagePath43));
	Edelsteen[] prijsVanKaart_43 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image43,2, Edelsteen.ROBIJNEN, 1, prijsVanKaart_43, 43));
	
	String imagePath44 = cwd + "/src/images/44.png";
	BufferedImage image44 = ImageIO.read(new File(imagePath44));
	Edelsteen[] prijsVanKaart_44 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image44,2, Edelsteen.SMARAGDEN, 1, prijsVanKaart_44, 44));
	
	String imagePath45 = cwd + "/src/images/45.png";
	BufferedImage image45 = ImageIO.read(new File(imagePath45));
	Edelsteen[] prijsVanKaart_45 = {Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image45,2, Edelsteen.DIAMANTEN, 2, prijsVanKaart_45, 45));
	
	String imagePath46 = cwd + "/src/images/46.png";
	BufferedImage image46 = ImageIO.read(new File(imagePath46));
	Edelsteen[] prijsVanKaart_46 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image46,2, Edelsteen.DIAMANTEN, 1, prijsVanKaart_46, 46));
	
	String imagePath47 = cwd + "/src/images/47.png";
	BufferedImage image47 = ImageIO.read(new File(imagePath47));
	Edelsteen[] prijsVanKaart_47 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image47,2, Edelsteen.SMARAGDEN, 1, prijsVanKaart_47, 47));
	
	String imagePath48 = cwd + "/src/images/48.png";
	BufferedImage image48 = ImageIO.read(new File(imagePath48));
	Edelsteen[] prijsVanKaart_48 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image48,2, Edelsteen.SAFFIEREN, 2, prijsVanKaart_48, 48));
	
	String imagePath49 = cwd + "/src/images/49.png";
	BufferedImage image49 = ImageIO.read(new File(imagePath49));
	Edelsteen[] prijsVanKaart_49 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image49,2, Edelsteen.ROBIJNEN, 2, prijsVanKaart_49, 49));
	
	String imagePath50 = cwd + "/src/images/50.png";
	BufferedImage image50 = ImageIO.read(new File(imagePath50));
	Edelsteen[] prijsVanKaart_50 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image50,2, Edelsteen.ROBIJNEN, 2, prijsVanKaart_50, 50));
	
	String imagePath51 = cwd + "/src/images/51.png";
	BufferedImage image51 = ImageIO.read(new File(imagePath51));
	Edelsteen[] prijsVanKaart_51 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image51,2, Edelsteen.SAFFIEREN, 1, prijsVanKaart_51, 51));
	
	String imagePath52 = cwd + "/src/images/52.png";
	BufferedImage image52 = ImageIO.read(new File(imagePath52));
	Edelsteen[] prijsVanKaart_52 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image52,2, Edelsteen.ROBIJNEN, 1, prijsVanKaart_52, 52));
	
	String imagePath53 = cwd + "/src/images/53.png";
	BufferedImage image53 = ImageIO.read(new File(imagePath53));
	Edelsteen[] prijsVanKaart_53 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(image53,2, Edelsteen.SMARAGDEN, 3, prijsVanKaart_53, 53));
	
	String imagePath54 = cwd + "/src/images/54.png";
	BufferedImage image54 = ImageIO.read(new File(imagePath54));
	Edelsteen[] prijsVanKaart_54 = {Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(image54,2, Edelsteen.ROBIJNEN, 2, prijsVanKaart_54, 54));
	
	String imagePath55 = cwd + "/src/images/55.png";
	BufferedImage image55 = ImageIO.read(new File(imagePath55));
	Edelsteen[] prijsVanKaart_55 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau2.add(new Ontwikkelingskaart(image55,2, Edelsteen.SAFFIEREN, 2, prijsVanKaart_55, 55));
	
	String imagePath56 = cwd + "/src/images/56.png";
	BufferedImage image56 = ImageIO.read(new File(imagePath56));
	Edelsteen[] prijsVanKaart_56 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(image56,2, Edelsteen.SMARAGDEN, 2, prijsVanKaart_56, 56));
	
	String imagePath57 = cwd + "/src/images/57.png";
	BufferedImage image57 = ImageIO.read(new File(imagePath57));
	Edelsteen[] prijsVanKaart_57 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image57,2, Edelsteen.SMARAGDEN, 2, prijsVanKaart_57, 57));
	
	String imagePath58 = cwd + "/src/images/58.png";
	BufferedImage image58 = ImageIO.read(new File(imagePath58));
	Edelsteen[] prijsVanKaart_58 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image58,2, Edelsteen.DIAMANTEN, 2, prijsVanKaart_58, 58));
	
	String imagePath59 = cwd + "/src/images/59.png";
	BufferedImage image59 = ImageIO.read(new File(imagePath59));
	Edelsteen[] prijsVanKaart_59 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
	niveau2.add(new Ontwikkelingskaart(image59,2, Edelsteen.DIAMANTEN, 3, prijsVanKaart_59, 59));
	
	String imagePath60 = cwd + "/src/images/60.png";
	BufferedImage image60 = ImageIO.read(new File(imagePath60));
	Edelsteen[] prijsVanKaart_60 = {Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image60,2, Edelsteen.ONYXEN, 2, prijsVanKaart_60, 60));
	
	String imagePath61 = cwd + "/src/images/61.png";
	BufferedImage image61 = ImageIO.read(new File(imagePath61));
	Edelsteen[] prijsVanKaart_61 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau2.add(new Ontwikkelingskaart(image61,2, Edelsteen.SAFFIEREN, 3, prijsVanKaart_61, 61));
	
	String imagePath62 = cwd + "/src/images/62.png";
	BufferedImage image62 = ImageIO.read(new File(imagePath62));
	Edelsteen[] prijsVanKaart_62 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image62,2, Edelsteen.ONYXEN, 2, prijsVanKaart_62, 62));
	
	String imagePath63 = cwd + "/src/images/63.png";
	BufferedImage image63 = ImageIO.read(new File(imagePath63));
	Edelsteen[] prijsVanKaart_63 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image63,2, Edelsteen.DIAMANTEN, 1, prijsVanKaart_63, 63));
	
	String imagePath64 = cwd + "/src/images/64.png";
	BufferedImage image64 = ImageIO.read(new File(imagePath64));
	Edelsteen[] prijsVanKaart_64 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image64,2, Edelsteen.SAFFIEREN, 1, prijsVanKaart_64, 64));
	
	String imagePath65 = cwd + "/src/images/65.png";
	BufferedImage image65 = ImageIO.read(new File(imagePath65));
	Edelsteen[] prijsVanKaart_65 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image65,2, Edelsteen.ONYXEN, 1, prijsVanKaart_65, 65));
	
	String imagePath66 = cwd + "/src/images/66.png";
	BufferedImage image66 = ImageIO.read(new File(imagePath66));
	Edelsteen[] prijsVanKaart_66 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
	niveau2.add(new Ontwikkelingskaart(image66,2, Edelsteen.SMARAGDEN, 2, prijsVanKaart_66, 66));
	
	String imagePath67 = cwd + "/src/images/67.png";
	BufferedImage image67 = ImageIO.read(new File(imagePath67));
	Edelsteen[] prijsVanKaart_67 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image67,2, Edelsteen.DIAMANTEN, 2, prijsVanKaart_67, 67));
	
	String imagePath68 = cwd + "/src/images/68.png";
	BufferedImage image68 = ImageIO.read(new File(imagePath68));
	Edelsteen[] prijsVanKaart_68 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau2.add(new Ontwikkelingskaart(image68,2, Edelsteen.ROBIJNEN, 3, prijsVanKaart_68, 68));
	
	String imagePath69 = cwd + "/src/images/69.png";
	BufferedImage image69 = ImageIO.read(new File(imagePath69));
	Edelsteen[] prijsVanKaart_69 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN};
	niveau2.add(new Ontwikkelingskaart(image69,2, Edelsteen.SAFFIEREN, 2, prijsVanKaart_69, 69));
	
	String imagePath70 = cwd + "/src/images/70.png";
	BufferedImage image70 = ImageIO.read(new File(imagePath70));
	Edelsteen[] prijsVanKaart_70 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
	niveau2.add(new Ontwikkelingskaart(image70,2, Edelsteen.ROBIJNEN, 3, prijsVanKaart_70, 70));
	
	
	// NIEVEAU 3 : 20 kaarten
	String imagePath71 = cwd + "/src/images/71.png";
	BufferedImage image71 = ImageIO.read(new File(imagePath71));
	Edelsteen[] prijsVanKaart_71 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN};
	niveau3.add(new Ontwikkelingskaart(image71,3, Edelsteen.ROBIJNEN, 4, prijsVanKaart_71, 71));
	
	String imagePath72 = cwd + "/src/images/72.png";
	BufferedImage image72 = ImageIO.read(new File(imagePath72));
	Edelsteen[] prijsVanKaart_72 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(image72,3, Edelsteen.ONYXEN, 5, prijsVanKaart_72, 72));
	
	String imagePath73 = cwd + "/src/images/73.png";
	BufferedImage image73 = ImageIO.read(new File(imagePath73));
	Edelsteen[] prijsVanKaart_73 = {Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(image73,3, Edelsteen.ONYXEN, 4, prijsVanKaart_73, 73));
	
	String imagePath74 = cwd + "/src/images/74.png";
	BufferedImage image74 = ImageIO.read(new File(imagePath74));
	Edelsteen[] prijsVanKaart_74 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN};
	niveau3.add(new Ontwikkelingskaart(image74,3, Edelsteen.SMARAGDEN, 4, prijsVanKaart_74, 74));
	
	String imagePath75 = cwd + "/src/images/75.png";
	BufferedImage image75 = ImageIO.read(new File(imagePath75));
	Edelsteen[] prijsVanKaart_75 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,};
	niveau3.add(new Ontwikkelingskaart(image75,3, Edelsteen.DIAMANTEN, 5, prijsVanKaart_75, 75));
	
	String imagePath76 = cwd + "/src/images/76.png";
	BufferedImage image76 = ImageIO.read(new File(imagePath76));
	Edelsteen[] prijsVanKaart_76 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image76,3, Edelsteen.DIAMANTEN, 3, prijsVanKaart_76, 76));
	
	String imagePath77 = cwd + "/src/images/77.png";
	BufferedImage image77 = ImageIO.read(new File(imagePath77));
	Edelsteen[] prijsVanKaart_77 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,};
	niveau3.add(new Ontwikkelingskaart(image77,3, Edelsteen.ROBIJNEN, 5, prijsVanKaart_77, 77));
	
	String imagePath78 = cwd + "/src/images/78.png";
	BufferedImage image78 = ImageIO.read(new File(imagePath78));
	Edelsteen[] prijsVanKaart_78 = {Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image78,3, Edelsteen.SAFFIEREN, 3, prijsVanKaart_78, 78));
	
	String imagePath79 = cwd + "/src/images/79.png";
	BufferedImage image79 = ImageIO.read(new File(imagePath79));
	Edelsteen[] prijsVanKaart_79 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image79,3, Edelsteen.SMARAGDEN, 3, prijsVanKaart_79, 79));
	
	String imagePath80 = cwd + "/src/images/80.png";
	BufferedImage image80 = ImageIO.read(new File(imagePath80));
	Edelsteen[] prijsVanKaart_80 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN};
	niveau3.add(new Ontwikkelingskaart(image80,3, Edelsteen.ROBIJNEN, 4, prijsVanKaart_80, 80));
	
	String imagePath81 = cwd + "/src/images/81.png";
	BufferedImage image81 = ImageIO.read(new File(imagePath81));
	Edelsteen[] prijsVanKaart_81 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN};
	niveau3.add(new Ontwikkelingskaart(image81,3, Edelsteen.SAFFIEREN, 4, prijsVanKaart_81, 81));
	
	String imagePath82 = cwd + "/src/images/82.png";
	BufferedImage image82 = ImageIO.read(new File(imagePath82));
	Edelsteen[] prijsVanKaart_82 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN};
	niveau3.add(new Ontwikkelingskaart(image82,3, Edelsteen.ONYXEN, 4, prijsVanKaart_82, 82));
	
	String imagePath83 = cwd + "/src/images/83.png";
	BufferedImage image83 = ImageIO.read(new File(imagePath83));
	Edelsteen[] prijsVanKaart_83 = {Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image83,3, Edelsteen.DIAMANTEN, 4, prijsVanKaart_83, 83));
	
	String imagePath84 = cwd + "/src/images/84.png";
	BufferedImage image84 = ImageIO.read(new File(imagePath84));
	Edelsteen[] prijsVanKaart_84 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN};
	niveau3.add(new Ontwikkelingskaart(image84,3, Edelsteen.SMARAGDEN, 5, prijsVanKaart_84, 84));
	
	String imagePath85 = cwd + "/src/images/85.png";
	BufferedImage image85 = ImageIO.read(new File(imagePath85));
	Edelsteen[] prijsVanKaart_85 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image85,3, Edelsteen.DIAMANTEN, 4, prijsVanKaart_85, 85));
	
	String imagePath86 = cwd + "/src/images/86.png";
	BufferedImage image86 = ImageIO.read(new File(imagePath86));
	Edelsteen[] prijsVanKaart_86 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.ONYXEN,Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image86,3, Edelsteen.SAFFIEREN, 4, prijsVanKaart_86, 86));
	
	String imagePath87 = cwd + "/src/images/87.png";
	BufferedImage image87 = ImageIO.read(new File(imagePath87));
	Edelsteen[] prijsVanKaart_87 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN};
	niveau3.add(new Ontwikkelingskaart(image87,3, Edelsteen.SMARAGDEN, 4, prijsVanKaart_87, 87));
	
	String imagePath88 = cwd + "/src/images/88.png";
	BufferedImage image88 = ImageIO.read(new File(imagePath88));
	Edelsteen[] prijsVanKaart_88 = {Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN,Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN};
	niveau3.add(new Ontwikkelingskaart(image88,3, Edelsteen.ONYXEN, 3, prijsVanKaart_88, 88));
	
	String imagePath89 = cwd + "/src/images/89.png";
	BufferedImage image89 = ImageIO.read(new File(imagePath89));
	Edelsteen[] prijsVanKaart_89 = {Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SAFFIEREN,Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN,Edelsteen.SMARAGDEN,Edelsteen.ONYXEN, Edelsteen.ONYXEN,Edelsteen.ONYXEN};
	niveau3.add(new Ontwikkelingskaart(image89,3, Edelsteen.ROBIJNEN, 3, prijsVanKaart_89, 89));
	
	String imagePath90 = cwd + "/src/images/90.png";
	BufferedImage image90 = ImageIO.read(new File(imagePath90));
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
