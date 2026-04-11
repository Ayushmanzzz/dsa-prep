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
