// Problem: Finding Sqrt of a number using Binary Search
// Platform: Striver A2Z
// Link: https://takeuforward.org/binary-search/finding-sqrt-of-a-number-using-binary-search
//Difficulty: Medium
// Approach: Optimal
// Time Complexity: O(log n)
// Space Complexity: O(1)

package Binary_Search;

public class rootOfNumber {
    public int rootOfNumber(int x) {
        if (x < 2) return x;
        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid <= x) {
                ans = (int) mid;
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }

        return ans;
    }

}
