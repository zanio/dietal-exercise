public class Account{
    private String name;
    private double balance;

    public Account(String name, Double balance){
        this.name = name;
        if(balance> 0.0){
            this.balance= balance;
        }
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance+depositAmount;
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double getAccountBalance(){
        return balance;
    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0.0 && balance >= withdrawAmount){
            balance = balance-withdrawAmount;
        }else{
            System.out.printf("Withdrawal amount $%.2f exceeded balance %n%n",withdrawAmount);
        }
    }
}