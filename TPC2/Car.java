package TPC2;

import java.util.Scanner;

class Vehicle{
    int speed = 10;
}
public class Car extends Vehicle{
    int turbo = 50;
    public static void main(String[] args) {
        Car obj = new Car();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter speed");
        obj.speed = scan.nextInt();
        System.out.println("enter turbo");
        obj.turbo = scan.nextInt();
        int final_sped = obj.speed+obj.turbo;
        System.out.println("final speed"+final_sped);
    }
}


