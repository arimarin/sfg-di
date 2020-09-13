package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Ari on 13.09.2020
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Spurdo spear from PRIMARY!";
	}
}
