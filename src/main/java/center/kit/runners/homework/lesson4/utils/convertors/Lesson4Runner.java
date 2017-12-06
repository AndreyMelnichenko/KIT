package center.kit.runners.homework.lesson4.utils.convertors;

import center.kit.app.homework.lesson4.utils.convertors.PrimitiveConvector;

public class Lesson4Runner {
    public static void main(String[] args) {
        //------   floatToChar  ----------
        float floarval = 36.6f;
        System.out.println("Float ["+floarval+"] converted to Char does: " + PrimitiveConvector.float2char(floarval));
        //------   intToChar   ----------
        int intval = 3746;
        System.out.println("Int ["+intval+"] converted Char does: "+PrimitiveConvector.int2char(intval));
        //-------   charToInt   ---------
        char charval='0';
        System.out.println("Char ["+charval+"] converted Int does: "+ PrimitiveConvector.char2int(charval));
    }
}
