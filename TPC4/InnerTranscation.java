package TPC4;

import java.util.Scanner;

final class Transcation {
    private final int transaction_id;
    private final int amount;

    Transcation(int a, int b) {
        this.transaction_id = a;
        this.amount = b;
    }

    int[] getter() {
        return new int[]{transaction_id, amount};
    }
}

public class InnerTranscation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter id, amount");
        int transaction_id = scan.nextInt();
        int amount = scan.nextInt();
        
        Transcation obj = new Transcation(transaction_id, amount);
        int[] arr = obj.getter();
        System.out.println(arr[0] + " " + arr[1]);
        scan.close();
    }
}