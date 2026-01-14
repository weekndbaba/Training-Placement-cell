package TPC7;

import java.util.Scanner;

public class Insert {

    public static void insertionSort(int[] arr, int n){
        for(int i = 1;i<n;i++){
            int key = arr[i],j=i-1;;
            while(j>=0&&key>arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no of size");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("original array");
        printArray(arr);
        insertionSort(arr,n);
        System.out.println("sorted array");
        printArray(arr);
        
    }
}
