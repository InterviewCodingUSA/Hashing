import java.util.ArrayList;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         ArrayList<String[]>list = new ArrayList<>();
         list.add(new String[]{"London","New York"});
         list.add(new String[]{"New York","Lima"});
         list.add(new String[]{"Lima","Sao Paulo"});
        System.out.println(finalDestinationCity(list));

    }

    private static String finalDestinationCity(ArrayList<String[]> cityPairs){
        HashSet<String> hasOutgoing = new HashSet<>();
        for (String[] cityPair : cityPairs) {

            hasOutgoing.add(cityPair[0]);
        }

        for (String[] cityPair : cityPairs) {
            String candidate = cityPair[1];
            if (!hasOutgoing.contains(candidate)) {
                return candidate;
            }
        }

        return "";
    }
}