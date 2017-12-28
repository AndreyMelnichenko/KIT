package center.kit.runners.classwork.lesson11;

import center.kit.app.classwork.lesson11.CarInterface;
import center.kit.app.classwork.lesson11.User;

public class Lesson11InterfaceRunner {
    public static void main(String[] args) {
        User user = new User("Ivan",22,"Passport");
        User user1 = new User("Petya",22,"Passport");
        System.out.println("USER HASH : "+user.hashCode()+"\nUSER1 HASH: "+user1.hashCode());

        System.out.println(user.equals(user1));

    }
}
