// Problem: Pattern8
// Platform: Strivers A2Z
// Link: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa
// Time Complexity: O(n^2)
// Space Complexity: O(1)

package Patterns;

public class p8 {
    public static void p8(int n){
        for(int i=n; i>=1; i--){
            for(int j=0; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j=0; j<2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
