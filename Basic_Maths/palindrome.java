// Problem: Given an integer N, return true if it is a palindrome else return false.
// Platform: Strivers A2Z
// Link: https://takeuforward.org/data-structure/check-if-a-number-is-palindrome-or-not
// Approach: Brute Force
// Time Complexity: O()
// Space Complexity: O(1)


package Basic_Maths;

public class palindrome {
    public static boolean palindrome(int num){
        int temp = num;
        int rev =0;
        while(temp > 0){
            int last = temp%10;
            rev = rev * 10 + last;

            temp/= 10;
        }

        if(num == rev) return true;
        return false;
    }
}
