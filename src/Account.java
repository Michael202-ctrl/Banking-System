public class Account {
    int balance;



    public Account(int balance){
        this.balance = balance;
    }

    public void deposit (int amount){
        balance += amount;
        System.out.print("Successfully Deposited: " + amount);
        System.out.println();
    }

    public void checkBalance (){
        System.out.print("Your current balance is: " + balance);
        System.out.println();
    }
    public void withdraw (int amount) {
        if (balance >= amount){
            balance -= amount;
            System.out.print("Successfully withdraw: " + amount);
            System.out.println();
        }else{
            System.out.println("Insufficient balance :(");
        }
    }

    public void loan (int amount){
        if (balance >= amount){
            balance += amount;
            System.out.println("You Successfully loaned: " + amount);
            System.out.println();
        }else {
            System.out.println("Insufficient balance :(");
        }
    }
}
