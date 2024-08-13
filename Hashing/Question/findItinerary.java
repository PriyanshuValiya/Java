package Java.Hashing.Question;
import java.util.*;

public class findItinerary {
    public static String getStart(HashMap<String,String> tickets) {
        HashMap<String,String> revMap = new HashMap<>();

        for(String i : tickets.keySet()) {
            revMap.put(tickets.get(i), i);
        }

        for(String i : tickets.keySet()) {
            if(!revMap.containsKey(i)) {
                return i; 
            }
        }

        return null;
    }

    public static void main(String args[]) {
        HashMap<String,String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        System.out.print(start);

        for(String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));  
            start = tickets.get(start);
        }
    }
}