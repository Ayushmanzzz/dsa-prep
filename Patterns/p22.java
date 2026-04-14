// Problem: Pattern22
// Platform: Strivers A2Z
// Link: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa
// Time Complexity: O(n^2)
// Space Complexity: O(1)

package Patterns;

public class p22 {
    public static void p22(int n){
        int top, bottom, right, left;
        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                top = i;
                left = j;
                bottom = (2*n-2)-i;
                right = (2*n-2)-j;
                int dist = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print(n- dist + " ");
            }
            System.out.println();
        }
    }
}
