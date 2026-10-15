package com.pluralsight;

import static java.lang.IO.println;

public class Hello {
    static void main() {
        sayGoodbye();
        sayHello();
        sayGoodMorning();
    }

    public static void sayHello() {
        println("Hello!");
    }

    public static void sayGoodbye() {
        println("Goodbye!");
    }

    public static void sayGoodMorning() {
        println("Good morning!");
    }
}
