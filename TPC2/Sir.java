package TPC2;

import java.util.Scanner;

class Student {
    private int marks = 0;
    void set(int marks){
        if(marks>=0 && marks<=100){
        this.marks=marks;
        }
    }

    void print(){
        if(this.marks>=40 && this.marks<=100){
            System.out.println("Pass");
        }else if(this.marks < 0){
            System.out.println("invalid");
        }else if(this.marks<40){
            System.out.println("fail");
        }else if(this.marks > 100){
            System.out.println("invalid");
        }
    }
    
}

public class Sir{
    public static void main(String[] args) {
        Student pbj = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter marks");
        int marks = scan.nextInt();
        if(marks<0||marks>100){
            System.out.println("invalid");
            return;
        }
        pbj.set(marks);
        pbj.print();
    }
}