// Problem: Isomorphic String Check
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/isomorphic-string
// Approach: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)

package Strings;

public class Isomorphic {
    public static boolean Isomorphic(String s, String t){
        int s1[] = new int[256];
        int s2[] = new int[256];

        for(int i=0; i<s.length(); i++){
            if(s1[s.charAt(i)] != s2[t.charAt(i)]) return false;
            s1[s.charAt(i)] = i+1;
            s2[t.charAt(i)] = i+1;
        }

        return true;
    }
}
