// Level: easy
// Problem: Find the Missing Number
// Platform: Strivers DSA sheet
// Link: https://www.geeksforgeeks.org/dsa/find-the-missing-number/
// Approach: Optimal
// Time Complexity: O(n)
// Space Complexity: O(1)

public class missingNumber {
    public static int missingNumber(int[] arr) {
        // int n = arr.length + 1;
        // for (int i = 1; i <= n; i++) {
        //     boolean found = false;
        //     for (int j = 0; j < n - 1; j++) {
        //         if (arr[j] == i) {
        //             found = true;
        //             break;
        //         }
        //     }
        //     if (!found)
        //         return i;
        // }
        // return -1;
        int n = arr.length-1;
        int sum= (n*(n+1))/2;
        int sumCheck=0;
        for(int i=1; i<n; i++){
            sumCheck += i;
        }

        if(sumCheck == 0) return -1;
        return sum - sumCheck;
    }

}
