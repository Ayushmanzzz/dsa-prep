package Basic_Maths;
import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int number = sc.nextInt();
        // System.out.println(digits.digits(number));
        // System.out.println(reverse.reverse(number));
        // System.out.println(palindrome.palindrome(number));

        // int n1 = 20, n2 = 15;
        // int num = 36;
        // // divisors.divisors(num);

        // List<Integer> result = divisors.divisors(num);

        // for(int i: result){
        //     System.out.print(i+" ");
        // }


        int num = 13;
        System.out.print(prime.prime(num));
        sc.close();
    }
}
