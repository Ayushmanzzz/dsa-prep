// Problem: Print Name N times using Recursion
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/recursion/print-name-n-times-using-recursion
// Approach: Recursive
// Time Complexity: O(n)
// Space Complexity: O(n)

package Recursion;

public class printName {
    public static void printName(String name, int count, int N) {
        if (count == N)
            return;
        System.out.println(name);

        printName(name, count + 1, N);
    }
}
