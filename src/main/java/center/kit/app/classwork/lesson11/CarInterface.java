package center.kit.app.classwork.lesson11;

public interface CarInterface {
    String name="BrandName";
    void changeGear(int shift);
    default void drive(){
        System.out.println("Cool drive");
        //madness();
    }
    /*private String madness(){
        return "Oracle madness";
    }*/
}
