// Problem: Can Place Flowers
// Platform: LeetCode
// Link: https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
//Difficulty: easy
// Approach: Greedy Approach
// Time Complexity: O(n)
// Space Complexity: O(1)

package Strings;

public class canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                    
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        return n <= 0;
    }
}
