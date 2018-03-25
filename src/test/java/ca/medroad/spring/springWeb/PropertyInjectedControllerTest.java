package ca.medroad.spring.springWeb;

import ca.medroad.spring.springWeb.controllers.PropertyInjectedController;
import ca.medroad.spring.springWeb.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testHello() {
        assertEquals(GreetingServiceImpl.hello, propertyInjectedController.sayHello());
    }
}
