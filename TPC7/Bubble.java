package TPC7;
import java.util.Scanner;

public class Bubble {

    public static void bubbleSort(int[] arr, int n){
        boolean swapped;

        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
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
        bubbleSort(arr,n);
        System.out.println("sorted array");
        printArray(arr);
        
    }

}


