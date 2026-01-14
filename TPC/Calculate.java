package TPC;

import java.util.Scanner;

class Order{
    void deliveryTime(){

    }
}

class PrimeOrder extends Order{
    @Override
    void deliveryTime(){
        System.out.println("2 days");
    }
}

class NormalOrder extends Order{
    @Override
    void deliveryTime(){
        System.out.println("5 days");
    }
}

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter bormal or prime");
        String s = scan.nextLine();
        if(s.equalsIgnoreCase("prime")){
            PrimeOrder obj1 = new PrimeOrder();
            obj1.deliveryTime();
        }else if(s.equalsIgnoreCase("normal")){
        NormalOrder obj2 = new NormalOrder();
        obj2.deliveryTime();
        }
        scan.close();
    }
}
