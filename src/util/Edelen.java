package util;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import domein.Edelsteen;
import domein.Edel;

public class Edelen {
		
		private ArrayList<Edel> edelen = new ArrayList<>();
	
	public Edelen() throws IOException {
		String cwd = System.getProperty("user.dir");
		String imagePath = cwd + "/src/images/Edel1.png";
		BufferedImage image1 = ImageIO.read(new File(imagePath));
		Edelsteen[] prijsVanEdel_1 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
		edelen.add(new Edel(image1 ,3,prijsVanEdel_1,1));
		
		String imagePath2 = cwd + "/src/images/Edel2.png";
		BufferedImage image2 = ImageIO.read(new File(imagePath2));
		Edelsteen[] prijsVanEdel_2 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
		edelen.add(new Edel(image2 ,3,prijsVanEdel_2,2));
		
		String imagePath3 = cwd + "/src/images/Edel3.png";
		BufferedImage image3 = ImageIO.read(new File(imagePath3));
		Edelsteen[] prijsVanEdel_3 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
		edelen.add(new Edel(image3 ,3,prijsVanEdel_3,3));
		
		String imagePath4 = cwd + "/src/images/Edel4.png";
		BufferedImage image4 = ImageIO.read(new File(imagePath4));
		Edelsteen[] prijsVanEdel_4 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
		edelen.add(new Edel(image4 ,3,prijsVanEdel_4,4));
		
		String imagePath5 = cwd + "/src/images/Edel5.png";
		BufferedImage image5 = ImageIO.read(new File(imagePath5));
		Edelsteen[] prijsVanEdel_5 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
		edelen.add(new Edel(image5 ,3,prijsVanEdel_5,5));
		
		String imagePath6 = cwd + "/src/images/Edel6.png";
		BufferedImage image6 = ImageIO.read(new File(imagePath6));
		Edelsteen[] prijsVanEdel_6 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
		edelen.add(new Edel(image6 ,3,prijsVanEdel_6,6));
		
		String imagePath7 = cwd + "/src/images/Edel7.png";
		BufferedImage image7 = ImageIO.read(new File(imagePath7));
		Edelsteen[] prijsVanEdel_7 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
		edelen.add(new Edel(image7 ,3,prijsVanEdel_7,7));
		
		String imagePath8 = cwd + "/src/images/Edel8.png";
		BufferedImage image8 = ImageIO.read(new File(imagePath8));
		Edelsteen[] prijsVanEdel_8 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
		edelen.add(new Edel(image8 ,3,prijsVanEdel_8,8));
		
		String imagePath9 = cwd + "/src/images/Edel9.png";
		BufferedImage image9 = ImageIO.read(new File(imagePath9));
		Edelsteen[] prijsVanEdel_9 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
		edelen.add(new Edel(image9 ,3,prijsVanEdel_9,9));
		
		String imagePath10 = cwd + "/src/images/Edel10.png";
		BufferedImage image10 = ImageIO.read(new File(imagePath10));
		Edelsteen[] prijsVanEdel_10 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
		edelen.add(new Edel(image10 ,3,prijsVanEdel_10,10));
		
	}
	
	public ArrayList<Edel> getEdelen(){
		return edelen;
	}
	
}
