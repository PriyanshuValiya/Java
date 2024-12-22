public class Merge {
    public static void printArr(int arr[]) {
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int arr[], int startIdx, int endIdx) {
        if(startIdx >= endIdx) {
            return;
        }
        int mid = startIdx + (endIdx - startIdx) / 2;
        mergeSort(arr, startIdx, mid); 
        mergeSort(arr, mid+1, endIdx); 
        merge(arr, startIdx, mid, endIdx);
    }

    public static void merge(int arr[], int startIdx, int mid, int endIdx) {
        int temp[] = new int[endIdx - startIdx + 1];
        int i = startIdx;
        int j = mid+1;  
        int k = 0; 
        while(i <= mid && j <= endIdx) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            } 
            k++;
        }

        // Left Part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        // Right Part 
        while(j <= endIdx) {
            temp[k++] = arr[j++];
        }

        // Copy temp to original arr
        for(k=0, i=startIdx; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}