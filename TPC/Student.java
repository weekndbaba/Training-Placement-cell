package TPC;
import java.util.*;


public class Student {
    private float marks=0;
    private String name= "";
    void setter(int marks,String name){
        if(marks<1){
            this.marks=0;
            this.name = name;
            return;
        }
        this.marks = marks;
        this.name = name;
    }
    void getter(){
        System.out.println(this.name+" : "+(int)this.marks);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student obj = new Student();
        System.out.print("\nenter marks : ");
        int marks = scan.nextInt();
        if(marks>100){
            System.out.println("invlaid");
            return;
        }
        scan.nextLine();
        System.out.println("\nenter name");
        String name = scan.nextLine();
        obj.setter(marks,name);
        obj.getter();
        scan.close();;

    }
}
