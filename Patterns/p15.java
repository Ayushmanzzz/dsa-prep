package Patterns;

public class p15 {
    public static void p15(int n){
        for(int i=n; i>=1; i--){
            int ch = 65;
            for(int j=0; j<i; j++){
                System.out.print((char)ch +" ");
                ch++;
            }
            System.out.println();
        }
    }
}
