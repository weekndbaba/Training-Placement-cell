package TPC9;
class Node{
    int data;
    Node next;
    Node(){
        this.next=null;
    }
}


public class StackLinkedList {
    Node top = null;
    public void push(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = top;
        top = newNode;
    }

    public int pop(){
        if(top == null){
            System.out.println("stack underfloq");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peek(){
        if(top == null){
            System.out.println("stack is emthy");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpthy(){
        return top == null;
    }
    public void display(){
        if(top == null){
            System.out.println("stack is empthy");
            return;
        }
        Node temp = top;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.dislpay();;
        s.pop();
        s.pop();
        s.pop();
        s.dislpay();
        System.out.println(s.peek());
        if(s.isEmpthy()){
            System.out.println("enmpthy");
        }else{
            System.out.println("not empthy");
        }
    }
}
