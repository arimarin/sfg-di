package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Ari on 01.09.2020
 */
@Controller
public class MyController {

	public String sayHello() {
		System.out.println("Saying hello");

		String message = "Hi folks!";
		return message;
	}
}
