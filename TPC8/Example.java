package TPC8;

import java.util.Scanner;

public class Example {

    //1
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);

            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
            
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int  j = low;j<high;j++){
            if(arr[j]<=pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

    //2
    public static void k_ele(int[] arr,int low,int high,int k){
        quickSort(arr, low, high);
        System.out.println(arr[k-1]);
    }

    //3

    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){

            int mid = (left+right)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }

    
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left+1;
        int n2=right-mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[left+i];
        }for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }

        int i=0,j=0;
        int k=left;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }

    }

    //4
    public static void violation(int[] arr,int left,int right){
        int vio=0;
        if(left<right){
            int mid=left+(right-left)/2;

            violation(arr, left, mid);
            violation(arr, mid+1, right);

        vio +=  vio_merge_sort(arr, left,mid, right);
        }
        System.out.println(vio);
    }

    public static int vio_merge_sort(int[] arr,int left,int mid, int right){
        int n1 = mid-left+1;
        int n2  = right -mid,vio=0;;

        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0;i<n1;i++) L[i]=arr[i];
        for(int j=mid+1;j<n2;j++) R[j]=arr[j];

        int i=0,j=0;
        int k = left;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                vio += n1-i; 
                j++;
            }
            k++;
        }

        return vio;

    }



    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int[] arr = {10,7,8,9,1,5};
        // System.out.println("original array");
        // printArray(arr);
        // quickSort(arr,0,arr.length-1);
        // System.out.println("sorted array");
        // printArray(arr);

        // int[] arr = {45, 30, 60, 20, 50, 40};
        // System.out.println("original array");
        // printArray(arr);
        // k_ele(arr,0,arr.length-1,3);

        int[] arr = {80, 60, 70, 50, 90};
        System.out.println("original array");
        printArray(arr);
        violation(arr,0,arr.length-1);
        
    }
}
