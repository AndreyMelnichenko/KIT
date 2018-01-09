package center.kit.app.homework.lesson8;

public class ConsoleWriter {
    public static final String CONS_LINE = "Enter line to write it to file";
    public static boolean isExit (String val){
        if (val.equals("*exit*")){
            return true;
        }else {
            return false;
        }
    }
}
