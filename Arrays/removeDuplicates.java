// Level: easy
// Problem: Remove Duplicates in-place from Sorted Array
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array
// Approach: Optimal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class removeDuplicates {
    public static void removeDuplicates(int arr[]){
        int j=0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
    }
}
