package center.kit.app.homework.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        System.out.println("Start:");
        Scanner keyboard = new Scanner(System.in);
        String line = null;
        while(!(line = keyboard.nextLine()).equals("exit")) {
            int choose=Integer.parseInt(line);
            if ((choose>0) && (choose<7)){
                System.out.println("Integer = "+choose);
            } else {
                System.out.println("ERROR VALUE");
            }
        }
        System.out.print("Bye!");
    }
}

