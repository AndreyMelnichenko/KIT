package center.kit.runners.homework.lesson5;

import java.util.Scanner;

public class TestRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("exit")) {
            System.out.println(
                    sc.hasNextInt() ? "(int) " + sc.nextInt() :
                            sc.hasNextLong() ? "(long) " + sc.nextLong() :
                                    sc.hasNextDouble() ? "(double) " + sc.nextDouble() :
                                            sc.hasNextBoolean() ? "(boolean) " + sc.nextBoolean() :
                                                    "(String) " + sc.next()
            );
        }
    }
}
