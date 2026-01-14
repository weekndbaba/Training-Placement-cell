package TPC;

class Animal{
    void sound(){
        System.out.println("animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("bow bow");
    }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("meow meow");
    }
}

public class override {
    public static void main(String[] args) {
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();
        obj1.sound();
        obj2.sound();
    }
}
