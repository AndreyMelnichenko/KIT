package center.kit.app.classwork.lesson8;

import java.io.*;

public class MyFileReader {
    public static void myreader() {
        String currentDir = System.getProperty("user.dir");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\git\\javacore\\output.txt"));
            File file = new File("D:\\git\\javacore\\input.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            try (bufferedReader) {
                String line;
                while ((line = bufferedReader.readLine())!= null) {
                    if (isPalindrom(line)) {
                        bufferedWriter.append(line+" this is PALINDROM");
                        //bufferedWriter.newLine();
                        bufferedWriter.close();
                    } else {
                        bufferedWriter.append(line+" this is Not palindrom");
                        //bufferedWriter.newLine();
                        bufferedWriter.close();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not Found!!!!");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("java.io.IOException: Stream closed");
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }

    public static boolean isPalindrom(String value) {
        boolean isPalindrom = true;
        for (int i = 0; i < (value.length()) / 2; i++) {
            isPalindrom = isPalindrom && (value.charAt(i) == value.charAt(value.length() - i - 1));
        }
        if (isPalindrom) {
            //System.out.println("PALINDROM");
            return true;
        } else {
            //System.out.println("NOT PALINDROM");
            return false;
        }
    }
}
