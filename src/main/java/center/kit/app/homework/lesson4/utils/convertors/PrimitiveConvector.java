package center.kit.app.homework.lesson4.utils.convertors;

public class PrimitiveConvector {

    public float inputFloatVariable;
    public int inputIntVariable;
    public char inputCharVariable;
    //-----------  Constructors  -----------
    public PrimitiveConvector(float inputFloatVariable){
        this.inputFloatVariable = inputFloatVariable;
    }
    public PrimitiveConvector(int inputIntVariable){
        this.inputIntVariable = inputIntVariable;
    }
    public PrimitiveConvector (char inputCharVariable){
        this.inputCharVariable=inputCharVariable;
    }
    //----------    Float -> Char CONVERTOR ---------------
    public char float2char (){
        return (char)this.inputFloatVariable;
    }
    //----------    Int -> Char CONVERTOR ---------------
    public char int2char (){
        return (char)this.inputIntVariable;
    }
    //----------    Char -> Int CONVERTOR ---------------
    public int char2int (){
        return (int)this.inputCharVariable;
    }

}
