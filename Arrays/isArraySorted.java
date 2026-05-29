// Level: easy
// Problem: Check if an Array is Sorted
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/check-if-an-array-is-sorted
// Approach: Optimal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class isArraySorted {
    public static boolean isArraySorted(int arr[]){
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
