package TPC3;

import java.util.Scanner;

abstract class Payment {
    protected int amount = 0;
    Payment(int a){
        amount=a;
    }
    abstract String pay();
}

class CardPayment extends Payment{
    CardPayment(int a){
        super(a);
    }

    @Override
    String pay(){
        return "true";
    }

}

class UPIPayment extends Payment{
    UPIPayment(int a){
        super(a);
    }


    @Override
    String pay(){
        return "true";
    }

}

public class PaymentGateway{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mode of payment");
        String mode = scan.nextLine();
        System.out.println("enter amoount");
        int amount = scan.nextInt();
        if(mode.equalsIgnoreCase("UPI")){
            Payment obj1 = new UPIPayment(amount);
            System.out.println( obj1.pay());
        }else if(mode.equalsIgnoreCase("Card")){
            Payment obj2 = new CardPayment(amount);
            System.out.println( obj2.pay());
        }
    }
}
