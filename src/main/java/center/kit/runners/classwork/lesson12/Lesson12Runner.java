package center.kit.runners.classwork.lesson12;

import center.kit.app.classwork.lesson12.Holidays;

public class Lesson12Runner {
    public static void main(String[] args) {
        for (Holidays value: Holidays.values()){
            System.out.println(value.getValue()+" "+value.getMonth()+" this is "
                    +value.getHoliday());
        }
    }
}
