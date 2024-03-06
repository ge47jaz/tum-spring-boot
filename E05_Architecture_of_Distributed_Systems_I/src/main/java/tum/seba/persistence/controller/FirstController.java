package tum.seba.persistence.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {

	@GetMapping("/welcome")
	public String sayHello() {
		return "Hello World!";
	}

}
