package TPC7;

import java.util.*;

public class Example {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
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

    public static void bubble_sort_string(String[] arr2){
        int n = arr2.length;
        boolean swapped;

        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                int result = arr2[j].compareTo(arr2[j+1]);
                if(result > 0){
                    String temp = arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void bubble_sort_hash(int[] arr3, String[] arr4){
        int n = arr3.length;
        HashMap <Integer,String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr3[i],arr4[i]);
        }
        System.out.println(map);
        
    }

    public static void selectionSort(int[] arr,int k){
        int n  = arr.length;
        for(int i = 0;i<n-1;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void selection_Sort_string(String[] arr6){
        int n  = arr6.length;
        for(int i = 0;i<n;i++){
            int minIndex = i;
            for(int j = i+1;i<n;j++){
                if(arr6[j].compareTo(arr6[minIndex]) > 0){
                    minIndex=j;
                }
            }
            if(minIndex != i){
                String temp = arr6[minIndex];
                arr6[minIndex] = arr6[i];
                arr6[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i =1;i<n;i++){
            int key = arr[i],j = i-1;
            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    //3
    public static void swaps(int[] arr){
        int n = arr.length,swap=0;
        boolean swapped;

        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                    swap++;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(swap);
    }

    //4
    public static void check(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    //7
    public static void minimum(int[] arr){
    int n = arr.length;

    for(int i = 0; i < n - 1; i++){
        int minIndex = i;

        for(int j = i + 1; j < n; j++){
            if(arr[j] < arr[minIndex]){
                minIndex = j;
            }
        }
        System.out.print((i + 1) + " ");
        if(minIndex != i){
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

    //9
    public static void k_small(int[] arr,int k){
        int n  = arr.length;
        for(int i = 0;i<n-1;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(arr[k-1]);
    }

    //10
    public static void absolute(int[] arr){
        int n  = arr.length;
        for(int i = 0;i<n-1;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(Math.abs(arr[j])<Math.abs(arr[minIndex])){
                    minIndex=j;
                }
            }
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    //12
     public static void shift(int[] arr){
        int n = arr.length;
        for(int i =1;i<n;i++){
            int key = arr[i],j = i-1;
            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    //mere sort
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

    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr2){
        for(String i:arr2){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // int[] arr = {64, 34, 25, 12, 22, 11, 90};
        // printArray(arr);
        // bubbleSort(arr);
        // printArray(arr);

        // String[] arr2 = {"banana", "apple", "orange", "grape", "pear"};
        // printArray(arr2);
        // bubble_sort_string(arr2);
        // printArray(arr2);

        // int[] arr = {28, 10, 14, 37, 13};
        // System.out.println("original array");
        // printArray(arr);
        // bubbleSort(arr);
        // System.out.println("sorted array");
        // printArray(arr);

        // String[] arr6 = {"banana", "apple", "orange", "grape", "pear"};
        // System.out.println("original array");
        // printArray(arr6);
        // bubble_sort_string(arr6);
        // System.out.println("sorted array");
        // printArray(arr6);

        // int[] arr = {3,2,1};
        // swaps(arr);

        // int[] arr = {1,2,3,4};
        // check(arr);

        // int[] arr = {4,3,2,1};
        // minimum(arr);

        // int[] arr = {7, 10, 4, 3, 20};
        // k_small(arr, 3);

        // int[] arr = {-1, -3, 2, 4,};
        // System.out.println("original array");
        // printArray(arr);
        // absolute(arr);
        // System.out.println("sorted array");
        // printArray(arr);

        // int[] arr = {5,4,3,2,1};
        // System.out.println("original array");
        // printArray(arr);
        // insertionSort(arr);
        // System.out.println("sorted array");
        // printArray(arr);

        int[] arr = {12,11,13,5,6,7};
        System.out.println("original array");
        printArray(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.println("sorted array");
        printArray(arr);
        
    }
}
