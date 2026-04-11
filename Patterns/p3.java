package Patterns;

public class p3 {
    public static void p3(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }
    }
}
