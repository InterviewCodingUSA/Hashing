import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(str));
    }

    private static boolean isPangram(String str){
        String allChars = "abcdefghijklmnopqrstuvwxyz";
        HashSet<Character> set  = new HashSet<>();
        for(Character c : allChars.toCharArray()){
            set.add(c);
        }
        for(int i = 0 ; i < str.length(); i ++){
            Character ch = Character.toLowerCase(str.charAt(i));
            if(set.contains(ch)){
                set.remove(ch);
            }
            if(set.isEmpty()){
                return true;
            }
        }
        return false;
    }
}