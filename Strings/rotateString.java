// Problem: Check if one string is rotation of another
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/check-if-one-string-is-rotation-of-another
// Approach: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)

package Strings;

public class rotateString {
    public static boolean rotateString(String s, String goal){
        String result = new String();

        if(goal.length() != s.length()) return false;

        for(int i=0; i<s.length(); i++){
            result = s.substring(i) + s.substring(0,i);

            if(result.equals(goal)) return true;
        }

        return false;
    }
}
