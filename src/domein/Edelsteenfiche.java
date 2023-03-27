package domein;

public class Edelsteenfiche {
	
	private Edelsteen edelsteen;
	
	public Edelsteenfiche(Edelsteen edelsteen) {
		setEdelsteenfiche(edelsteen);
	}
	
	private void setEdelsteenfiche(Edelsteen edelsteen) {
		this.edelsteen=edelsteen;
	}

	public Edelsteen getEdelsteenfiche() {
		return this.edelsteen;
	}

}