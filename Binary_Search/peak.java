// Problem: Find peak element
// Platform: Striver A2Z
// Link: https://takeuforward.org/plus/dsa/problems/find-peak-element?source=strivers-a2z-dsa-track
//Difficulty: Medium
// Approach: Recursive
// Time Complexity: O(log n)
// Space Complexity: O(1)

package Binary_Search;

public class peak {
    public int peak(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

}
