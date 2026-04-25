// Problem: Check if a number is prime or not
// Platform: Strivers A2Z
// Link: https://takeuforward.org/data-structure/check-if-a-number-is-prime-or-not
// Approach: Optimal Approach
// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)

package Basic_Maths;

public class prime {
    public static boolean prime(int num) {
        int count=0;
        // for(int i=1; i<=num; i++){
        //     if(num%i == 0){
        //         count++;
        //     }
        // }
        // return count ==2;

        if (num<=1) return false;

        for(int i=2; i<= Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
