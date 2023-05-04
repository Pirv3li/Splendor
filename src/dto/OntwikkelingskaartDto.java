package dto;

import java.awt.image.BufferedImage;

public class OntwikkelingskaartDto {
	private int kaartnummer;
    private BufferedImage image;

    public OntwikkelingskaartDto(int kaartnummer, BufferedImage image) {
        this.kaartnummer = kaartnummer;
        this.image = image;
    }

    public int getKaartnummer() {
        return kaartnummer;
    }

    public BufferedImage getImage() {
        return image;
    }
}
