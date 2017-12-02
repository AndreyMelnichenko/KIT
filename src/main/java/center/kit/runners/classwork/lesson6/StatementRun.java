package center.kit.runners.classwork.lesson6;

import center.kit.app.classwork.lesson6.Statement;
import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import java.util.Scanner;

public class StatementRun {
    public static void main(String[] args) {
        Statement statement = new Statement();
        //Scanner scanner = new Scanner(System.in);
        int a = 6; //scanner.nextInt();
        int b = 6; //scanner.nextInt();
        System.out.println("Enter A and B =>: "+statement.IfCalc(a,b));
    }
}
