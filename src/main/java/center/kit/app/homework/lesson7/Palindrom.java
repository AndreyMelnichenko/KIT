package center.kit.app.homework.lesson7;

import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrom(String value) {
        boolean isPalindrom = true;
        for (int i = 0; i < (value.length()) / 2; i++) {
            isPalindrom = isPalindrom && (value.charAt(i) == value.charAt(value.length() - i - 1));
        }
        if (isPalindrom) {
            System.out.println("PALINDROM");
            return true;
        } else {
            System.out.println("NOT PALINDROM");
            return false;
        }
    }

    public static void isPalindrom2() {
        String value = "Abba";
        boolean isPalindrom = true;
        for (int i = 0; i < value.length() - 1; i++) {
            isPalindrom = isPalindrom && (value.charAt(i) == value.charAt(value.length() - i - 1));
        }
        if (isPalindrom) {
            System.out.println("PALINDROM");
        } else {
            System.out.println("NOT PALINDROM");
        }
    }
}
