package TPC;

import java.util.Scanner;

public class Power {
    void pow(int n){

    }
    void pow(int num,int n){
        int res= 1;
        for(int i=1;i<=n;i++){
            res *= num;
        }
        System.out.println(res);
    }

    void pow(float num,int n){
        float res = 1;
        for(int i=1;i<=n;i++){
            res *= num;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Power obj = new Power();
        System.out.println("enter num1");
        int n1 = scan.nextInt();
        System.out.println("enter int num2,power");
        int n2 = scan.nextInt();
        int pow2 = scan.nextInt();
        System.out.println("enter float num 3,pow");
        float n3 = scan.nextFloat();
        int pow3 = scan.nextInt();
        obj.pow(n1);
        obj.pow(n2,pow2);
        obj.pow(n3,pow3);

    }
}
