package center.kit.runners.homework.lesson11;

import center.kit.app.homework.lesson11.Human;
import center.kit.app.homework.lesson11.WhiteCollar;

public class Lesson11Runner {
    public static void main(String[] args) {
        subRunner1();
        subRunner2();
    }
    public static void subRunner1 (){
        Human human = new Human("Andrey",31);
        System.out.println("NAME: "+human.getName()+"\nAGE: "+human.getAge());
        int newAge = 200;
        System.out.println("new age"+newAge);
        human.setAge(200);
    }
    public static void subRunner2(){
        WhiteCollar whiteCollar = new WhiteCollar("John",33,"Axel-Oxford, Benn-Inc");
        System.out.println(whiteCollar.getName()+"\n"+whiteCollar.getAge()+"\n"+whiteCollar.getCompany());
        String newCompany = "RR-R, Com-pany, I-nc";
        whiteCollar.setCompany(newCompany);
        System.out.println("New Company NAME: "+whiteCollar.getCompany());
    }
}
