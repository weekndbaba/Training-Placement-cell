package TPC10;

import java.util.*;

class Item{
     String name;
     int priority;
     int index;

    Item(String name, int priority,int index){
        this.name = name;
        this.priority = priority;
        this.index = index;
    }

}


public class PriorityQueueDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PriorityQueue<Item> q = new PriorityQueue<>(
            (a,b) -> {
                if(a.priority != b.priority){
                    return a.priority - b.priority;
                }
                return a.index - b.index;
            }
        );

        System.out.println("enter number of flights");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String name = scan.next();
            int priority = scan.nextInt();
            q.add(new Item(name, priority, i));
        }
        System.out.print("Queue : ");
       while(!q.isEmpty()){
        System.out.print(q.poll().name +" ");
       }
        
    }
}
