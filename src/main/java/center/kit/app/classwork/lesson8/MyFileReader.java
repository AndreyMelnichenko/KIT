package center.kit.app.classwork.lesson8;

import java.io.*;

public class MyFileReader {
    public static void myreader() {
        String currentDir = System.getProperty("user.dir");
        String pathSeparator = System.getProperty("path.separator"); // :
        String fileSeparator = System.getProperty("file.separator"); // /
        String inputFile = "input.txt", outputFile = "output.txt", osType = System.getProperty("os.name");
        System.out.println(currentDir+"\n"+pathSeparator+"\n"+fileSeparator+"\n"+osType);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(currentDir+fileSeparator+outputFile));
            File file = new File(currentDir+fileSeparator+inputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            try (bufferedReader) {
                String line;
                while ((line = bufferedReader.readLine())!= null) {
                    System.out.println(line);
                    if (isPalindrom(line)) {
                        bufferedWriter.append(line+" this is PALINDROM");
                        bufferedWriter.newLine();
                        //bufferedWriter.close();
                    } else {
                        bufferedWriter.append(line+" this is Not palindrom");
                        bufferedWriter.newLine();

                    }
                }
                bufferedWriter.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //System.out.println("File not Found!!!!");
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println("java.io.IOException: Stream closed");
        } /*finally {
            System.out.println("Regardless about exception you will see this text");
        }*/
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
