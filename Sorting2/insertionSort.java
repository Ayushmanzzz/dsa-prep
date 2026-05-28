// Problem: Recursive insertion Sort Algorithm
// Platform: Striver A2Z
// Link: http://takeuforward.org/sorting/recursive-insertion-sort-algorithm
// Approach: Recursive
// Time Complexity: O(n^2)
// Space Complexity: O(n)

package Sorting2;

public class insertionSort{
    public static void insertionSort(int arr[], int start, int n){
        if(start== n) return;

        int j = start;

        while(j > 0 && arr[j - 1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertionSort(arr, start+1, n);
    }
}