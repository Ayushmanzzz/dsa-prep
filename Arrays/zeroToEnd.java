// Level: easy
// Problem: Move all Zeros to the end of the array
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array
// Approach: Optimal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class zeroToEnd {
    public static void zeroToEnd(int arr[]){
        int n = arr.length;
        int nonZeroPos = 0;

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[nonZeroPos];
                arr[nonZeroPos] = temp;
                nonZeroPos++;
            }
        }
    }
}
