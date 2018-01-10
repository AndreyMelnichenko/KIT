package center.kit.app.homework.lesson11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalyseString {
    public static boolean isClearString(String val) {
        Pattern pattern = Pattern.compile("[A-Za-z]{1,100}[\\,-]+\\s+[A-Za-z]{1,100}");
        Matcher matcher = pattern.matcher(val);
        boolean matches = matcher.matches();
        if (matches) {
            return true;
        } else {
            return false;
        }
    }
}
