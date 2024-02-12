/* Find the 1st & last occurance of an element in String */

public class Questions {
    public static int firstOccurence(int arr[], int key, int i) {
     if(arr[i] == key) {
        return i;
     }
      return firstOccurence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int ans = firstOccurence(arr, 5, 0);
        System.out.println(ans);
    }   
}

public class Questions {
    public static int lastOccurence(int arr[], int key, int i) {
     if(arr[i] == key) {
        return i;
     }
      return lastOccurence(arr, key, i-1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int ans = lastOccurence(arr, 12, arr.length-1);
        System.out.println(ans);
    }   
}


/* Given a "2xn" board tiles of size "2x1", count the number of ways to the given board using the 2x1 tiles (A Tile can either br placed horizontally or vertically.) */

public class Questions {
    public static int tilingProblem(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } 
        // Vertical Choice
        int verTiles = tilingProblem(n-1);
        // Horizontal Choice
        int horTiles = tilingProblem(n-2);

        int totalWays = verTiles + horTiles;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(5));
    }   
}

/* Remove Duplicates Charactors From Given String */

public class Questions {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            // Already exists in newStr
            removeDuplicates(str, idx+1, newStr, map);
        } else {
            // Does not exists in newStr
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String name = "appnnacollege";
        removeDuplicates(name, 0, new StringBuilder(""), new boolean[26]);
    }
}

/* Binary Strings Problom */
/* Print all binary strings of size N without consecutive ones */

public class Questions {
    public static void printBinString(int n, int lastPlace, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }

        printBinString(n-1, 0, str+"0");
        if(lastPlace == 0) {
            printBinString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        printBinString(5, 0, "");
    }
}