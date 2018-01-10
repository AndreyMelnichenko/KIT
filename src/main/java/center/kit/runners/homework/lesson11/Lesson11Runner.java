package center.kit.runners.homework.lesson11;

import center.kit.app.homework.lesson11.Human;

public class Lesson11Runner {
    public static void main(String[] args) {
        Human human = new Human("Andrey",31);
        System.out.println("NAME: "+human.getName()+"\nAGE: "+human.getAge());
        human.setAge(200);
    }
}
