// Level: easy
// Problem: Longest Subarray with zero Sum
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/length-of-the-longest-subarray-with-zero-sum
// Approach: 
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Map;
import java.util.HashMap;

public class longestSubarray2 {
    public static int longestSubarray2(int arr[]){
        int n = arr.length;
        int maxi=0, sum=0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum == 0){
                maxi = i+1;
            }
            else{
                if(map.containsKey(sum)){
                    maxi = Math.max(maxi, i-map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
        return maxi;
    }
}
