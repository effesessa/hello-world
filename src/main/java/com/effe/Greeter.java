package com.effe;

/*
 * Simple greeter project to test Jenkins
 */
public class Greeter {

    public Greeter() {

    }

    public String greet(String name) {
        return String.format("Hello %s", name.trim());
    }
}
