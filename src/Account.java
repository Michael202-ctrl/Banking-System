public class Account {
    int balance;

    public void Account(int balance){
        this.balance = balance;
    }

    public void deposit (int amount){
        balance += amount;
        System.out.print("Successfully Deposited: " + amount);
    }
}
