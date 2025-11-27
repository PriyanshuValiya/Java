import java.util.*;

class MinToMaxHeap {
    public static void heapify(int[] nums, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < nums.length && nums[left] > nums[largest]) {
            largest = left;
        }
        
        if (right < nums.length && nums[right] > nums[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = nums[i];
            nums[i] = nums[largest];
            nums[largest] = temp;

            heapify(nums, largest);
        }
    }

    public static void convertMinToMax(int[] nums) {
        int n = nums.length;

        for (int i = (n - 2) / 2; i >= 0; i--) {
            heapify(nums, i);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 10, 20, 30, 21, 23 };

        System.out.println("Min Heap: " + Arrays.toString(nums));
        convertMinToMax(nums);
        System.out.println("Max Heap: " + Arrays.toString(nums));
    }
}
