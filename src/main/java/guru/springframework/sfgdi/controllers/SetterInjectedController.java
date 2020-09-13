package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetinsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Ari on 13.09.2020
 */
@Controller
public class SetterInjectedController {

	private GreetinsService greetinsService;

	@Autowired
	public void setGreetinsService(GreetinsService greetinsService) {
		this.greetinsService = greetinsService;
	}

	public String getGreeting() {
		return greetinsService.sayGreeting();
	}
}
