// Problem: Pattern13
// Platform: Strivers A2Z
// Link: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa
// Time Complexity: O(n^2)
// Space Complexity: O(1)

package Patterns;

public class p13 {
    public static void p13(int n){
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
