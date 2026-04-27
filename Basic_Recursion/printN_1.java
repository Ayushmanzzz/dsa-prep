// Problem: Print N to 1 using Recursion
// Platform: Striver A2Z
// Link: https://takeuforward.org/recursion/print-n-to-1-using-recursion
// Approach: Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

package Basic_Recursion;

public class printN_1 {
    public static void printN_1(int n){
        if(n == 0) return;

        System.out.print(n+" ");
        printN_1(n-1);
    }
}