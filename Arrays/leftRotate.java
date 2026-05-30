// Level: easy
// Problem: Left Rotate the Array by One
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/left-rotate-the-array-by-one
// Approach: Optimal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class leftRotate {
    public static void leftRotate(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
}
