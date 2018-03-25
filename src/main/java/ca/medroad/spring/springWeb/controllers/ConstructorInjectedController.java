package ca.medroad.spring.springWeb.controllers;

import ca.medroad.spring.springWeb.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String sayHello() {
        return greetingService.sayHello();
    }
}
