// Problem: Print all Divisors of a given Number
// Platform: Strivers A2Z
// Link: https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number
// Approach: Optimal Approach
// Time Complexity: O(sqrt(n))
// Space Complexity: O(sqrt(n))

package Basic_Maths;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class divisors {
    public static List<Integer> divisors(int num){
        List<Integer> res = new ArrayList<>();

        for(int i=1; i*i<=num; i++){
            if(num%i == 0){
                res.add(i);

                if(num/i != i){
                    res.add(num/i);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}
