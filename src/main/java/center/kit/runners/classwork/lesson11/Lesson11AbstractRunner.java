package center.kit.runners.classwork.lesson11;

import center.kit.app.classwork.lesson11.FReader;

public class Lesson11AbstractRunner {
    public static void main(String[] args) {
        FReader fReader = new FReader();
        fReader.source="/home/andrey/git/javacore";
        fReader.read("Local");
        fReader.printSourceOfReading();
    }
}
