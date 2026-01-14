package TPC4;
import java.util.*;

abstract class Account{
    private String accountNumber;
    private String holderName;
    protected double balance;

    public Account(String accountNumber,String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    
    public String getHolderName(){
        return holderName;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    public double getBalance(){
        return balance;
    }  
}

class SavingsAccount extends Account{
    public SavingsAccount(String accountNumber,String holderName,double balance){
        super(accountNumber, holderName, balance);
    }

    @Override
    void deposit(double amount){
        balance += amount;
    }

    @Override
    void withdraw(double amount){
        if(amount<=balance) balance -= amount;
        else System.out.println("insufficient balance");
    }

}

class CurrentAccount extends Account{
    public CurrentAccount(String accountNumber, String holderName, double balance){
        super(accountNumber, holderName, balance);
    }
    @Override
    void deposit(double amount){
        balance += amount;
    }

    @Override
    void withdraw(double amount){
        if(amount<=balance) balance -= amount;
        else System.out.println("insufficient balance");
    }
}

class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(Account acc){
        accounts.put(acc.getAccountNumber(), acc);
    }

    public Account getAccount(String accNo){
        return accounts.get(accNo);
    }

    public void showAllAccounts(){
        for(Account a : accounts.values()){
            System.out.println(a.getAccountNumber() + " - "+ a.getHolderName() + " - "+a.getBalance());
        }
    }
}

public class BankingApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while(true){
            System.out.println("1. Create saving account");
            System.out.println("2. Create current account");
            System.out.println("3. Deposit");
            System.out.println("4. withdraw");
            System.out.println("5. check balance");
            System.out.println("6. show all accounts");
            System.out.println("7. exit");
            int  ch = sc.nextInt();
            
            if(ch == 1){
                System.out.println("account number: ");
                String num = sc.next();
                System.out.println("holdername :");
                String name = sc.next();
                System.out.println("initial balance : ");
                double bal = sc.nextDouble();
                bank.createAccount(new CurrentAccount(num, name, bal));
                System.out.println("savings account created");
            }else if(ch == 2){
                System.out.println("account number: ");
                String num = sc.next();
                System.out.println("holdername :");
                String name = sc.next();
                System.out.println("initial balance : ");
                double bal = sc.nextDouble();
                bank.createAccount(new SavingsAccount(num, name, bal));
                System.out.println("current account created");
            }else if(ch == 3){
                System.out.println("account number: ");
                String num = sc.next();
                Account acc = bank.getAccount(num);
                if(acc != null){
                    System.out.println("amount: ");
                    double amt = sc.nextDouble();
                    acc.deposit(amt);
                    System.out.println("depositited");
                }else System.out.println("invalis account");
                
            }else if(ch == 4){
                System.out.println("account number: ");
                String num = sc.next();
                Account acc = bank.getAccount(num);
                if(acc != null){
                    System.out.println("amount: ");
                    double amt = sc.nextDouble();
                    acc.withdraw(amt);
                }else System.out.println("invalis account");
            }else if(ch == 5){
                System.out.println("account number: ");
                String num = sc.next();
                Account acc = bank.getAccount(num);
                if(acc != null){
                    System.out.println("balance: "+acc.getBalance());
                }else System.out.println("inavalid account");
            }else if(ch == 6){
                bank.showAllAccounts();
            }else if(ch==7){
                System.out.println("thank you");
                break;
            }else{
                System.out.println("inavlid chice");
            }

        }
        sc.close();
    }
}
