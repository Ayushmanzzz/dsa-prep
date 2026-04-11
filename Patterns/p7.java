package Patterns;

public class p7 {
    public static void p7(int n){
        for(int i=1; i<=n; i++){
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
