package dto;

import java.awt.image.BufferedImage;

public record EdelenDto(
		
		BufferedImage image 
		
		) {
	public BufferedImage getImage() {
		return image;
	}
}
