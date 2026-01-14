package TPC;

import java.util.Scanner;

class Discount{
    void calculate(int amount){

    }
}

class Clothing extends Discount{
    @Override
    void calculate(int amount){
        System.out.println("Clothing"+(amount-(int)(amount*0.20)));
    }
}

class Electronics extends Discount{
    @Override
    void calculate(int amount){
        System.out.println("Electronics"+(amount-(int)(amount*0.10)));
    }
}

class Grocery extends Discount{
    @Override
    void calculate(int amount){
        System.out.println("Grocery"+(amount-(int)(amount*0.05)));
    }
}


public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter tyoe of product");
        String s = scan.nextLine();
        System.out.println("enter amount");
        int n = scan.nextInt();
        if(s.equalsIgnoreCase("clothing")){
            Clothing obj2 = new Clothing();
            obj2.calculate(n);
        }else if(s.equalsIgnoreCase("Electronics")){
            Electronics obj3 = new Electronics();
            obj3.calculate(n);
        }else if(s.equalsIgnoreCase("Grocery")){
            Grocery obj4 = new Grocery();
            obj4.calculate(n);
        }
    }
}
