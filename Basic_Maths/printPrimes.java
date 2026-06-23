// Problem: Print all prime numbers of the given number
// Platform: 
// Link: 
// Approach: Optimal Approach
// Time Complexity: O(sqrt(n))
// Space Complexity: O(1)

package Basic_Maths;

public class printPrimes {
    public static void printPrimes(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.print(i+" ");
                while(n%i == 0){
                    n = n/i;
                }
            }
        }
        if(n != 1) System.out.print(n);
    }
}
