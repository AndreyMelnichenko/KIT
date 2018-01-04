package center.kit.app.homework.lesson7;

import java.util.Scanner;

public class GoInput {
    public static void ScanInput (){
        System.out.println("We're going to check your entered word to PALINDROM effect. \nEnter your word: ");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        Palindrom.isPalindrom(value.toLowerCase());
    }
}
