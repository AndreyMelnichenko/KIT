package center.kit.app.classwork.lesson7;

public class ConvPrimitiv {
    public static void convertor(){
        String a = "13466";
        int intValue = Integer.valueOf(a);
        int b = 456;
        String string = String.valueOf(b);
        System.out.println(a+" <-String integer-> "+intValue+"\n"+b+" <-INT STRING -> "+string);
        double c = 343.23;
        String strC = String.valueOf(c);
        System.out.println(c+" <- DOUBLE STRING -> "+strC);
        String d = "2334.4";
        double douS = Double.valueOf(d);
        System.out.println(d+" <-STRING DOUBLE ->"+douS);
    }
    public static void palindrom(){
        String value = "qwyrtyytrewq";
        boolean isPalindrom = true;
        if (value.length()%2==0){
            for (int i=0; i<(value.length()-1)/2; i++){
                isPalindrom=isPalindrom&&(value.charAt(i)== value.charAt(value.length()-i-1));
            }
        }else {
            isPalindrom=false;}
            if (isPalindrom){
                System.out.println("PALINDROM");
            }else {
                System.out.println("NOT PALINDROM");
            }
    }
}
