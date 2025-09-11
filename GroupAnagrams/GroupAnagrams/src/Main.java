import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        ArrayList<ArrayList<String>> listOfGroupedAnagrams = groupAnagrams(arr);
        System.out.println("Hello world!");
    }

    private static ArrayList<ArrayList<String>> groupAnagrams(String[] arr){

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String str : arr) {
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);

            String anagram = String.valueOf(chArr);
            if(!map.containsKey(anagram)){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(anagram, list);
            }else{
                ArrayList<String> list = map.get(anagram);
                list.add(str);
                map.put(anagram, list);
            }
        }

        return   new ArrayList<>(map.values());

    }
}