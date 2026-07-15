// Problem: Reverse Vowels of a String
// Platform: LeetCode
// Link: https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
//Difficulty: easy
// Approach: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(n)

package Strings;

public class reverseVowels {
    public static String reverseVowels(String s) {
        char chars[] = s.toCharArray();
        int l=0, r= s.length()-1;
        
        while(l<r){
            while(l<r && !isVowel(chars[l])){
                l++;
            }
            while(l<r && !isVowel(chars[r])){
                r--;
            }
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;

            l++;
            r--;
        }

        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
