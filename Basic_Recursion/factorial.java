// Problem: Factorial of a Number
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/factorial-of-a-number-iterative-and-recursive
// Approach: Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

package Basic_Recursion;

public class factorial {
    public static int factorial(int n){
        if(n==0 || n==1) return 1;

        return n * factorial(n-1);
    }
}
