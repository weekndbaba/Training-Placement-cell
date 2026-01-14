package TPC9;

import java.util.Stack;

public class Duplicates {
     static String remove(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String words= "abbaca";
        System.out.println(remove(words));
    }
}
