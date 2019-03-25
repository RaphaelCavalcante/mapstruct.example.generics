package mapstruct.dto;

import lombok.Getter;
import lombok.Setter;

public class CarDTO {
	@Getter
	@Setter
	private String make;
	@Getter
	@Setter
    private int numberOfSeats;
}
