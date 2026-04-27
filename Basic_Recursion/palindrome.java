// Problem: Check if the given String is Palindrome or not
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/check-if-the-given-string-is-palindrome-or-not
// Approach: Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)

package Basic_Recursion;

public class palindrome {
    public static boolean palindrome(int count, String s){
        if(count >= s.length()/2) return true;

        if(s.charAt(count) != s.charAt(s.length()-count-1)) return false;

        return palindrome(count+1, s);
    }
}
