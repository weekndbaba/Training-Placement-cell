package TPC4;

import java.util.Scanner;

public class guess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secret = 5;
        int chances = 4;

        System.out.println("You can guess only 4 times");

        while (chances > 0) {
            try {
                System.out.println("Enter your guess number:");
                int no = sc.nextInt();   

                if (no < secret) {
                    System.out.println("Incorrect, enter a bigger number");
                } 
                else if (no > secret) {
                    System.out.println("Incorrect, enter a smaller number");
                } 
                else {
                    System.out.println("Congratulations! You win ");
                    break;
                }

                chances--;
                System.out.println("Remaining chances: " + chances);
            }
            catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next(); 
            }
        }

        if (chances == 0) {
            System.out.println("Game Over! Correct number was 5");
        }
    }
}