package Hashing;
import java.util.*;

public class Classroom {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        LinkedHashMap<String,Integer> lhmap = new LinkedHashMap<>();
        TreeMap<String,Integer> tmap = new TreeMap<>();

        // random order
        map.put("India", 1);
        map.put("America", 2);
        map.put("USA", 3);
        map.put("London", 4);
        
        // based on insertion order
        lhmap.put("India", 1);
        lhmap.put("America", 2);
        lhmap.put("USA", 3);
        lhmap.put("London", 4);
        
        // based on alphabetical order of key
        tmap.put("India", 1);
        tmap.put("America", 2);
        tmap.put("USA", 3);
        tmap.put("London", 4);

        System.out.println("HashMap : " + map);
        System.out.println("LinkedHashMap : " + lhmap);
        System.out.println("TreeMap : " + tmap);
        System.out.println();

        Set<String> keys = map.keySet();

        System.out.println("Keys : " + keys);
        System.out.println();

        for (String k : keys){
            System.out.println("Key : " + k + " ,value : " + map.get(k));
        } 
    }    
}