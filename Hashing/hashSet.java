package Hashing;
import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("RCB");
        cities.add("MI");
        cities.add("KKR");
        cities.add("SRH");
        cities.add("CSK");

        Iterator it = cities.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        for(String city : cities) {
            System.out.println(city);
        }
    }    
}