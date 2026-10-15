package com.pluralsight;
import static java.lang.IO.println;
public class Menu {
    static void main() {
        displayMenu();
        displayMenu();
    }

    public static void displayMenu () {
        println("=== MENU ===\n" +
                "1. Coffee - $3.99\n" +
                "2. Tea - $2.99\n" +
                "3. Cookie - $1.99\n");
    }

}
