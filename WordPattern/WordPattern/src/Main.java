import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str1 = "abba";
        String str2 = "dog cat cat dog";
        System.out.println(matchesWordPattern(str1, str2));
    }

    private static boolean matchesWordPattern(String str1, String str2){
        HashMap<Character, String> map_char = new HashMap<>();
        HashMap <String, Character> map_word = new HashMap<>();
        String[] words = str2.split(" ");

        if (words.length != str1.length())
            return false;

        for (int i = 0; i < words.length; i++) {
            char c = str1.charAt(i);
            String w = words[i];
            if (!map_char.containsKey(c)) {
                if (map_word.containsKey(w)) {
                    return false;
                } else {
                    map_char.put(c, w);
                    map_word.put(w, c);
                }

            } else {
                String mapped_word = map_char.get(c);
                if (!mapped_word.equals(w))
                    return false;
            }
        }

        return true;
    }
}