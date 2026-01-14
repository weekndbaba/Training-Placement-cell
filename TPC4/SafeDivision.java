package TPC4;

import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array size");
        int n = scan.nextInt();
        double sum=0;
        int[] arr1 = new int[n],arr2 = new int[n];
        for(int i=0;i<n;i++){
           arr1[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++){
           arr2[i] = scan.nextInt();
        }
        try{
            for(int i=0;i<n;i++){
                double div = arr1[i]/arr2[i];
                sum += div;
            }
            System.out.println("sum = "+sum);
             
        }catch(ArithmeticException e){
            System.out.println("divisoin by zero");
        }
    }
    }

