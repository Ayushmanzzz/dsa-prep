// Problem: Largest Odd Number in a String
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/largest-odd-number-in-a-string
// Approach: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)

package Strings;

public class LargestOddNo {
    public static String LargestOddNo(String s){
        
        int id = -1, i;

        for(i=s.length()-1; i>=0; i--){
            if((s.charAt(i)-'0') %2 ==1){
                id = i;
                break;
            }
        }
        if(id == -1) return "";

        i=0;
        while(i <= id && s.charAt(i)=='0') i++;

        return s.substring(i,id+1);
    }
}
