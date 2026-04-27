// Problem: Print 1 to N using Recursion
// Platform: Striver A2Z
// Link: https://takeuforward.org/recursion/print-1-to-n-using-recursion
// Approach: Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

package Basic_Recursion;

public class print1_N{
    public static void print1_N(int curr, int n){
        if(curr > n) return;
        
        System.out.print(curr+" ");

        print1_N(curr+1, n);
    }
}
