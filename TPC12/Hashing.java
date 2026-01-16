import java.util.*;

 class HashTable {
    private int[] table;
    private int capacity;

    public HashTable(int capacity){
        this.capacity = capacity;
        table = new int[capacity];
        for(int i=0;i<capacity;i++) table[i]=-1;
    }

    private int hash(int key){
        return key%capacity;
    }

    public void insert(int key){
        int index= hash(key);
        int i=0;
        while(table[index +1]%capacity != -1 && table[index +1]%capacity != -2){
            i++;
            if(i==capacity)return;

        }
        table[(index+i)%capacity]=key;
    }

    public boolean search(int key){
        int index = hash(key);
        int i=0;
        while(table[(index +1)%capacity] != -1){
            if(table[(index +1)%capacity] == key) return true;
            i++;
            if(i==capacity) return false;
        }
        return false;
    }

    public void delete(int key){
        int index=hash(key);
        int i=0;
        while(table[(index +1)%capacity] != -1){
            if(table[(index +1)%capacity] == key){
                table[(index +1)%capacity] =-2;
                return;
            }
            i++;
            if(i==capacity)return;
        }
    }

    public void display(){
        System.out.println(Arrays.toString(table));
    }
}

public class Hashing{
    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.insert(23);
        ht.insert(43);
        ht.insert(13);
        ht.insert(27);
        ht.insert(35);

        System.out.println("Hash TAble :");
        ht.display();

        System.out.println("search 43: "+ht.search(43));
        System.out.println("search 99: "+ht.search(99));

        ht.delete(13);
        System.out.println("after deleting 13");
        ht.display();
    }
}
