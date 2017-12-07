package center.kit.app.homework.lesson7;

public class Palindrom {
    public static void isPalindrom() {
        String value = "abcba";
        boolean isPalindrom = true;
        for (int i = 0; i < (value.length()) / 2; i++) {
            isPalindrom = isPalindrom && (value.charAt(i) == value.charAt(value.length() - i - 1));
        }
        if (isPalindrom) {
            System.out.println("PALINDROM");
        } else {
            System.out.println("NOT PALINDROM");
        }
    }

    public static void isPalindrom2() {
        String value = "abcba";
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
