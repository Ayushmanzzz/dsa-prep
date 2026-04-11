package Patterns;

public class p11 {
    public static void p11(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                if((i%2 == 0 && j%2 == 0) || (i%2 !=0  && j%2 !=0)){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}
