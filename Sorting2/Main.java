package Sorting2;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1};
        // mergeSort sol = new mergeSort();
        // sol.mergeSort(arr, 0, arr.length - 1);

        // bubbleSort sol = new bubbleSort();
        // sol.bubbleSort(arr, 5);
        // insertionSort sol = new insertionSort();
        // sol.insertionSort(arr, 0, 5);
        quickSort sol = new quickSort();
        sol.quickSort(arr, 0, arr.length-1);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}
