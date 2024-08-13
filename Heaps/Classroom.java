package Java.Heaps;
import java.util.*;

public class Classroom {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(log n)
            // add data at last idx in arr
            arr.add(data);  // O(1)

            int x = arr.size()-1;  // child idx
            int par = (x-1)/2;  // parent idx

            while(arr.get(x) < arr.get(par)) { // O(log n)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp); 

                x = par;
                par = (x-1) / 2;
            }
        }

        public int peek() {
            // getMin opretion
            return arr.get(0);
        }

        private void heapify(int i) {  // O(log n)
            int left = (2*i) + 1;
            int right = (2*i) + 2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if(minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // Step 1 : Swap first and last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // Step 2 : remove last element
            arr.remove(arr.size()-1);

            // Step 3 : heaapify
            heapify(0);

            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()) {  // heap sort -> O(nlog n)
            System.out.print(h.peek() + " ");
            h.remove();
        }
    }
}