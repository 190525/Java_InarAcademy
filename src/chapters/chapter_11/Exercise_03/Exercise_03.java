public class Exercise_03 {
    public static void main(String[] args) {
    Account account=new Account(3,10000);
    account.deposit(300);
    System.out.println(account.toString());

    SavingsAccount savingsAccount=new SavingsAccount(3,25000);
    savingsAccount.withdraw(5000);
    System.out.println(savingsAccount.toString());

    CheckingAccount checkingAccount=new CheckingAccount(5,45000);
    checkingAccount.withdraw(35000);
    System.out.println(checkingAccount.toString());

    }
}

