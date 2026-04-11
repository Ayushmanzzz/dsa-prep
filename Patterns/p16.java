package Patterns;

public class p16 {
    public static void p16(int n){
        int ch = 65;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print((char)ch +" ");
            }
            ch++;
            System.out.println();
        }
    }
}
