import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String str = "abccbaacz";
        System.out.println(firstRepeatedCharacter(str));
    }

    private static char firstRepeatedCharacter(String str){

        if(str.length() <=1){
            return '\0';
        }
        HashSet<Character> set = new HashSet<>();
        for(Character ch : str.toCharArray()){
            if(set.contains(ch)){
                return ch;
            }
            set.add(ch);
        }

        return '\0';
    }
}