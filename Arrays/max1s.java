// Level: easy
// Problem: Count Maximum Consecutive One's in the array
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/count-maximum-consecutive-ones-in-the-array
// Approach: Optimal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class max1s {
    public static int max1s(int[] nums) {

        int count = 0;
        int maxi = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            }else {
                count = 0;
            }

            maxi = Math.max(maxi, count);
        }

        return maxi;
    }
}
