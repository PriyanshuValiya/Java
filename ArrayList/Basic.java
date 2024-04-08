import java.util.*;

public class Basic {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();

       // Add Operation -- O(1)

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5); 

       list.add(0, 6);  // O(n)

       System.out.println("Add : " + list);
       System.out.println("Add With Index : " + list);

       // Get Operation -- O(1)
       
       int ele = list.get(2);
       System.out.println("Get : " + ele);

       // Delete Operation -- O(n)

       list.remove(2);
       System.out.println("Delete : " + list);

       // Set Operation -- O(n)

       list.set(0, 7);
       System.out.println("Set : " + list);

       // Contains Element -- O(n)
       System.out.println("Contains : " + list.contains(6));

       // Find Size of Arraylist

       int size = list.size();
       System.out.println("Size : " + size);

       // Sort ArrayList

       Collections.sort(list);
       System.out.println("Array In Assending Order : " + list);

       Collections.sort(list, Collections.reverseOrder());
       System.out.println("Array In Desending Order : " + list);

    }
}