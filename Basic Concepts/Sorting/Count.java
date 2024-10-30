import java.util.*;

public class Count {
    public static int getMax(int arr[]) {
        int max = arr[0];

        for (int n : arr) {
            max = Math.max(max, n);
        }

        return max;
    }

    public static void countSort(int arr[]) {
        int countArr[] = new int[getMax(arr) + 1];
        int outputArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }

        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            outputArr[countArr[arr[i]] - 1] = arr[i];
            countArr[arr[i]]--;
        }

        System.out.println(Arrays.toString(outputArr));
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 0, 2, 3, 0, 3 };

        countSort(arr);
    }
}
