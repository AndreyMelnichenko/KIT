package center.kit.app.homework.lesson7;

import java.util.Scanner;

public class MainMenu {
    public static void menu() throws Exception {
        int menuMaxItem = 5;
        String[] menu = {"Type 'Exit' to exit program or 1-9 to choose menu item",
                "Algorithm - \"SEPARATED\"",
                "Algorithm - \"INVERT COMPARING\""};
        for (int i = 1; i <= menu.length; i++) {
            System.out.println(i + " " + menu[i - 1]);
        }
        Scanner scanner = new Scanner(System.in);
        int exit=0;
        do {
            if ((scanner.hasNextInt()) && (scanner.nextInt() > 1) && (scanner.nextInt() <= menuMaxItem)) {
                System.out.println(scanner.nextInt());
                int inputVal = scanner.nextInt();
                //MainMenu.analyzer(inputVal, menu.length);
            } else {
                System.out.println("Wrong value!");
            }
        } while (exit!=1);
    }

    public static void analyzer(int val, int max_menu_item) {
        int route = 1;
        while (route != 0) {
            if ((val > 0) || (val <= max_menu_item)) {
                switch (val) {
                    case 1:
                        Palindrom.isPalindrom();
                        break;
                    case 2:
                        Palindrom.isPalindrom2();
                        break;
                }
            }
        }
    }
}
