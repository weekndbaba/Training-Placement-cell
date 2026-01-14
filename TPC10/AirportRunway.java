package TPC10;

import java.util.*;

public class AirportRunway {
    public static void main(String[] args) {
        List<Flight> flights = Arrays.asList(
            new Flight("A1", 3),
            new Flight("B4", 2),
            new Flight("C2",3),
            new Flight("D7", 1),
            new Flight("E5", 2)
        );
        Collections.sort(flights, (a,b) ->  a.priority - b. priority);
        for(Flight f:flights){
            System.out.print(f.id+" "); 
        }
    }
}

class Flight{
    String id;
    int priority;
    Flight(String id, int priority){
        this.id = id;
        this.priority = priority;
    }
}
