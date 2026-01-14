package TPC3;

import java.util.Scanner;

abstract class Application{
    protected int hours = 0, power = 0;
    Application(int hours,int power){
        this.hours=hours;
        this.power=power;
    }
    abstract double DailyConsumption();
    abstract void print();
}

class Fan extends Application{
    Fan(int hours,int power){
        super(hours,power);
    }
    @Override
    double DailyConsumption(){
        return power*hours;
    }
    @Override
    void print(){
        System.out.println("total consumption of fan: "+power*hours+"Wh");
    }
}

class AC extends Application{
    AC(int hours,int power){
        super(hours,power);
    }
    @Override
    double DailyConsumption(){
        return power*hours*1.2;
    }
    @Override
    void print(){
        System.out.println("total consumption of ac: "+power*hours*1.2+"Wh");
    }

}

class Light extends Application{
    Light(int hours,int power){
        super(hours,power);
    }
    @Override
    double DailyConsumption(){
        return power*hours*0.8;
    }
    @Override
    void print(){
        System.out.println("total consumption of light: "+power*hours*0.8+"Wh");
    }
}

public class Elec {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter  , watts,hours = Fan : ");
        int w1 = scan.nextInt();
        int h1 = scan.nextInt();
        System.out.println("enter  , watts,hours = AC : ");
        int w2 = scan.nextInt();
        int h2 = scan.nextInt();
        System.out.println("enter  , watts,hours = Light : ");
        int w3 = scan.nextInt();
        int h3 = scan.nextInt();
        Application obj1 = new Fan(h1,w1);
        Application obj2 = new AC(h2,w2);
        Application obj3 = new Light(h3,w3);
        double sum =  obj1.DailyConsumption()+obj2.DailyConsumption()+obj3.DailyConsumption();
        obj1.print();
        obj2.print();
        obj3.print();

        System.out.println("total consumtion : "+sum+"Wh");
    }
}
