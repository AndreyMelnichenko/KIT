package center.kit.app.homework.lesson11;

public class WhiteCollar extends Human {
    private String company;
    public WhiteCollar(String name, int age, String company){
        super(name, age);
        this.company=company;
    }

    public void setCompany(String company) {
        if (AnalyseString.isClearString(company)){
        this.company = company;}
        else {
            System.out.println("Company name is invalid");
        }
    }

    public String getCompany() {
        return company;
    }
}
