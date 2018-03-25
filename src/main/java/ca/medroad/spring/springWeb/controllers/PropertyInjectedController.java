package ca.medroad.spring.springWeb.controllers;

import ca.medroad.spring.springWeb.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired// to test Manual DI comment this annotation and Controller
    public GreetingServiceImpl greetingService;

    public GreetingServiceImpl getGreetingService() {
        return greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
