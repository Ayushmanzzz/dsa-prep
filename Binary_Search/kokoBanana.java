// Problem: Koko Eating Bananas
// Platform: Strivers A2Z
// Link: https://takeuforward.org/binary-search/koko-eating-bananas
// Difficulty: Medium
// Approach: Recursive
// Time Complexity: O(n log n)
// Space Complexity: O(1)

package Binary_Search;

import java.util.Arrays;

public class kokoBanana {
    public static int calculateTotalHours(int[] piles, int speed) {
        int totalH = 0;
        for (int bananas : piles) {
            totalH += Math.ceil((double) bananas / speed);
        }
        return totalH;
    }
    
    public static int kokoBanana(int[] piles, int h) {
        int maxPile = Arrays.stream(piles).max().getAsInt();

        int low = 1;
        int high = maxPile;
        int ans = maxPile;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalH = calculateTotalHours(piles, mid);

            if (totalH <= h) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

}
