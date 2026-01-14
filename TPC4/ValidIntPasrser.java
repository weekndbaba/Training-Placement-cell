package TPC4;

import java.util.Scanner;

public class ValidIntPasrser {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);    
    System.out.println("enter the value of n");
    int n = sc.nextInt();
        sc.nextLine(); 

        int sum = 0;

       
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            try {
                int num = Integer.parseInt(input);
                sum += num;
            } catch (NumberFormatException e) {
             
            }
        }

    
        System.out.println(sum);

        sc.close();
}
}