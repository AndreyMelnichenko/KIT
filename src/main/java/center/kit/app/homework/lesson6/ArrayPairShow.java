package center.kit.app.homework.lesson6;

import java.util.Arrays;
import java.util.Random;

public class ArrayPairShow {
    public static void ArrayTwenty() {
        int[][] arrayone = new int[21][21];
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k <= 20; k++) {
                if ((k % 2 == 0) && (k != 0) && (i == 0)) {
                    arrayone[i][k] = k;
                    System.out.print(arrayone[i][k] + " ");
                }
                if ((k % 2 == 0) && (k != 0) && (i == 1)) {
                    arrayone[i][k] = k;
                    System.out.print("\n" + arrayone[i][k]);
                }
            }
        }
    }
    public static void ArrayUnpair(){
        int[] myarray = new int [100];
        System.out.print("\n+--------------------------+\n"+
                           "| Pair values from 0 to 99 |\n"+
                           "+--------------------------+");
        for(int i=0; i<=99; i++){
            myarray[i]=i;
            if ((i % 2 > 0)&&(i<10)){
                System.out.print(" "+myarray[i]+" ");
            }
            if ((i % 2 > 0)&&(i>=10)){
                System.out.print(myarray[i]+" ");
            }
            if (i%10==0){
                System.out.print("\n");
            }
        }
        System.out.println("\n+--------------------------+\n"+
                             "|Unpair values from 99 to 0|\n"+
                             "+--------------------------+");
        for(int i=99; i>0; i--){
            myarray[i]=i;
            if ((i % 2 > 0)&&(i<10)){
                System.out.print(""+myarray[i]+"  ");
            }
            if ((i % 2 > 0)&&(i>=10)){
                System.out.print(myarray[i]+" ");
            }
            if (i%10==0){
                System.out.print("\n");
            }
        }
    }

    public static void ArrayRand() {
        int[] myArray = new int[15];
        int pairCounter = 0;
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(9);
            System.out.print(myArray[i] + " ");
            if (myArray[i] % 2 == 0) {
                pairCounter = pairCounter + 1;
            }
        }
        System.out.println("\nPair values of this array = "+pairCounter);
    }
    public static void ArrayRandBig(){
        int[] myArray = new int[15];
        
    }
}
