package center.kit.app.classwork.lesson11;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String passport;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public User(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&

                Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, passport);
    }
}