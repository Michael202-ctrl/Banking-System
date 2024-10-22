import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int decision;
        int amount;

        Scanner sc = new Scanner(System.in);

        Account michael = new Account(500);
        do {
            System.out.println("1: Check Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdtraw");
            System.out.println("4: Exit");

            System.out.print("Enter transaction number: ");
            decision = sc.nextInt();
            switch (decision){
                case 1:
                    michael.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter Amount: ");
                    amount = sc.nextInt();
                    michael.deposit(amount);
                    break;
                case 3:
                    System.out.print("Enter Amount: ");
                    amount = sc.nextInt();
                    michael.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
            }
        }
        while(decision != 4);





    }
}
