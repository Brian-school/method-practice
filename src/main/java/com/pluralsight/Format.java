package com.pluralsight;

import static java.lang.IO.println;

public class Format {
    static void main() {
        String formattedName = formatName("Brian", "Pearson");
        println(formattedName);
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}
