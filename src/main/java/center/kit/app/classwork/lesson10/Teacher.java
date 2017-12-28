package center.kit.app.classwork.lesson10;

public class Teacher extends Person {
    private int experience;
    public Teacher (String name, int age, int experience){
        super(name,age);
        this.experience=experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
