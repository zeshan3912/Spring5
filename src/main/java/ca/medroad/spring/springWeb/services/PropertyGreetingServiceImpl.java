package ca.medroad.spring.springWeb.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello I'm in Property";
    }
}
