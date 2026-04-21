// Problem: Given an integer N return the reverse of the given number.
// Platform: Strivers A2Z
// Link: https://takeuforward.org/maths/reverse-digits-of-a-number
// Approach: Brute Force
// Time Complexity: O(log n)
// Space Complexity: O(1)

package Basic_Maths;

public class reverse {
    public static int reverse(int num){
        int rev =0;
        while(num > 0){
            int last = num%10;
            rev = rev * 10 + last;

            num/= 10;
        }
        return rev;
    }
}
