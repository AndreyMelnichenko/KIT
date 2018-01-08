package center.kit.app.homework.lesson8;

import java.io.*;

import static center.kit.app.homework.lesson7.Palindrom.isPalindrom;

public class ReadFile {
    public static void isPalindromCheck(String inputFile, String outputFile) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            File file = new File(outputFile);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    //System.out.println(line);
                    if (isPalindrom(line)) {
                        bufferedWriter.append(line + " this is PALINDROM");
                        bufferedWriter.newLine();
                    } else {
                        bufferedWriter.append(line + " this is NOT PALINDROM");
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
            System.out.println("java.io.IOException: Stream closed");
        }
    }

    public static void arraySort(String inputFile, String outputFile) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            File file = new File(outputFile);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                String line;

                while ((line = bufferedReader.readLine()) != null){
                    int elements = ReadFile.lineElementsCounter(line);
                    int[] MyArray = new int[elements];
                    for (int i=0; i<=elements; i++){

                        MyArray[i]=Integer.parseInt(line.split(","));
                    }
                }



                bufferedWriter.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("File not Found!!!!");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("java.io.IOException: Stream closed");
        }
    }

    public static int lineElementsCounter(String line) {
        int element=0;
        for (int i=0; i<=line.length()-1; i++){
            if ((int)line.charAt(i)==44){
                element=element+1;
            }
        }
        return element;
    }

    public static int fileLinesCounter(String inputFile) {
        int i = 0;
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(inputFile);
            bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.readLine() != null) {
                i++;
            }
            bufferedReader.close();
        } catch (Exception e) {
        }
        return i;
    }
}