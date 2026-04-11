package Patterns;

public class p17 {
    public static void p17(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<i; j++){
                System.out.print((char)(j+65)+" ");
            }
            for(int j=i-2; j>=0; j--){
                System.out.print((char)(j+65) +" ");
            }
            System.out.println();
        }

    }
}
