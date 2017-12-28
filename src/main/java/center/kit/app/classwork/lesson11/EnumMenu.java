package center.kit.app.classwork.lesson11;


import center.kit.app.homework.lesson6.Menu;

import java.util.Scanner;

public class EnumMenu {
    public static void main(String[] args) {
        boolean isExit = false;
        do {
            Menu.items();
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextLine()) {
                if (scanner.nextLine().isEmpty()) {
                    System.out.println("You didn't enter anything. Repeat please!");
                }
                System.out.println("You didn't enter anything. Repeat please!");
            } else {
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    if ((input <= 0) || (input > 3)) {
                        System.out.println("Choose item from 1-3");
                    } else {
                        switch (input) {
                            case 1:
                                System.out.println("Entered number 1.\n");
                                break;
                            case 2:
                                System.out.println("Entered number 2.\n");
                                break;
                            case 3:
                                System.out.println("Entered number 3.\n");
                                break;
                        }
                    }
                } else {
                    String inputString = scanner.nextLine();
                    if (inputString.equals("exit")) {
                        isExit = true;
                    } else {
                        System.out.println("You entered STRING, please read menu instruction");
                    }
                }
            }

        } while (!isExit);
    }
}