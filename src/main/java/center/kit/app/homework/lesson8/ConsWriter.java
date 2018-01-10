package center.kit.app.homework.lesson8;

import java.io.*;

public class ConsWriter {
    static final String CONS_LINE = "Enter line to write(*exit*)_>";

    public static void enterValue(String outputFile) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            File file = new File(outputFile);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                String inputedVal = "";
                while (!(isExit(inputedVal))) {
                    System.out.println(CONS_LINE);
                    inputedVal = bufferedReader.readLine();
                    if (inputedVal.equals("")) {
                        System.out.println("You entered empty value!");
                    } else if (inputedVal.equals("*exit*")) {
                        System.out.println("Program is ending...");
                    } else {
                        bufferedWriter.append(inputedVal);
                        bufferedWriter.newLine();
                    }
                }
                bufferedWriter.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("File not Found!!!!");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException!");
        }
    }

    private static boolean isExit(String val) {
        if (val.equals("*exit*")) {
            return true;
        } else {
            return false;
        }
    }
}
