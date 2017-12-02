package center.kit.app.classwork.lesson6;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.random;

public class ArrayInit {
    public static void Arrays(){
        boolean[] boArray = {true,false,true};
        char[] chArray = {'q','a','z'};
        double[] doArray = {2,6,33};
        long[] longArray = {13323,3523,565675};
        for (int i=0; i<boArray.length;i++){
            System.out.print(boArray[i]+" ");
        }
        System.out.println("\n------------------");
        for (int i=0; i<chArray.length;i++){
            System.out.print(chArray[i]+" ");
        }
        System.out.println("\n------------------");
        for (int i=0; i<longArray.length;i++){
            System.out.print(longArray[i]+" ");
        }
        System.out.println("\n------------------");
        for (char arrElements:chArray){
            System.out.print(arrElements+" ");
        }
        System.out.println("\n------------------");
        System.out.println(Arrays.toString(longArray));
        System.out.println("\n------------------");
        int[][] myltiArr = new int[2][3];
        for (int i=0; i<myltiArr.length;i++){
            for (int k=0; k<myltiArr[i].length;k++){
                Random random = new Random();
                myltiArr[i][k]=random.nextInt(10);
                System.out.print(myltiArr[i][k]+" ");
            }
            System.out.println(" ");
        }
    }
}
