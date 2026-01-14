package TPC8;

public class SinglyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;

    public void insertAtBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head= newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        if(temp.next == null){
            temp.next = newNode;
        }
    }

    public void insertAtPosition(int data, int position){
        if(position == 1){
            insertAtBegining(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        for(int i =1;i<position-1;i++){
            temp = temp.next;
        }
        if(temp.next==null)return;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteByValue(int key){
        if(head == null)return;
        if(head.data == key){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next!=null && temp.next.data != key){
            temp = temp.next;
        }
        if(temp.next == null)return;
        temp.next = temp.next.next;
    }

    public boolean search(int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key)return true;
            temp = temp.next;
            
        }
        return false;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print(" null ");
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBegining(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(15, 2);

        list.display();

        list.deleteByValue(20);
        list.display();

        System.out.println(list.search(30));
        System.out.println(list.search(99));

        
    }

}
