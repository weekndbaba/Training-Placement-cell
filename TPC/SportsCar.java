package TPC;

class Vehicle{
    String brand = "BMW";
}

class Car extends Vehicle{
    String model = "m3";
}

public class SportsCar extends Car{
    int top_speed = 210;

    public static void main(String[] args) {
        SportsCar obj = new SportsCar();
        System.out.println("brand = "+obj.brand+",model = "+obj.model+",top speed "+obj.top_speed);
    }
}
