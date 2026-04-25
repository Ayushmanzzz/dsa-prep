// Problem: Check if a number is Armstrong Number or not
// Platform: Strivers A2Z
// Link: https://takeuforward.org/maths/check-if-a-number-is-armstrong-number-or-not
// Approach: Brute Force
// Time Complexity: O(log(n))
// Space Complexity: O(1)


package Basic_Maths;

public class isArmstrong {
    public static boolean isArmstrong(int num){
        int digits = (int) (Math.log10(num) + 1);
        int sum=0;
        int temp = num;

        while(temp>0){
            int last = temp%10;
            sum += Math.pow(last, digits);
            temp/=10;
        }

        return sum == num;
    }
}
