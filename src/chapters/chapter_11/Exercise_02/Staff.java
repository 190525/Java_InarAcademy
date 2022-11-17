public class Staff  extends Employee{
   protected String title;

    public Staff(String name,String title) {
        super(name, "Erzurum", "0523653256", "ismail@gmail.com", 10000, "ITU", new MyDate().toString());
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return "Title: "+title+"\n"+super.toString();
    }
}

