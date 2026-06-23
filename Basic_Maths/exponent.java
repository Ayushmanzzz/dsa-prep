// Problem: Exponent of a given number
// Platform: 
// Link: 
// Approach: Optimal Approach
// Time Complexity: O(log n)
// Space Complexity: O(1)

package Basic_Maths;

public class exponent {
    public static double exponent(int n, int x){
        int m = x;
        double ans = 1;

        while(x>0){
            if(x%2 == 1){
                ans = ans*n;
                x = x-1;
            }
            else{
                x = x/2;
                n = n*n;
            }
        }
        if(m<0) ans = 1.0/n;
        return ans;
    }
}
