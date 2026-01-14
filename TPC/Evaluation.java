package TPC;

import java.util.Scanner;

class Exam{
    void evaluate(){

    }
}

class Pass extends Exam{
    @Override
    void evaluate(){
        System.out.println("pass");
    }
}

class Fail extends Exam{
     @Override
    void evaluate(){
        System.out.println("fail");
    }
}

public class Evaluation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter makrs");
        int marks = scan.nextInt();
    }
}
