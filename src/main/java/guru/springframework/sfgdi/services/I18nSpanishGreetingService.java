package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Ari on 13.09.2020
 */
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hola! Spurdo Spear desde España!";
	}
}
