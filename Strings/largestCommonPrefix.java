// Problem: Longest Common Prefix
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/longest-common-prefix
// Approach: Optimal Approach
// Time Complexity: O(n * log(n+m))
// Space Complexity: O(m)

package Strings;
import java.util.Arrays;


public class largestCommonPrefix {
    public static String largestCommonPrefix(String []s){
        StringBuilder result = new StringBuilder();

        Arrays.sort(s);
        String first = s[0];

        String last = s[s.length-1];

        for(int i=0; i<Math.min(first.length(), last.length()); i++){
            if (first.charAt(i) != last.charAt(i)) {
                return result.toString();
            }

            result.append(first.charAt(i));
        }

        return result.toString();
    }
}
