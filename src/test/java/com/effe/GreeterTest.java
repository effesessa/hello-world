package com.effe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

    private Greeter greeter;

    @BeforeEach
    public void setUp() {
        greeter = new Greeter();
    }
    @Test
    public void testGreetFabrizio() {
        assertEquals("Hello Fabrizio", greeter.greet("Fabrizio"));
    }

    @Test
    public void testGreetWorld() {
        assertEquals("Hello World", greeter.greet("World"));
    }
}
