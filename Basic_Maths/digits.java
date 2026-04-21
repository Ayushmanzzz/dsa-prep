// Problem: Given an integer N, return the number of digits in N.
// Platform: Strivers A2Z
// Link: https://takeuforward.org/data-structure/count-digits-in-a-number
// Approach: Brute Force
// Time Complexity: O(log N)
// Space Complexity: O(1)


package Basic_Maths;

public class digits {
    public static int digits(int num){
        int count = 0;
        while(num>0){
            count = count+1;

            num = num/10;
        }
        return count;
    }
}
