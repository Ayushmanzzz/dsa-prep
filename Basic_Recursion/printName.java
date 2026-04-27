// Problem: Print Name N times using Recursion
// Platform: Striver A2Z
// Link: https://takeuforward.org/recursion/print-name-n-times-using-recursion
// Approach: Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

package Basic_Recursion;

public class printName {
    public static void printName(String name, int count, int N) {
        if (count == N)
            return;

        System.out.println(name);

        printName(name, count + 1, N);
    }
    
}
