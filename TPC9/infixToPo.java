package TPC9;
import java.util.Stack;

public class infixToPo{

    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        String result = "";

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            
            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }

            
            else if (ch == '(') {
                stack.push(ch);
            }

            
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop(); 
            }

            
            else {
                while (!stack.isEmpty() &&
                        precedence(stack.peek()) >= precedence(ch)) {
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }

        
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String infix = "A+B*(C-D)";
        System.out.println("Postfix: " + infixToPostfix(infix));
    }
}