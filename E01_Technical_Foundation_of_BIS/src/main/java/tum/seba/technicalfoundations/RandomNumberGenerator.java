package tum.seba.technicalfoundations;

import java.util.Random;

import org.springframework.stereotype.Component;

// Annotation only necessary for 2.-4.
@Component
public class RandomNumberGenerator {

	public int generateRandomNumber() {
		
		Random r = new Random();
		return r.nextInt(100);
		
	}

}
