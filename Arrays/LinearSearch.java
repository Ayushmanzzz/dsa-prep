// Level: easy
// Problem: Linear Search
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/linear-search-in-c
// Approach: Brute Force
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LinearSearch {
    public static int LinearSearch(int arr[], int value){

        int n= arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
