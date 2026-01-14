    package TPC8;

    import java.util.Scanner;

    public class Assignement {
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
        public void insert(int data){
            if(head == null){
                insertAtBegining(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            
            while(temp.next != null){
                temp = temp.next;
            }
                temp.next = newNode;
            
        }

        public void insertAtPosition(int data, int position){
            if(position == 1){
                insertAtBegining(data);
                return;
            }

            Node newNode = new Node(data);
            Node temp = head;
            for(int i =1;i<position-1 && temp != null;i++){
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

        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.print(" null ");
            System.out.println();
        }

        //1
        public void threshold(int t){
            while(head != null && head.data < t){
                head = head.next;
            }

            Node temp = head;
            while(temp != null && temp.next != null){
                if(temp.next.data < t){
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }

    //2
    public void year(int t){
        while(head != null && head.data < t){
            head = head.next;
        }

        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp.next.data < t){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }


    //3
    public void remove(){
        if(head == null){
            return;
        }
         Node temp = head,c=null;
         while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
         }
    }

    //4
    public void reverse(){
        if(head == null){
            return;
        }
        Node curr=head,prev=null;

        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    //5
    public void increase(int threshold,int inc){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data < threshold){
                temp.data += inc;
            }
            temp = temp.next;
        }
    }

    //6
    public void deleteAtPosiiton(int k){
        if(head==null){
            return;
        }
        if(k==1){
            head = head.next;
        }
        Node temp = head;
        int i=1;
        while(temp.next!=null && i < k-1){
                temp = temp.next;
                i++;
            }
            if(temp == null || temp.next == null)return;
            temp.next = temp.next.next;
    }

    //7
    

        public static void main(String[] args) {
            Assignement list = new Assignement();
            Scanner scan = new Scanner(System.in);
            System.out.println("enter size = ");
            int n = scan.nextInt();
            for(int i=0;i<n;i++){
                int p = scan.nextInt();
                list.insert(p);
            }
            list.display();
            //list.threshold(100);
           // list.year(2023);
           //list.remove();
           //list.reverse();
           //list.increase(40000, 5000);
            list.deleteAtPosiiton(4);
            list.display();



        }

    }
