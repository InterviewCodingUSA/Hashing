import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "eidbaooo";

        System.out.println(checkInclusion(str1, str2));
    }

    private static boolean checkInclusion(String str1, String str2){
        if (str1.length() > str2.length())
            return false;
        HashMap<Character, Integer> s1map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++)
            s1map.put(str1.charAt(i), s1map.getOrDefault(str1.charAt(i), 0) + 1);

        for (int i = 0; i <= str2.length() - str1.length(); i++) {
            HashMap<Character, Integer> s2map = new HashMap<>();
            for (int j = 0; j < str1.length(); j++) {
                s2map.put(str2.charAt(i + j), s2map.getOrDefault(str2.charAt(i + j), 0) + 1);
            }
            if (matches(s1map, s2map))
                return true;
        }
        return false;
    }

    private static boolean matches(HashMap<Character, Integer> s1map, HashMap<Character, Integer> s2map) {
        for (char key : s1map.keySet()) {
            if (s1map.get(key) - s2map.getOrDefault(key, -1) != 0)
                return false;
        }
        return true;
    }
}