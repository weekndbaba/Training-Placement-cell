package TPC9;

import java.util.*;

public class Polish {

    public static int cal(char[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : arr) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int op1 = stack.pop();
                int op2 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(op2 + op1);
                        break;

                    case '-':
                        stack.push(op2 - op1);
                        break;

                    case '*':
                        stack.push(op2 * op1);
                        break;

                    case '/':
                        stack.push(op2 / op1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        char[] arr = {'2', '1', '+', '3', '*'};
        System.out.println(cal(arr));
    }
}
