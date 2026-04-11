package Patterns;

public class p6 {
    public static void p6(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }
    }
}
