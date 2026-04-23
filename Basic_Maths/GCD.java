// Problem: Given two integers N1 and N2, find their greatest common divisor
// Platform: Strivers A2Z
// Link: https://takeuforward.org/data-structure/find-gcd-of-two-numbers
// Approach: Brute Force
// Time Complexity: O(min(n1,n2))
// Space Complexity: O(1)


package Basic_Maths;


public class GCD {
    public static int findGcd(int n1, int n2) {
        int gcd = 1;

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
                                
