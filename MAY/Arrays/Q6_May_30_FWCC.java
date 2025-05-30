/*
2942. Find Words Containing Character
You are given a 0-indexed array of strings words and a character x.
Return an array of indices representing the words that contain the character x.
Note that the returned array may be in any order.
Example 1:
Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
*/
import java.util.*;

public class Q6_May_30_FWCC {
    //brute force
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }

    //optimized
    public static List<Integer> findWordsCOnt(String[] word,char x){
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < word.length; i++){
            if(word[i].contains(Character.toString(x))){
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String[] words = {"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';

        List<Integer> result = findWordsCOnt(words, x);
        System.out.println(result); // Output: [0, 2]
    }
}
