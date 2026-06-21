// Level: easy
// Problem: Find the number that appears once, and the other numbers twice
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/arrays/find-the-number-that-appears-once-and-the-other-numbers-twice
// Approach: Optimal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class appearOnce {
    public static int appearOnce(int[] arr) {
        int xorr = 0;

        for (int num : arr) {
            xorr ^= num;
        }

        return xorr;
    }

}
