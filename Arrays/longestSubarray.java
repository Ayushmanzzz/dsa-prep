// Level: easy
// Problem: Longest Subarray with given Sum K(Positives)
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k
// Approach: Optimal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class longestSubarray {
    public static int longestSubarray(int[] arr, int k) {

        int n = arr.length;
        int maxLen = 0;
        int left=0, right=0;
        int sum = arr[0];

        while(right < n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }

            if(sum == k){
                maxLen = Math.max(maxLen, right-left+1);
            }

            right++;
            if(right < n){
                sum += arr[right];
            }
        }
        return maxLen;
    }

}