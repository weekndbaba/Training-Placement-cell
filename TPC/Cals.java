package TPC;

import java.util.Scanner;

class Insurance{
    void premiumAmount(){

    }
}

class Health extends Insurance{
    @Override
    void premiumAmount(){
        System.out.println("8000");
    }
}

class Car extends Insurance{
    @Override
    void premiumAmount(){
        System.out.println("5000");
    }
}

public class Cals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter what insurance you want : ");
        String s = scan.nextLine();
        if(s.equalsIgnoreCase("health")){
            Health obj1 = new Health();
            obj1.premiumAmount();
            return;
        }
        Car obj2 = new Car();
        obj2.premiumAmount();
    }
}
