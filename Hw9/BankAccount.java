public class BankAccount{
    private int number;
    private String name;
    private double balance;
    public int count = 0;
    
    public BankAccount(String name){
        this.number = 0;
        this.name = name;
        this.balance = 0.0;
        this.count = 0;
    }
    public BankAccount(String name, double balance){
        this.number = 0;
        this.name = name;
        this.balance = balance;
        this.count = 0;
    }
    public int getNumber(){
        return this.number;
    }
    public String getName(){
        return this.name;
    }
    public double getBalance(){
        return this.balance;
    }
    public void withdraw(double money){
        this.balance -= money;
        System.out.println("Withdraw for : " + money);
        System.out.println("Current balance : " + this.balance);
    }
    public void deposit(double money){
        this.balance += money;
        System.out.println("Deposit for : " + money);
        System.out.println("Current balance : " + this.balance);
    }
    public void updateYearInterest(double percent){
        this.balance += (this.balance * (percent / 100));
    }
}

