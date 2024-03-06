package tum.seba.technicalfoundations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SebaTechnicalFoundationsOfBisSolutionApplication {

	// 2.-4. instantiating ft through dependency injection
	@Autowired
	Fortuneteller ft;

	// Extra: Read custom property from application.properties
	@Value("${my.name}")
	private String name;

	public static void main(String[] args) {
		SpringApplication.run(SebaTechnicalFoundationsOfBisSolutionApplication.class, args);
		// System.out.println("Hello World!");
	}

	@EventListener(ApplicationReadyEvent.class)
	public void execCodeAfterStartup() {
		
		// 1. instantiating rng (and ft) oneself 
		// RandomNumberGenerator rng = new RandomNumberGenerator();
		// Fortuneteller ft = new Fortuneteller(rng);
		
		System.out.println(ft.tellFortune());
		
		// Extra: Output your name
		// System.out.println("My name is: " + name);
	
	}

}
