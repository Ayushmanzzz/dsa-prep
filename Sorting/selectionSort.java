// Problem: Selection Sort Algorithm
// Platform: StriverA2Z
// Link: https://takeuforward.org/sorting/selection-sort-algorithm
// Approach: Iteraative Approach
// Time Complexity: O(n^2)
// Space Complexity: O(1)

package Sorting;

public class selectionSort {
    public static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Selection Sort:");

        for(int e : arr){
            System.out.print(e + " ");
        }

    }
}
