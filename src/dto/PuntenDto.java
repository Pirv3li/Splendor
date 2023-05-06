package dto;

public record PuntenDto(
		int punten
		) {
	public int getPunten() {
		return punten;
	}
}
