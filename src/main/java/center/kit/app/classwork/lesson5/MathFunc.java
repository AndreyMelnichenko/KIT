package center.kit.app.classwork.lesson5;

public class MathFunc {
    public int multiply(int a, int b){return a * b;}
    public int unmultiply (int a, int b){return a/b;}
    public static void calculateBigger(int val1, int val2) {
        //int a=2, b=6;
        if ((val1 > val1) || (val1 > 3)) {
            System.out.println(val1 + " bigger than " + val2 + " OR " + val1 + " bigger than 3");
        }if ((val2>val1)&&(val1<3)){
            System.out.println(val2+" bigger than "+val1+" AND "+val1+" bigger than 3");
        }else {
            System.out.println("No one rec not match!!!");
        }
    }
}
