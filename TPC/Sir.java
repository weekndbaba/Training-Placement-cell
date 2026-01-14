package TPC;

import java.util.Scanner;

class Person {
    String name="";
}

class Teacher extends Person{
    String subject="";
}

class Student1 extends Person{
    int grade =0;
    
}

public class Sir{
    public static void main(String[] args) {
        Student1 obj = new Student1();
        Teacher obj2 = new Teacher();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name");
        obj.name = scan.nextLine();
        System.out.println("enter subject");
        obj2.subject = scan.nextLine();
        System.out.println("enter name");
        obj.grade = scan.nextInt();
        System.out.println("name :"+obj.name+"subjct = "+obj2.subject+"sudent grade ="+obj.grade);
    }
}

