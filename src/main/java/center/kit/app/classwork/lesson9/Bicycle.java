package center.kit.app.classwork.lesson9;

public class Bicycle {
    public int speed;
    public String color, type;
    public Bicycle (int speed, String color, String type){
        this.speed=speed;
        this.color=color;
        this.type=type;
    }
    public Bicycle(int speed, String type){
        this();
        this.speed=speed;
        this.type=type;
    }
    public Bicycle(String color, int speed){
        this();
        this.color=color;
        this.speed=speed;
    }
    public Bicycle(int speed){
        this();
        this.speed=speed;
    }
    public Bicycle(){
        this.speed=100;
        this.color="White";
        this.type="City";
    }
    public static void ride (){
        Bicycle.ride();
    }
}
