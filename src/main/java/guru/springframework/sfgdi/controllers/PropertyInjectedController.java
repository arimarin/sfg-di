package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Ari on 13.09.2020
 */
@Controller
public class PropertyInjectedController {

	@Qualifier("propertyInjectedGreetingService")
	@Autowired
	public GreetingService greetinsService;

	public String getGreeting() {
		return greetinsService.sayGreeting();
	}
}
