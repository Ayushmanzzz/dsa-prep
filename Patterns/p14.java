package Patterns;

public class p14 {
    public static void p14(int n){
        for(int i=1; i<=n; i++){
            int ch = 65;
            for(int j=0; j<i; j++){
                System.out.print((char)ch +" ");
                ch++;
            }
            System.out.println();
        }
    }
}
