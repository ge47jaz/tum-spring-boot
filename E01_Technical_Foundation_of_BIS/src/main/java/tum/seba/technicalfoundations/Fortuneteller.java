package tum.seba.technicalfoundations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Annotation only necessary for 2.-4.
@Component
public class Fortuneteller {

	// Annotation only necessary for 2.
	@Autowired
	private RandomNumberGenerator rng;

	// Annotation only necessary for 4.
	@Autowired
	public Fortuneteller(RandomNumberGenerator rng) {
		this.rng = rng;
	}

	public RandomNumberGenerator getRng() {
		return rng;
	}

	// Annotation only necessary for 3.
	@Autowired
	public void setRng(RandomNumberGenerator rng) {
		this.rng = rng;
	}

	public String tellFortune() {
		return "Your lucky number of the day is: " + rng.generateRandomNumber();
	}

}
