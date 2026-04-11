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
