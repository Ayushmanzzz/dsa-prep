package Patterns;

public class p5 {
    public static void p5(int n){
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
