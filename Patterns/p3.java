// Problem: Pattern3
// Platform: Strivers A2Z
// Link: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa
// Time Complexity: O(n^2)
// Space Complexity: O(1)

package Patterns;

public class p3 {
    public static void p3(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }
    }
}
