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
