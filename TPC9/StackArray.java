package TPC9;

import java.util.Scanner;

public class StackArray {
    int maxSize;
    int top;
    int[] stack;

    public StackArray(int size){
        maxSize = size;
        top= -1;
        stack = new int[maxSize];
    }

    public void push(int data){
        if(top == maxSize-1){
            System.out.println("stack overflow");
            return;
        }
        stack[++top] = data;
    }

    public int pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek(){
        if(top == -1){
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpthy(){
        return top == -1;
    }

    public void dislpay(){
        if(top == -1){
            System.out.println("stack is empty");
            return;
        }
        for(int i = top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackArray s = new StackArray(5);
        for(int i = 0;i <= s.stack.length;i++){
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        }

    }
}
