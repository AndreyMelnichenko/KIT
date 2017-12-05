package center.kit.app.homework.lesson6;

public class Analyzer {
    public static int analyzer(String val) {
        if ((val.equals("exit")) || (val.equals("EXIT")) || (val.equals("Exit"))) {
            return 0;
        } else {
            String err = "NoError";
            for (int i = 0; i <= val.length() - 1; i++) {
                if (((int) val.charAt(i) <= 48) || ((int) val.charAt(i) >= 57)) {
                    err = "ERROR";
                }
            }
            if (err == "NoError") {
                return 1; //input value is NUMERIC and ready to parsing
            } else {
                return 2;//System.out.println("WRONG FORMAT!!!!");
            }
        }
    }
}
