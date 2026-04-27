// Problem: Print Fibonacci Series up to Nth term
// Platform: Striver A2Z
// Link: http://takeuforward.org/arrays/print-fibonacci-series-up-to-nth-term
// Approach: Recursion
// Time Complexity: O(2^n)
// Space Complexity: O(n)

package Basic_Recursion;

public class fibonacci {
    public static int fibonacci(int n){
        if(n<=1) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
