// Problem: Find the highest/lowest frequency element
// Platform: Striver A2Z
// Link: https://takeuforward.org/arrays/find-the-highest-lowest-frequency-element
// Approach: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(n)


package Basic_Hashing;

import java.util.HashMap;
import java.util.Map;

public class frequencyCount {
    public static void frequencyCount(int arr[], int n){
        Map<Integer, Integer> map= new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int maxFreq=0, minFreq=n;
        int maxEle=0, minEle=0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            int ele = entry.getKey();
            int count = entry.getValue();
            if(count > maxFreq){
                maxFreq = count;
                maxEle = ele;
            }

            if(count < maxFreq){
                minFreq = count;
                minEle = ele;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }
}
