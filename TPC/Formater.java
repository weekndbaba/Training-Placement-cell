package TPC;

import java.util.Scanner;

public class Formater {
    void formating(String s){
        s = s.toUpperCase();
        System.out.println(s);
    }

    void formating(String s,int a){
        StringBuilder se = new StringBuilder();
        for(int i=0;i<a;i++){
            se.append(s);
        }
        System.out.println(se.toString());
    }

    void formating(String s,String m){
        System.out.println(s+m);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Formater obj = new Formater();
        System.out.println("enter  string");
        String s1 = scan.nextLine();
        System.out.println("enter string");
        String s2 = scan.nextLine();
        System.out.println("enter no of repetion");
        int n = scan.nextInt();
        System.out.println("enter strng 1");
        String s3 = scan.nextLine();
        scan.nextLine();
        System.out.println("enter strng 2");
        String s4 = scan.nextLine();
        obj.formating(s1);
        obj.formating(s2, n);
        obj.formating(s3, s4);
    }
}
