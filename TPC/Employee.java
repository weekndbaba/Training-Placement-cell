package TPC;

import java.util.Scanner;

public class Employee {
    private String name = "";
    private long salary = 0;
    void set_salary(String name,long salary){
        if(salary>0){
            this.salary = salary;
            this.name = name;
        }
    }

    void get_salary(){
        System.out.println("Employee: "+name+", Salary:"+salary);
    }
    public static void main(String[] args) {
        Employee obj = new Employee();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name ");
        String name = scan.nextLine();
        System.out.println("enter salary");
        long salary = scan.nextLong();
        obj.set_salary(name, salary);
        obj.get_salary();
        scan.close();


    }
}
