package TPC5;
import java.util.*;

public class Exercise{

    public void ArrayList(int[] arr){
    ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i:arr){
            arrayList.add(i);
        }
        System.out.print("even numbers = ");
        for(int i:arrayList){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    //1
    public void dup(ArrayList<Integer> arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(arr);
        ArrayList<Integer> arrayList = new ArrayList<>(set);

        System.out.println("Removed duplicates from ArrayList:");
        for (int i : arrayList) {
            System.out.print(i + " ");
            }
    }

    //2
    public void non_rep(String s){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(HashMap.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                return;
            }
        }

    }

    //3
    public void sort_dec(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i:arr) linkedList.add(i);

        Collections.sort(linkedList, (a,b) -> {
            int fa = map.get(a);
            int fb = map.get(b);
            if(fa!=fb) return fb-fa;
            else return a-b;
        });
        System.out.println(linkedList);
    }

    //4
    void group_anagram(String[] arr){
        Map<String,List<String>> map = new LinkedHashMap<>();
        for(String s :arr){
            int[] alpa = new int[26];
            for(Character c : s.toCharArray()){
                alpa[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i:alpa){
                sb.append("#");
                sb.append(i);
            }
            String st = sb.toString();
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<>());
            }
            map.get(st).add(s);
        }
        for (List<String> group : map.values()) {
        System.out.println(group);
    }
    }

    //5
    void k_freq(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> n: map.entrySet()){
            if(n.getValue()>1){
                System.out.print(n.getKey()+" ");
            }
        }
    }

    //7


    //8
    void long_cons(int[] arr){
        Arrays.sort(arr);
        int lon = 1,max=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==1){
                lon++;
                max = Math.max(lon,max);
            }else{
                lon=1;
            }
        }
        System.out.println(max);
    }


    //
    //4
    void intersect(List<Integer> arr,List<Integer> arr2){
        arr.retainAll(arr2);
        System.out.println(arr);
    }

    //5
    void union(List<Integer> arr,List<Integer> arr2){
        arr.addAll(arr2);
        System.out.println(arr);
    }

    //6
    void

    //
    public void words(String s){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Exercise obj = new Exercise();
        // System.out.println("enter 5 numbers");
        // int[] arr = new int[5];
        // for(int i=0;i<5;i++){
        //     arr[i]=scan.nextInt();
        // }
        // obj.ArrayList(arr);

        // ArrayList<Integer> arrayList = new ArrayList<>();
        // System.out.println("enter total num");
        // int n=scan.nextInt();
        // for(int i=0;i<n;i++){
        //     int y = scan.nextInt();
        //     arrayList.add(y);
        // }
        // obj.dup(arrayList);

        // obj.non_rep("swiss");
        // int[] n = {4, 6, 2, 6, 4, 4};
        // obj.sort_dec(n);

        String[] s = {"eat", "tea", "tan", "ate", "nat"};
        obj.group_anagram(s);
        int[] n= {100, 4, 200, 1, 3, 2};
        obj.long_cons(n);
    }
}
