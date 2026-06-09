// Level: easy
// Problem: Union of Two Sorted Arrays
// Platform: Strivers DSA sheet
// Link: https://takeuforward.org/data-structure/union-of-two-sorted-arrays
// Approach: Optimal
// Time Complexity: O(m+n) ~ O(n)
// Space Complexity: O(1)

import java.util.ArrayList;
import java.util.List;

public class ArrayUnion {
    public static int[] ArrayUnion(int arr1[], int arr2[]){

        int m = arr1.length, n = arr2.length;
        int i=0, j=0;
        List<Integer> result = new ArrayList<>();
        while(i < m && j < n){
            if(arr1[i] <= arr2[j]){
                if(result.isEmpty() || (result.get(result.size()-1) != arr1[i])){
                    result.add(arr1[i]);
                }
                if(arr1[i] == arr2[j]) j++;
                i++;
            }
            else{
                if(result.isEmpty() || (result.get(result.size()-1) != arr2[j])){
                    result.add(arr2[j]);
                }
                j++;
            }
            
        }

        while(i<m){
            if(result.isEmpty() || result.get(result.size() - 1) != arr1[i]){
                result.add(arr1[i]);
            }
            i++;
        }
        while(j<n){
            if(result.isEmpty() || result.get(result.size() - 1) != arr2[j]){
                result.add(arr2[j]);
            }
            j++;
        }

        int[] resultArray = new int[result.size()];
        for (int x = 0; x < result.size(); x++) {
            resultArray[x] = result.get(x);
        }
        return resultArray;
    }
}
