package com.pluralsight;

import static java.lang.IO.println;

public class CompareNumbers {
    static void main() {
        int num1 = -5;
        int num2 = 12;
        printStatus(num1);
        printStatus(num2);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static void printStatus(int num) {
        println("Number " + num + " is " +
                ((isEven(num)) ? "even" : "odd") +
                " and " +
                ((isPositive(num)) ? "positive" : "negative"));
    }
}
