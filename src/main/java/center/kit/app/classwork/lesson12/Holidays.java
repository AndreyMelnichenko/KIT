package center.kit.app.classwork.lesson12;

public enum Holidays {
    NEW_YEAR (1, "January", "New Year");
    private int value;
    private String month;
    private String holiday;
    private Holidays(int value, String month, String holiday){
        this.value=value;
        this.month=month;
        this.holiday=holiday;
    }

    public int getValue() {
        return value;
    }

    public String getMonth() {
        return month;
    }

    public String getHoliday() {
        return holiday;
    }
}
