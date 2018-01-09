package center.kit.runners.homework.lesson8;

import center.kit.app.homework.lesson8.ReadFile;

public class Lesson8Runner {
    public static void main(String[] args) {
        String inputFile = "input.txt", outputFile = "output.txt";
        ReadFile.isPalindromCheck(inputFile,outputFile);
        ReadFile.arraySort(inputFile,outputFile);
    }
}
