package TPC;

import java.util.*;

public class Sum {
    void sum(int n){
        System.out.println();
    }
    void sum(int a,int b){
        if(a==b){
            System.out.println(a);
        }else{
        System.out.println(a+b);
        }
    }
    void sum(int[] arr,int n){
        Set<Integer> map = new HashSet<>();
        for(int i = 0;i<n;i++){
            if(!map.contains(arr[i])){
                map.add(arr[i]);
            }
        }
        int sum=0;
        for(int i:map){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Sum obj1 = new Sum();
        System.out.println("enter size ");
        int n = scan.nextInt();
        if(n<0){

        }
        else if(n==1){
        System.out.println("enter num1 ");
        int n1 = scan.nextInt(); 
        obj1.sum(n);  
        }else if(n==2){
        System.out.println("enter num1,num2 ");
        int n2 = scan.nextInt(); 
        int n3 = scan.nextInt(); 
        obj1.sum(n2,n3);
        }else{
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                System.out.println("enter nums "+i);
                arr[i] = scan.nextInt();
            }
            obj1.sum(arr,n);
        }

    }
}
