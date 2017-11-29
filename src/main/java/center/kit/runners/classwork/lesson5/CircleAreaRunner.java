package center.kit.runners.classwork.lesson5;

import center.kit.app.classwork.lesson5.CircleArea;

import java.util.Scanner;

public class CircleAreaRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double radius2 = scanner.nextDouble();
        CircleArea circleArea = new CircleArea();
        if (CircleArea.calculate(radius)>CircleArea.calculate()){
            System.out.println(radius+"Radius 1 is bigger that "+ radius);
        }else{System.out.println(radius+"Radius 2 is bigger that "+ radius);}  
    }
}
