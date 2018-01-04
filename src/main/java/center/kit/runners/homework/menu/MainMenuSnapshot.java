package center.kit.runners.homework.menu;

import center.kit.app.homework.lesson6menu.Menu;
import java.util.Scanner;

public class MainMenuSnapshot {
    public static void main(String[] args) {
        boolean isExit = false;
        do {
            Menu.items();
            Scanner scanner = new Scanner(System.in);
            if (!scanner.hasNextLine()) {
                if (scanner.hasNextInt()) {
                    int input = scanner.nextInt();
                    if ((input <= 0) || (input > 7)) {
                        System.out.println("Choose item from 1-3");
                    } else {
                        System.out.println("SWITCH");
                    }
                } else {
                    String inputString = scanner.nextLine();
                    if (inputString.equals("exit")) {
                        isExit = true;
                    } else if (inputString.isEmpty()) {
                        System.out.println("You didn't enter anything. Repeat please!");
                    } else {
                        System.out.println("You entered STRING, please read menu instruction");
                    }
                }
            }
        }
        while (!isExit);
    }
}