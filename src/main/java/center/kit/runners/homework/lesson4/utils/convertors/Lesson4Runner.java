package center.kit.runners.homework.lesson4.utils.convertors;

import center.kit.app.homework.lesson4.utils.convertors.PrimitiveConvector;

public class Lesson4Runner {
    public static void main(String[] args) {
        //------   floatToChar  ----------
        PrimitiveConvector floatToChar = new PrimitiveConvector(3.255567f);
        System.out.println("Float ["+floatToChar.inputFloatVariable+"] converted to Char does: " + floatToChar.float2char());
        //------   intToChar   ----------
        PrimitiveConvector intToChar = new PrimitiveConvector(3746);
        System.out.println("Int ["+intToChar.inputIntVariable+"] converted Char does: "+ intToChar.int2char());
        //-------   charToInt   ---------
        PrimitiveConvector charToInt = new PrimitiveConvector('x');
        System.out.println("Char ["+charToInt.inputCharVariable+"] converted Int does: "+ charToInt.int2char());
    }
}
