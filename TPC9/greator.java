package TPC9;

import java.util.Arrays;
import java.util.Stack;

public class greator {
    public static int[] nextGreater(int[] arr){
        int n =arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.empty() && arr[i]>arr[stack.peek()]){
                res[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            res[stack.pop()] = -1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] input = {4, 5, 2, 25};
        System.out.println(Arrays.toString(nextGreater(input)));
    }
}
