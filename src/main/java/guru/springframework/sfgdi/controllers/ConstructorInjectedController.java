package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetinsService;
import org.springframework.stereotype.Controller;

/**
 * Created by Ari on 13.09.2020
 * Most preferred way of doing these
 */
@Controller
public class ConstructorInjectedController {
	private final GreetinsService greetinsService;

	// @Autowired annotation on constructors are optional
	public ConstructorInjectedController(GreetinsService greetinsService) {
		this.greetinsService = greetinsService;
	}

	public String getGreeting() {
		return greetinsService.sayGreeting();
	}
}
