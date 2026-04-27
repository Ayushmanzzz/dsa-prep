// Problem: Sum of first N Natural Numbers
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/sum-of-first-n-natural-numbers
// Approach: Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

package Basic_Recursion;

public class nSum {
    public static int nSum(int n){
        if(n==1) return 1;

        return n+ nSum(n-1);
    }
}
