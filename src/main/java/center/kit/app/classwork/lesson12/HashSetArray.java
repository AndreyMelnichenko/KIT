package center.kit.app.classwork.lesson12;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetArray {
    public static void getHash(){
        HashSet hs = new HashSet();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
        String input = scanner.nextLine();
        hs.add(input);
        }
        System.out.println(hs);
    }
}
