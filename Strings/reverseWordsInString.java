// Problem: Reverse Words in a String
// Platform: Striver A2Z
// Link: http://takeuforward.org/data-structure/reverse-words-in-a-string
// Approach: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)

package Strings;

public class reverseWordsInString {
    public static String reverseWordsInString(String s){
        StringBuilder result = new StringBuilder();
        int i= s.length()-1;
        
        while(i>=0){
            
            while(i>=0 && s.charAt(i) == ' ') i--;
            if(i<0) break;

            int end = i;

            while(i>=0 && s.charAt(i) != ' ') i--;

            String word = s.substring(i+1, end+1);

            if(result.length()>0) result.append(" ");

            result.append(word);
        }

        return result.toString();
    }
}
