import java.util.Scanner;

public class Main {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array Length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] arr = inputArray();
        int arr[] = {3, 2, 4, 1, 5};

        // int result = LargestInArray.LargestInArray(arr);
        // int result = SecLargestInArray.SecLargestInArray(arr);
        // removeDuplicates.removeDuplicates(arr);
        // System.out.println("Result: " + result);
        // rotateByK.rotateByK(arr, 2, "left");
        zeroToEnd.zeroToEnd(arr);
        for(int item:arr){
            System.out.print(item+" ");
        }

        sc.close();
    }
}
