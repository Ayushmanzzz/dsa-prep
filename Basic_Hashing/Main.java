package Basic_Hashing;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;

        occurance o = new occurance();

        o.occurance(arr, n);
    }
}
