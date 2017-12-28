package center.kit.app.classwork.lesson6;

import java.util.Arrays;
import java.util.Random;

public class ArrayInit {
    public static void SimpleArrays(){
        boolean[] boArray = {true,false,true};
        char[] chArray = {'q','a','z'};
        //double[] doArray = {2,6,33};
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
    }
    public static void ArrToStr(){
        long[] longArray = {13323,3523,565675};
        System.out.println(Arrays.toString(longArray));
    }
    public static void ArrFor(){
        int[][] myltiArr = new int[2][3];
        Random random = new Random();
        for (int i=0; i<myltiArr.length;i++){
            for (int k=0; k<myltiArr[i].length;k++){
                myltiArr[i][k]=random.nextInt(10);
                System.out.print(myltiArr[i][k]+" ");
            }
            System.out.println(" ");
        }
    }
    public static void ArrForDeep(){
        int[][] myltiArr = new int[2][3];
        Random random = new Random();
        for (int i=0; i<myltiArr.length;i++){
            for (int k=0; k<myltiArr[i].length;k++){
                myltiArr[i][k]=random.nextInt(10);
            }
        }
        System.out.print(Arrays.deepToString(myltiArr));
    }
}
