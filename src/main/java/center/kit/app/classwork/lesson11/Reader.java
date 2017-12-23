package center.kit.app.classwork.lesson11;

public abstract class Reader {
    public String source;

    public abstract void read(String location);

    public void printSourceOfReading(){
        System.out.println("Reading from "+source);
    }
}
