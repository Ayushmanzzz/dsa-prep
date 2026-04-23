package Basic_Maths;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int number = sc.nextInt();
        // System.out.println(digits.digits(number));
        // System.out.println(reverse.reverse(number));
        // System.out.println(palindrome.palindrome(number));

        int n1 = 20, n2 = 15;
        System.out.println(GCD.findGcd(n1, n2));
        sc.close();
    }
}
