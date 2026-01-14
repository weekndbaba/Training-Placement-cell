package TPC;

import java.util.Scanner;

class Shape{
    int area(){
        return 0;
    }
}


public class Rectangle extends Shape{
    int length=0,breadth=0;
    Rectangle(int a,int b) {
        length=a;
        breadth=b;
    }
    @Override
    int area(){
        return length*breadth;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter lenght");
        int l = scan.nextInt();
        System.out.println("enter breadth");
        int b = scan.nextInt();
        Rectangle res = new Rectangle(l, b);
        System.out.println("area = "+res.area());

    }
}
