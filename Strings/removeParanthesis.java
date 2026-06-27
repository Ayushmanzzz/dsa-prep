// Problem: Remove Outermost Parentheses
// Platform: Striver A2Z
// Link: https://takeuforward.org/data-structure/remove-outermost-parentheses
// Approach: Optimal Approach
// Time Complexity: O(n)
// Space Complexity: O(1)

package Strings;

public class removeParanthesis {
    public static String removeParanthesis(String s){

        StringBuilder result = new StringBuilder();
        int level=0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                if(level > 0){
                    result.append(ch);
                }
                level++;
            }
            else if(ch == ')'){
                level--;
                if(level > 0){
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}
