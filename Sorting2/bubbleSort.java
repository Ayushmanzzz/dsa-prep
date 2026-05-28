// Problem: Recursive Bubble Sort Algorithm
// Platform: Striver A2Z
// Link: http://takeuforward.org/sorting/recursive-bubble-sort-algorithm
// Approach: Recursive
// Time Complexity: O(n^2)
// Space Complexity: O(n)

package Sorting2;

public class bubbleSort {
    static void bubbleSort(int[] arr, int n){
        if(n==1) return;

        boolean swapped = false;

        for(int j=0; j<= n-2; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
        }

        if(!swapped) return;

        bubbleSort(arr, n-1);
    }
}
