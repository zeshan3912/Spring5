package ca.medroad.spring.springWeb;

import ca.medroad.spring.springWeb.controllers.SetterInjectedController;
import ca.medroad.spring.springWeb.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;


    @Before
    public void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testHello() {
        assertEquals(GreetingServiceImpl.hello, setterInjectedController.sayHello());

    }
}
