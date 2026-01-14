package TPC;

import java.util.*;

public class ATM {
    private int pin = 1234;
    public ATM(int pin){
        this.pin = pin;
    }

    void change_pin(Scanner scan){

        System.out.println("enter old pin : ");
        int old_pin = scan.nextInt();

        if(pin==old_pin){
            System.out.println("enter new pin : ");
            int new_pin = scan.nextInt();
            if(Integer.toString(new_pin).length() == 4){
            pin=new_pin;
            System.out.println("pin change successfull");
            return;
            }
        }
        else{
            System.out.println("pin incoorect , change unsuccessfull");
            return;
        }
    }

    public static void main(String[] args) {
       ATM obj = new ATM(1234);
       Scanner scan = new Scanner(System.in);
       obj.change_pin(scan);
    }
}


