// Problem: Pattern18
// Platform: Strivers A2Z
// Link: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa
// Time Complexity: O(n^2)
// Space Complexity: O(1)

package Patterns;

public class p18 {
    public static void p18(int n){
        for(int i=1; i<=n; i++){
            for(int j=n-i; j<n; j++){
                System.out.print((char)(65+j) +" ");
            }
            System.out.println();
        }
    }
}
