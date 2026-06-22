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
        // int arr[] = {3, 2, 4, 1, 5};
        int arr1[] = {1,3,5,7,8};
        int arr2[] = {2,4,5,8,9};

        // int result = LargestInArray.LargestInArray(arr);
        // int result = SecLargestInArray.SecLargestInArray(arr);
        // removeDuplicates.removeDuplicates(arr);
        // System.out.println("Result: " + result);
        // rotateByK.rotateByK(arr, 2, "left");
        // zeroToEnd.zeroToEnd(arr);

        // int arr[] = ArrayUnion.ArrayUnion(arr1, arr2);
        // for(int item:arr){
        //     System.out.print(item+" ");
        // }
        // System.out.print("index: "+LinearSearch.LinearSearch(arr, 1));

        int arr[] = {1,2,-3,4,6,7};
        // System.out.print(missingNumber.missingNumber(arr));

        // int arr3[] = {1,1,1,0,1,1,1,1};
        // System.out.print(max1s.max1s(arr3));

        // System.out.print(longestSubarray.longestSubarray(arr, 5));
        System.out.print(longestSubarray2.longestSubarray2(arr));

        sc.close();
    }
}
