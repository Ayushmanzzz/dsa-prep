// Problem: Insertion Sort Algorithm
// Platform: Striver A2Z
// Link: http://takeuforward.org/sorting/insertion-sort-algorithm
// Approach: Iterative
// Time Complexity: O(n^2)
// Space Complexity: O(1)

package Sorting;

public class insertionSort {
    public static int[] insertionSort(int arr[]){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int key=arr[i];
            int j=i-1;
            
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        return arr;
    }
}
