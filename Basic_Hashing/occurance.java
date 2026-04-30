// Problem: Count frequency of each element in the array
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/count-frequency-of-each-element-in-the-array
// Approach: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(n)

package Basic_Hashing;
import java.util.*;

public class occurance {
    public static void occurance(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    
}
