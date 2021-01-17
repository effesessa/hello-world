package com.effe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

    @Test
    public void testGreetFabrizio() {
        Greeter greeter = new Greeter();
        assertEquals("Hello Fabrizio", greeter.greet("Fabrizio"));
    }

    @Test
    public void testGreetWorld() {
        Greeter greeter = new Greeter();
        assertEquals("Hello World", greeter.greet("World"));
    }
}
