package TPC10;

import java.util.Scanner;

class MyQueue {
    private int front, rear, size, capacity;
    private int[] queue;

    public MyQueue(int capacity){

        this.capacity = capacity;
        queue = new int[capacity];
        front=0;
        rear = -1;
        size=0;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("quue is full ,cannot enququ");
            return;
        }
        rear = (rear+1)%capacity;
        queue[rear]=data;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is emty, cannot dequeue");
            return -1;
        }
        int removed = queue[front];
        front = (front+1)%capacity;
        size--;
        return removed;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty. nothing peek");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty nothing to dislplay");
        }
        System.out.print("Queue = ");
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)%capacity]+" ");
        }
        System.out.println();
    }

    public int sum(){
        if(isEmpty()){
            return 0;
        }
        int sum=0;
        for(int i =0;i<size;i++){
            sum++;
        }
        return sum;
    }

    public void remove_k(int k){
        if(isEmpty()){
            System.out.println("queeu is emthy");
            return;
        }
        front = (front+2)%capacity;
        size -= k;
    }

    public void reverse() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }

    int start = 0;
    int end = size - 1;

    while (start < end) {
        int i = (front + start) % capacity;
        int j = (front + end) % capacity;

        int temp = queue[i];
        queue[i] = queue[j];
        queue[j] = temp;

        start++;
        end--;
    }
}

}

    public class QueueUsingArray {
        public static void main(String[] args) {
            // MyQueue q = new MyQueue(5);
            Scanner scan = new Scanner(System.in);
            // q.enqueue(10);
            // q.enqueue(20);
            // q.enqueue(30);
            // q.display();

            // System.out.println("Deququqed: = "+q.dequeue());
            // q.display();

            // System.out.println("Front elements "+q.peek());

            // // 1, 2, 4
            // System.out.println("enter the size of array");
            // int n = scan.nextInt();
            // for(int i =0;i<n;i++){
            //     int num = scan.nextInt();
            //     q.enqueue(num);
            // }
            // q.display();


            // // 3
            // System.out.println("enter num");
            // int n2 = scan.nextInt();
            // MyQueue q = new MyQueue(n2);
            // for(int i=1;i<=n2;i++){
            //     q.enqueue(1);
            // }
            // System.out.println(q.sum());

            // // 5
            // System.out.println("enter k");
            // int k = scan.nextInt();
            MyQueue q = new MyQueue(5);
            for(int i=1;i<=5;i++){
                q.enqueue(i);
            }
            q.display();
            //q.remove_k(k);
            // 6
            q.reverse();
            q.display();



        }
    }

