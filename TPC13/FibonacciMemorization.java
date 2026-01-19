package TPC13;

import java.util.*;
public class FibonacciMemorization {
    static int[] dp;

    public static int fib(int n){
        if(n<=1) return n;

        if(dp[n]!=-1) return dp[n];

        dp[n]=fib(n-1)+fib(n-2);
        return dp[n];
    }

    public static void main(String[] args) {
        int n=10;
        dp= new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println("fibonnaci of"+n+"is:"+fib(n));
    }
}
