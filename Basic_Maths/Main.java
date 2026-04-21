package Basic_Maths;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        // System.out.println(digits.digits(number));
        // System.out.println(reverse.reverse(number));
        System.out.println(palindrome.palindrome(number));
        sc.close();
    }
}
