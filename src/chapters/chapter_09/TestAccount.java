import java.util.Date;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20_000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Account was created: " +account.getDateCreated());
        System.out.println("Balance amount: "+account.getBalance());
        System.out.printf("Monthly interest rate:%.3f ",account.getMonthlyInterest());

    }
}
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        dateCreated=new Date();
        id=0;
        balance=0;
        annualInterestRate=0;
    }
    public Account(int id,double balance){
        this();
        this.id=id;
        this.balance=balance;
    }


   public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {

        Date startDate = dateCreated;

        return startDate;
    }
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100.0) / 12;
    }
    public double getMonthlyInterest() {
        return (balance * getMonthlyInterestRate());
    }
    public void  withdraw(double withdrawAmount){
        balance-=withdrawAmount;

    }
    public void deposit(double depositAmount){
        balance+=depositAmount;
    }
}

