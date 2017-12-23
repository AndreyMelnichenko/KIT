package center.kit.app.classwork.lesson11;

import center.kit.app.homework.lesson6.Analyzer;
import center.kit.app.homework.lesson6.ArraysHw;
import center.kit.app.homework.lesson6.Menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EnumMenu {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputvalue = bufferedReader.readLine();
            switch (EnumClass.Menu.valueOf(inputvalue)) {
                case ONE:
                    System.out.println("Unknown menu item. Repeat enter.\n");
                    break;
                case TWO:
                    ArraysHw.exerciseA();

                    break;
                case THREE:
                    ArraysHw.exerciseB();

                    break;
                case FOUR:
                    ArraysHw.exerciseC();

                    break;
            }
    }
}