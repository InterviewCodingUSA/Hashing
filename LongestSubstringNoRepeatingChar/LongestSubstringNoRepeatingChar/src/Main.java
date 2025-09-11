import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubstringNoRepeatingChar(str));
    }

    private static int longestSubstringNoRepeatingChar(String str){

            HashMap<Character, Integer> chars = new HashMap<>();

            int left = 0;
            int right = 0;

            int res = 0;
            while (right < str.length()) {
                char r = str.charAt(right);
                chars.put(r, chars.getOrDefault(r, 0) + 1);

                while (chars.get(r) > 1) {
                    char l = str.charAt(left);
                    chars.put(l, chars.get(l) - 1);
                    left++;
                }

                res = Math.max(res, right - left + 1);

                right++;
            }
            return res;
    }
}