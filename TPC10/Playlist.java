package TPC10;

import java.util.*;

class Node{
    String name;
    Node next = null;
    Node prev = null;

    Node(String name){
        this.name = name;
        this.next = null;
        this.prev= null;
    }
}

public class Playlist {
    private Node front,rear,top;

    public Playlist(){
        this.front = this.rear = this.top=null;
    }

    public void playnext(){
        if(isEmpty()){
            System.out.println("nothing to play");
            return;
        }
        top = front;
        front = front.next;
        if(front == null){
            rear = null;
        }
    }

    public void music_queue_add(String name){
        Node newNode = new Node(name);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void prev_song(Node temp){
        Node newNode = new Node();
        temp.data = value;
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

    public boolean s_isEmpthy(){
        return top == null;
    }


    public static void main(String[] args) {
        java.util.Queue<String> q = new LinkedList<>();
        Stack<>
        int choice;
        while(true){
            System.out.println("enter choice 1 for playnext \n 2 for prev song\n 3 for add song");
            switch (choice) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
        }
    }
}
