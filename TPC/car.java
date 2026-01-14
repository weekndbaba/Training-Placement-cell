package TPC;

 class Teacher {
    void greet(){
        System.out.println("hello teacher");
    }
}

public class car extends Teacher{
    // void hello(){
    //     System.out.println("2");
    // }
    public static void main(String[] args) {
        car obj = new car();
        // obj.hello();
        obj.greet();;
    }
}
