package center.kit.app.homework.lesson8;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class WriterFile {
    public static void write() {
        try {
            String dirPath = "d:\\GIT\\javacore\\";
            String outputFileName = "output.txt";
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(dirPath + outputFileName)));
            //bufferedWriter(System.in);
        } catch (FileNotFoundException e) {
            System.out.println("File NOT FOUND");
        }

    }
}
