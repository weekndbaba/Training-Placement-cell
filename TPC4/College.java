package TPC4;

import java.util.Scanner;

interface Exam{
    void theory(int marks);
    void prac(int marks);

}

interface addmission{
    int fees=200000;
    int currentSem=1;
    void process(int fees,int sem);
}

interface placement {
    void training();
    void placements();
}

class Student implements Exam,addmission,placement{
    public void theory(int marks){
        System.out.println("theoery marks = "+marks);
    }
    public void prac(int marks){
        System.out.println("prac marks = "+marks);
    }
    public void process(int fee,int sem){
        if(fee<fees){
            System.out.println("pleaes pay reaming fess = "+(fees-fee)+"to go to sem "+currentSem);
        }
    }
    public void training(){
        System.out.println("you are training");
    }
    public void placements(){
        System.out.println("you are placemsnts");
    }
}

public class College {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter makrs for theory,practicla");
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        System.out.println("enter fess paid,sem");
        int fee = scan.nextInt();
        int sem = scan.nextInt();
        Student obj = new Student();
        obj.theory(m1);
        obj.theory(m2);
        obj.process(fee, sem);
        obj.training();
        obj.placements();
    }
}
