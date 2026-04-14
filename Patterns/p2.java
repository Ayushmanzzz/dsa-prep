// Problem: Pattern2
// Platform: Strivers A2Z
// Link: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa
// Time Complexity: O(n^2)
// Space Complexity: O(1)

package Patterns;

public class p2 {
    public static void p2(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
