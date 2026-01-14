package TPC2;

import java.util.Scanner;

class Order{
    private int amount = 0;
    void set(int n){
        this.amount=n;
    }
    int get(){
        return this.amount;
    }
}

public class DiscountOrder extends Order{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DiscountOrder obj = new DiscountOrder();
        System.out.println("enter amouont");
        int n = scan.nextInt();
        obj.set(n);
        if(obj.get()>=500){
            int d = (int) (obj.get()*0.10);
            int final2 = obj.get() - d;
            System.out.println("finala amount"+final2);
        }
    }
}
