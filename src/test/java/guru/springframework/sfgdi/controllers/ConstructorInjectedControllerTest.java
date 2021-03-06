package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Ari on 13.09.2020
 */
class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}