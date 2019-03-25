package mapstruct.entity;

import lombok.Getter;
import lombok.Setter;

public class Car {
	@Getter
	@Setter
	private String make;
	@Getter
	@Setter
	private int numberOfSeats;
}
