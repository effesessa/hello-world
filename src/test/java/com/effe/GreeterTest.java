package com.effe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreeterTest {

    private Greeter greeter;

    @BeforeEach
    void setUp() {
        greeter = new Greeter();
    }

    @Test
    public void testGreetFabrizio() {
        Assertions.assertEquals("Hello Fabrizio", greeter.greet("Fabrizio"));
    }

    @Test
    public void testGreetWorld() {
        Assertions.assertEquals("Hello World", greeter.greet("World"));
    }
}
