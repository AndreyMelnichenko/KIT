package center.kit.runners.classwork.lesson5;

import center.kit.app.classwork.lesson5.CircleArea;
import java.util.Scanner;

public class CircleAreaRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        CircleArea circleArea = new CircleArea();
        System.out.println("Square of round = "+ circleArea.calculate(radius));
    }
}
