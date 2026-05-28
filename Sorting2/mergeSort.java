// Problem: Merge Sort Algorithm
// Platform: StriverA2Z
// Link: https://takeuforward.org/data-structure/merge-sort-algorithm
// Approach: Recursive Approach
// Time Complexity: O(nlogn)
// Space Complexity: O(n)

package Sorting2;
import java.util.List;
import java.util.ArrayList;

public class mergeSort {
    public static void mergeSort(int arr[], int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);

            merge(arr, low, mid, high);
        }
        return;
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
            }
        }

        while(left <= mid){
            temp.add(arr[left++]);
        }

        while(right <= high){
            temp.add(arr[right++]);
        }

        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }
}
