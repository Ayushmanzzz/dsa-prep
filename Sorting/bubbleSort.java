// Problem: Bubble Sort Algorithm
// Platform: Striver A2Z
// Link: http://takeuforward.org/sorting/bubble-sort-algorithm
// Approach: Iterative
// Time Complexity: O(n^2)
// Space Complexity: O(1)

package Sorting;

public class bubbleSort {
    public static void bubbleSort(int arr[]){
        int n= arr.length;

        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Bubble Sort:");

        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}
