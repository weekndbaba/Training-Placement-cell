package TPC;

import java.util.Scanner;

class Discount{
    void getDiscount(int amount){

    }
}
class Regular extends Discount{
    @Override
    void getDiscount(int amount){
        System.out.println("5%");
        System.out.println("total amount = "+(amount-(int)(amount*0.05)));
    }
}

class Premium extends Discount{
    @Override
    void getDiscount(int amount){
        System.out.println("15%");
        System.out.println("total amount = "+(amount-(int)(amount*0.15)));
    }
}


public class Customer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter amount");
        int amount = scan.nextInt();
        System.out.println("enter 1 for Regular cusomer \n enter 2 for premium cuctomer");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                Discount obj1 = new Regular();
                obj1.getDiscount(amount);
                break;
            case 2:
                Discount obj2 = new Premium();
                obj2.getDiscount(amount);
                break;
            default:
                break;
        }
    }
}
