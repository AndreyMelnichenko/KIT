package center.kit.app.classwork.lesson10;

public class Student extends Person { //class name
    private String university; //class fields
    private String response = "university";//this.university;


    public Student(String name, int age, String university) { // constructor
        super(name,age); // call parent (super) class constructor
        //super(age);
        this.university = university; // extend with new properties
    }
    public String getResponse(String question) { // method
        return response;
    }
    @Override
    public String getName (){
        return name;
    }
    public String getUniversity (){
        return university;
    }
    @Override
    public int getAge(){
        return age;
    }
}
