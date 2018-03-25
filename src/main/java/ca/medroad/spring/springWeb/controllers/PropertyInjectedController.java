package ca.medroad.spring.springWeb.controllers;

import ca.medroad.spring.springWeb.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public GreetingServiceImpl getGreetingService() {
        return greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
