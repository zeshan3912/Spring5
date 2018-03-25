package ca.medroad.spring.springWeb;

import ca.medroad.spring.springWeb.controllers.ConstructorInjectedController;
import ca.medroad.spring.springWeb.controllers.PropertyInjectedController;
import ca.medroad.spring.springWeb.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringWebApplication.class, args);

		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());

	}
}
