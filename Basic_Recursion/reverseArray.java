// Problem: Reverse a given Array
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/reverse-a-given-array
// Approach: Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

package Basic_Recursion;

public class reverseArray {
    public static void reverseArray(int arr[], int p1, int p2){
        if(p1>p2) return;

        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;

        reverseArray(arr, p1+1, p2-1);
    }
}
