package ca.medroad.spring.springWeb;

import ca.medroad.spring.springWeb.controllers.ConstructorInjectedController;
import ca.medroad.spring.springWeb.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;


    @Before
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testHello() {
        assertEquals(GreetingServiceImpl.hello, constructorInjectedController.sayHello());

    }

}
