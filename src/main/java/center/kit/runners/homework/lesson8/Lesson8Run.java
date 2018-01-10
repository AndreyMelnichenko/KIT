package center.kit.runners.homework.lesson8;

import center.kit.app.homework.lesson8.ConsWriter;
import center.kit.app.homework.lesson8.FileToRead;

public class Lesson8Run {
    public static void main(String[] args) {
        String inputFile = "input.txt", outputFile = "output.txt";
        FileToRead.isPalindromCheck(inputFile,outputFile);
        FileToRead.arraySort(inputFile,outputFile);
        ConsWriter.enterValue(outputFile);
    }
}
