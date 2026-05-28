// Problem: Quick Sort Algorithm
// Platform: StriverA2Z
// Link: https://takeuforward.org/data-structure/quick-sort-algorithm
// Approach: Recursive Approach
// Time Complexity: O(n^2); Avg: O(nlogn)
// Space Complexity: O(n); Avg: O(logn)

package Sorting2;

public class quickSort {
    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
