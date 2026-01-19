package TPC13;

import java.util.*;

public class CoinChangeGreedy {
    public static void findMinCoins(int[] coins, int amount){
        Arrays.sort(coins);
        List<Integer> result = new ArrayList<>();

        System.out.println("Amount to make: "+amount);
        System.out.print("Coins used");

        for(int i=coins.length-1;i>=0;i--){
            while(amount >=coins[i]){
                amount -= coins[i];
                result.add(coins[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,500};
        int amount=550;
        findMinCoins(coins, amount);
    }
}
