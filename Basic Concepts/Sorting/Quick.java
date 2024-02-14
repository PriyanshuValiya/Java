public class Quick {
    public static void printArr(int arr[]) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int startIdx, int endIdx) {
        if(startIdx >= endIdx) {
            return;
        }
        // Last Element
        int pIdx = partition(arr, startIdx, endIdx);
        quickSort(arr, startIdx, pIdx-1); // left
        quickSort(arr, pIdx+1, endIdx); // right
    }

    public static int partition(int arr[], int startIdx, int endIdx) {
        int pivot = arr[endIdx];
        int i = startIdx - 1; // To make place for element smaller than pivot

        for(int j=startIdx; j < endIdx; j++) {
            if(arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[endIdx] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }   
}