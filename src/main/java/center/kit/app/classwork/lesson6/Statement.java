package center.kit.app.classwork.lesson6;

public class Statement {
    public int IfCalc (int a, int b){
        if (a>b){while (a>b&&b>0){
            System.out.println("A= "+a+" B= "+b);
            a=a-1;
        }}else {
        System.out.println("A= "+a+" B= "+b);}

        return a;
    }
    public static void ForCalc (){
        for (int i=0; i<=10; i++){
            System.out.println("I= "+i);
        }
    }
    public static void EvenNum (){
        int counter=0;
        for (int i=0; i<=20; i++){
            if (i%2==0){
                counter=counter+1;
            }
        }
        System.out.println("i%2==0: "+counter);
    }
}
