// Level: easy
// Problem: Rotate array by K elements
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/rotate-array-by-k-elements
// Approach: Optimal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class rotateByK {
    public static void rotateByK(int arr[], int k, String direction){
        int n = arr.length;

        if(n==0 || k==0){
            return;
        }

        k = k%n;

        if(direction.equals("right")){
            reverse(arr, 0, n-k-1);
            reverse(arr, n-k, n-1);
            reverse(arr, 0, n-1);
        }
        else if(direction.equals("left")){
            reverse(arr, 0, k-1);
            reverse(arr, k, n-1);
            reverse(arr, 0, n-1);
        }
    }

    private static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
