package ca.medroad.spring.springWeb.services;

public class GreetingServiceImpl implements GreetingService {

    public static String hello = "Hello Sir How are you?";

    @Override
    public String sayHello() {
        return hello;
    }
}
