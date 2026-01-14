package TPC10;

class Node{
    int data;
    Node  next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue{
    private Node front, rear;

    public Queue(){
        this.front = this.rear = null;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);

        if(rear == null){
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue(){
        if(front == null){
            System.out.println("Queue is emty");
            return -1;
        }
        int value = front.data;
        front = front.next;

        if(front == null){
            rear = null;
        }

        return value;
    }

    public int peek(){
        if(front == null){
            System.out.println("queue is empty");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        Node temp = front;
        System.out.print("Queue elemtns");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}



public class QueueLinkedListDemo {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Dequeued: "+q.dequeue());
        q.display();

        System.out.println("Front element"+q.peek());
        

    }
}
