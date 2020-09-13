package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by Ari on 13.09.2020
 */
@Service
public class ConstructorInjectedGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Spurdo spear from Constructor!";
	}
}
