package center.kit.runners.classwork.lesson12;

import center.kit.app.classwork.lesson12.HashSetArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsRunner {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        String string1 = "abc";
        myList.add(string1);
        String string2 = "bcd";
        myList.add(string2);
        /*int theSize = myList.size();
        int isEmpty = myList.size();
        int index = myList.indexOf(string1);
        Collections.reverse(myList);
        String a = myList.get(0);
        System.out.println(theSize + "\n" + isEmpty + "\n" + myList.get(0) + "\n" + index + "\n" + a);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        myList.add(input);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }*/
        HashSetArray.getHash();
    }
}
