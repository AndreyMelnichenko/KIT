package center.kit.app.classwork.lesson13;

import center.kit.app.homework.lesson6menu.Analyzer;

import java.util.*;

public class HashMapArray {
    public static void getMap(String key, String val) {

        //System.out.println(m1);
        //return m1;
    }

    public static void menu() {
        HashSet<String> hashSet = new HashSet<>();
        HashMap<String, HashSet<String>> hashMap = new HashMap<>();
        int level1 = 0;
        while (level1 != 1) {
            System.out.println("Enter category name/\'exit\': ");
            Scanner scanner = new Scanner(System.in);
            String category = scanner.nextLine();
            System.out.println("Fill your category \"" + category + "\", separate values \',\' and press ENTER");
            Scanner scanner2 = new Scanner(System.in);
            String content = scanner2.nextLine();
            String[] categoryContent = content.split(",");
            hashSet.addAll(Arrays.asList(categoryContent));
            hashMap.put(category, hashSet);
            System.out.println("Type \'exit\' to exit");
            Scanner exit = new Scanner(System.in);
            int isExit = Analyzer.analyzer(exit.nextLine());
            if (isExit != 0) {
                level1 = 0;
            } else {
                level1 = 1;
            }
            System.out.println(hashMap.get(category));
        }
    }
}
