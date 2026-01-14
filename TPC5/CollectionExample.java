package TPC5;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // ArrayList<String> arrayList = new ArrayList<>();
        // arrayList.add("Apple");
        // arrayList.add("Banana");
        // arrayList.add("pineapple");
        // arrayList.remove(2);
        // for(String f:arrayList){
        //     System.out.println(f);
        // }

        // LinkedList<String> linkedList = new LinkedList<>();
        // linkedList.add("car");
        // linkedList.add("cycle");
        // linkedList.add("bike");
        // for(String f:linkedList){
        //     System.out.println(f);
        // }
        // linkedList.addFirst("scooty");
        // linkedList.addLast("walking");
        // for(String f:linkedList){
        //     System.out.println(f);
        // }

        // linkedList.remove("walking");
        // System.out.println("linkend list after removing walking = "+linkedList);

        // HashSet<Integer> hashSet = new HashSet<>();
        // hashSet.add(30);
        // hashSet.add(100);
        // hashSet.add(20);
        // hashSet.add(10);
        // hashSet.add(null);
        // hashSet.add(200);
        // hashSet.add(1);
        // System.out.println(hashSet);
        // if(hashSet.contains(20)){
        //     System.out.println("has 20");
        // }


        // TreeSet<Integer> treeSet = new TreeSet<>();
        // try{
        // treeSet.add(30);
        // treeSet.add(20);
        // treeSet.add(10);
        // treeSet.add(80);
        // treeSet.add(null);
        // System.out.println(treeSet);
        // System.out.println("first tress set elemtns"+treeSet.first());
        // System.out.println("last tress set elemtns"+treeSet.last());
        // }catch(NullPointerException e){
        //     System.out.println("brother no null in tree set");
        // }
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple",50);
        map.put("banana",30);
        map.put("orANGE",40);
        map.put("MANGO",60);

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

        TreeMap<String, Integer> tmap = new TreeMap<>();

        tmap.put("Apple",50);
        tmap.put("Banana",30);
        tmap.put("Orange",40);
        tmap.put("Mango",60);

        for(Map.Entry<String,Integer> entry:tmap.entrySet()){
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

        
    }
}
