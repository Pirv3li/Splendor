package dto;

public record EdelstenenDto(
	int aantal		
	) {
	public int getEdelsteenAantal() {
		return aantal;
	}
}
