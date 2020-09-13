package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("------ Profile:");
		I18nController i18nController = ctx.getBean(I18nController.class);
		System.out.println(i18nController.sayHello() + "\n----- Profile End!");

		System.out.println("------ PRIMARY Bean:");
		// Works also
		//MyController myController = (MyController) ctx.getBean("myController");
		MyController myController = ctx.getBean(MyController.class);
		System.out.println(myController.sayHello() + "\n----- PRIMARY End!");

		System.out.println("------ Property:");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting() + "\n----- Property End!");

		System.out.println("------ Setter:");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting() + "\n----- Setter End!");

		System.out.println("------ Constructor:");
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting() + "\n----- Cosntructor End!");

	}

}
