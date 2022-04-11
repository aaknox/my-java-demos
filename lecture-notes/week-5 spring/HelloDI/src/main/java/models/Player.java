package models;

import lombok.*;

// If Lombok doesn't create your constructors for you in the dao layer, 
// follow instructions here: https://stackoverflow.com/questions/45461777/lombok-problems-with-eclipse-oxygen

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Player {

	private String firstName;
	private String lastName;
	private int highScore;
}
