package dto;

public record InventoryDto(
		int edelstenen,
		int bonusEdelstenen
		
		) {
	public int getEdelstenen() {
		return edelstenen;
	}
	public int getBonusEdelstenen() {
		return bonusEdelstenen;
	}

}
