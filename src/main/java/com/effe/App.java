package com.effe;

public class App {

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        String msg = greeter.greet("App");
        System.out.println(msg);
        System.out.println("Add a println");
    }
}
