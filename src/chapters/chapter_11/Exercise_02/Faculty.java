public class Faculty extends Employee {
    protected String officeHours;
    protected String rank;

    public Faculty(String name) {
        this(name, "9-5PM", "Employee");
    }

    public Faculty(String name,String officeHours, String rank) {
        super(name, "Erzurum", "0523653256", "ismail@gmail.com", 10000, "ITU", new MyDate().toString());
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString(){
        return super.toString()+"\nOffice hours: "+officeHours+"\nRank: "+rank;
    }
}

