package dto;

public record SpelerDto(
		
		String gebruikersnaam
		
		) {
	public String getGebruikersnaam() {
		return gebruikersnaam;
	}
}
