package TPC;
import java.util.*;

public class BankAcoount {
    private float balance = 0;
    BankAcoount(float balance){
        this.balance = balance;
    }
    void deposit(int money){
        this.balance += money;
        System.out.println("depoist successsful = "+money);
        System.out.println("total balance"+balance);
        return;
    }

    void withdraw(int money){
        if(this.balance >= money){
            this.balance -= money;
            System.out.println("withdrwal successsful = "+money);
            System.out.println("total balance"+balance);
            return;
        }else{
            System.out.println("withdrwal unsuccesssful = "+money);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAcoount obj = new BankAcoount(12345);

        int choice = 0;
        while(true){
            System.out.println("enter choice \n 1 for withdrawl \n 2 for depoist\n 3 exit");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter money to for withdrawl");
                    int money = scan.nextInt();
                    obj.withdraw(money);
                    break;
                case 2:
                    System.out.println("enter money to for depoist");
                    int money_1 = scan.nextInt();
                    obj.deposit(money_1);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("wrong input");
                    break;
            }
        }
    }
}
