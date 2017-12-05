package center.kit.app.homework.lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {
    public static final String STAR_LINE="******************************************************\n";
    public static final String LEFT_STARS="***";
    public static final String RIGHT_STARS="***\n";
    public static void intro (){
        System.out.print(STAR_LINE+LEFT_STARS+" Hi there! This program run homework tasks.     "+RIGHT_STARS+
                LEFT_STARS+" Pres 1-7 on your keyboard to choose task to run"+RIGHT_STARS+STAR_LINE);
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
        for (int i=1; i<menuArray.length+1;i++) {
            if (i<menuArray.length-2) {
                System.out.println(i + ". " + menuArray[i]);
            }
            if ((i>=menuArray.length-2)&&(i<menuArray.length-1)) {
                System.out.print("Type \'"+menuArray[i]+"\' to exit program!\n");
            }
            if ((i>=menuArray.length-1)&&(i<menuArray.length)){
                System.out.print(STAR_LINE+menuArray[i]);
            }
        }
    }
    public static void chooseLoop() throws Exception{
        int route=1;
        while ( route != 0 ) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputvalue = bufferedReader.readLine();
            route = Analyzer.analyzer(inputvalue);
            if (route==1){
                int choosed=Integer.parseInt(inputvalue);
                if (choosed==1){ArraysHw.exerciseA();
                    System.out.println(STAR_LINE);}
                if (choosed==2){ArraysHw.exerciseB();
                    System.out.println(STAR_LINE);}
                if (choosed==3){ArraysHw.exerciseC();
                    System.out.println(STAR_LINE);}
                if (choosed==4){ArraysHw.exerciseD();
                    System.out.println(STAR_LINE);}
                if (choosed==5){ArraysHw.exerciseE();
                    System.out.println(STAR_LINE);}
                if (choosed==6){ArraysHw.exerciseF();
                    System.out.println(STAR_LINE);}
                if (choosed==7){ArraysHw.exerciseG();
                    System.out.println(STAR_LINE);}
                if ((choosed>=8)||(choosed<=0)){
                    System.out.println("Wrong value! Repeat input!");
                }
                Menu.items();
            }
            if (route==2){
                System.out.println("Wrong value!! Repeat input!");
            }
        }
    }
}
