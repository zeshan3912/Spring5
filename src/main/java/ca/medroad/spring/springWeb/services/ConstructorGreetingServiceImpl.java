package ca.medroad.spring.springWeb.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello I'm in Constructor";
    }
}
