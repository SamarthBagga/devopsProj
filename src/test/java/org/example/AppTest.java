package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testGreet() {
        App helloWorld = new App();
        String result = helloWorld.greet("Samarth");
        assertEquals("Hello, Samarth!", result, "Greeting should be correct");
    }

    @Test
    public void testGetDefaultGreeting() {
        App helloWorld = new App();
        String result = helloWorld.getDefaultGreeting();
        assertEquals("Hello, World!", result, "Default greeting should be 'Hello, World!'");
    }
}
