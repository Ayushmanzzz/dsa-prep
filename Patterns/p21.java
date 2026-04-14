// Problem: Pattern21
// Platform: Strivers A2Z
// Link: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa
// Time Complexity: O(n^2)
// Space Complexity: O(1)

package Patterns;

public class p21 {
    public static void p21(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
