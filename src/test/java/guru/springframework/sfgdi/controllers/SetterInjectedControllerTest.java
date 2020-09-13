package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Ari on 13.09.2020
 */
class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetinsService(new ConstructorInjectedGreetingService());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}