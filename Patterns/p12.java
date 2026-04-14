// Problem: Pattern12
// Platform: Strivers A2Z
// Link: https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa
// Time Complexity: O(n^2)
// Space Complexity: O(1)

package Patterns;

public class p12 {
    public static void p12(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(j+1 +" ");
            }

            for(int j=n-i; j>0; j--){
                System.out.print("* ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }

            for(int j=i; j>0; j--){
                System.out.print(j +" ");
            }
            
            System.out.println();


        }
    }
}
