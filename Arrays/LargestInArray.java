// Level: easy
// Problem: largest element in an array
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/find-the-largest-element-in-an-array
// Approach: Brute Force
// Time Complexity: O(n)
// Space Complexity: O(1)


public class LargestInArray {
    public static int findLargest(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
