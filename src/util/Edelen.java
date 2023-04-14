package util;
import java.util.ArrayList;
import domein.Edelsteen;
import domein.Edel;

public class Edelen {
		
		private ArrayList<Edel> edelen = new ArrayList<>();
	
	public Edelen() {
		Edelsteen[] prijsVanEdel_1 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
		edelen.add(new Edel(3,prijsVanEdel_1,1));
		
		Edelsteen[] prijsVanEdel_2 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ROBIJNEN,Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
		edelen.add(new Edel(3,prijsVanEdel_2,2));
		
		Edelsteen[] prijsVanEdel_3 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
		edelen.add(new Edel(3,prijsVanEdel_3,3));
		
		Edelsteen[] prijsVanEdel_4 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
		edelen.add(new Edel(3,prijsVanEdel_4,4));
		
		Edelsteen[] prijsVanEdel_5 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
		edelen.add(new Edel(3,prijsVanEdel_5,5));
		
		Edelsteen[] prijsVanEdel_6 = {Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
		edelen.add(new Edel(3,prijsVanEdel_6,6));
		
		Edelsteen[] prijsVanEdel_7 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
		edelen.add(new Edel(3,prijsVanEdel_7,7));
		
		Edelsteen[] prijsVanEdel_8 = {Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ONYXEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN};
		edelen.add(new Edel(3,prijsVanEdel_8,8));
		
		Edelsteen[] prijsVanEdel_9 = {Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.SAFFIEREN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN, Edelsteen.DIAMANTEN};
		edelen.add(new Edel(3,prijsVanEdel_9,9));
		
		Edelsteen[] prijsVanEdel_10 = {Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.ROBIJNEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN, Edelsteen.SMARAGDEN};
		edelen.add(new Edel(3,prijsVanEdel_10,10));
		
	}
	
	public ArrayList<Edel> getEdelen(){
		return edelen;
	}
	
}
