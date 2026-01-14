package TPC10;

import java.util.*;

public class BankTokens {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
            new Customer("T1", 5),
            new Customer("T2", 12),
            new Customer("T3", 4),
            new Customer("T4", 11),
            new Customer("T5", 8),
            new Customer("T6", 3)
        );
       java.util.Queue<String> finalQueue = new LinkedList<>();


for (Customer c : customers) {
    if (c.time <= 10) {
        finalQueue.offer(c.name);
    }
}

while (!finalQueue.isEmpty()) {
    System.out.print(finalQueue.poll() + " ");
}

    }
}

class Customer{
    String name;
    int time;
    Customer(String name, int time){
        this.name = name;
        this.time = time;
    }
}
