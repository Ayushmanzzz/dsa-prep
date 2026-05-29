// Level: easy
// Problem: second largest and smallest element in an array
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array
// Approach: Optimal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class SecLargestInArray {
    public static int SecLargestInArray(int arr[]){
        int secLargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }
        }
        return secLargest;
    }
    public static int SecSmallestInArray(int arr[]){
        int secSmallest=Integer.MAX_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                secSmallest = smallest;
                smallest = arr[i];
            }
        }
        return secSmallest;
    }
}
