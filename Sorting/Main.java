package Sorting;
import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = {34,23,12,65,6,54};

        System.out.println("Before: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        // bubbleSort.bubbleSort(arr);
        insertionSort.insertionSort(arr);

        System.out.println("Insertion Sort: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
