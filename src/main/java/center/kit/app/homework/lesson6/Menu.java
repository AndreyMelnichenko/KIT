package center.kit.app.homework.lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {
    public static final String STAR_LINE = "******************************************************\n";
    public static final String LEFT_STARS = "***";
    public static final String RIGHT_STARS = "***\n";

    public static void intro() {
        System.out.print(STAR_LINE + LEFT_STARS + " Hi there! This program run homework tasks.     " + RIGHT_STARS +
                LEFT_STARS + " Pres 1-7 on your keyboard to choose task to run" + RIGHT_STARS + STAR_LINE);
    }

    public static void items() {
        String[] menuArray = {
                "Non-paired values 1-20",                           // 0
                "Non-paired values 0-99 and 99-0",                  // 1
                "Array with random values 0-9",                     // 2
                "Array with random values 0-999 + print MIN/MAX",   // 3
                "Multi Array 8x5 with random values 10-99",         // 4
                "Multi Array 8x5 with MATRIX Format",               // 5
                "Loop counter",                                     // 6
                "Exit",                                             // 7
                "Choose your Menu item #>"};                        // 8
        for (int i = 0; i < menuArray.length; i++) {
            if (i < menuArray.length - 2) {
                System.out.println((i + 1) + ". " + menuArray[i]);
            }
            if ((i >= menuArray.length - 2) && (i < menuArray.length - 1)) {
                System.out.print("Type \'" + menuArray[i] + "\' to exit program!\n");
            }
            if ((i >= menuArray.length - 1) && (i < menuArray.length)) {
                System.out.print(STAR_LINE + menuArray[i]);
            }
        }
    }

    public static void chooseLoop() throws Exception {
        int route = 1;
        while (route != 0) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputvalue = bufferedReader.readLine();
            if (inputvalue.isEmpty()) {
                System.out.println("You didn't input any value.\n" + STAR_LINE);
                Menu.items();
            } else {
                route = Analyzer.analyzer(inputvalue);
                if (route == 1) {
                    int choosed = Integer.parseInt(inputvalue);
                    if ((choosed >= 8) || (choosed < 0)) {
                        System.out.println("Non-exist route! Repeat enter or type exit!");
                    } else {
                        switch (choosed) {
                            case 0:
                                System.out.println("Unknown menu item. Repeat enter.\n" + STAR_LINE);
                                break;
                            case 1:
                                ArraysHw.exerciseA();
                                System.out.println(STAR_LINE);
                                break;
                            case 2:
                                ArraysHw.exerciseB();
                                System.out.println(STAR_LINE);
                                break;
                            case 3:
                                ArraysHw.exerciseC();
                                System.out.println(STAR_LINE);
                                break;
                            case 4:
                                ArraysHw.exerciseD();
                                System.out.println(STAR_LINE);
                                break;
                            case 5:
                                ArraysHw.exerciseE();
                                System.out.println(STAR_LINE);
                                break;
                            case 6:
                                ArraysHw.exerciseF();
                                System.out.println(STAR_LINE);
                                break;
                            case 7:
                                ArraysHw.exerciseG();
                                System.out.println(STAR_LINE);
                                break;
                        }
                    }
                    Menu.items();
                }
                if (route == 2) {
                    System.out.println("This is STRING! Repeat input!\n" + STAR_LINE);
                    Menu.items();
                }
            }
        }
    }
}
