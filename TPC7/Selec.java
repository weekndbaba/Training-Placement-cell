package TPC7;
import java.util.Scanner;

public class Selec {
    public static void selectionSort(int[] arr, int n){
        for(int i = 0;i<n-1;i++){
            int maxIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            if(maxIndex != i){
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
    //12 90 56 23 80

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
        selectionSort(arr,n);
        System.out.println("sorted array");
        printArray(arr);
        
    }


}
