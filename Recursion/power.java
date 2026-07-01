// Problem: Implement Pow(x,n) | X raised to the power N
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/implement-powxn-x-raised-to-the-power-n
// Approach: Recursion
// Time Complexity: O(log n)
// Space Complexity: O(log n)

package Recursion;

public class power {
    public static double power(double x, int n){
        if(n==0) return 1.0;

        if(n==1) return x;

        if(n < 0) {
            return 1.0 / power(x, -n);
        }

        if(n%2 == 0){
            return power(x*x, n/2);
        }

        return x* power(x, n-1);
    }
}