package TPC13;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Example {
    Node head;
    public void music(int t){
        while(head!=null&&head.data<t) head = head.next;
        Node temp = head;
        while(temp != null && temp.next!= null){
            if(temp.next.data < t) temp.next = temp.next.next;
            else{
                temp = temp.next;
            }
        }
    }

    public void dup(){
        if(head == null)return;

        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
    }

    public void rev(){
        if(head == null) return;
        Node cur =head,prev=null;
        while(cur!=null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur =temp;
        } 
        head = prev;
    }

    public void inc(int t,int k){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            if(temp.data < t){
                temp.data += k;
            }
            temp = temp.next;
        }
    }

    public void del(int p){
        if(head == null) return;
        if(p == 1)head = head.next;
        int i=1;
        Node temp = head;
        while(temp.next!=null && i<p-1){
            temp = temp.next;
            i++;
        }
        if(temp != null ||temp.next == null)return;
        temp.next = temp.next.next;
    }

    public void merge(Node head1, Node head2){
        Node temp1 = head1, temp2 = head2;
        while(temp)
    }



}
