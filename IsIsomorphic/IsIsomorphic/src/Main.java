import java.util.Arrays;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";

        System.out.println(isIsomorphic(str1, str2));
    }

    private static boolean isIsomorphic(String str1, String str2){


        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();


        for (int i = 0; i < str1.length(); ++i) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            // Case 1: No mapping exists in either of the dictionaries
            if(!map1.containsKey(c1) && !map2.containsKey(c2)){
                map1.put(c1, c2);
                map2.put(c2, c1);
            }
            else if( (map1.containsKey(c1) && !map2.containsKey(c2) ||
                    (!map1.containsKey(c1) && map2.containsKey(c2) ))) {
                return false;
            }
            else if(map1.get(c1) != c2 || map2.get(c2) != c1){
                return false;
            }
        }

        return true;
    }
}