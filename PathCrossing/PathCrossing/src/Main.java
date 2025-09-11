import java.util.HashMap;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String path = "NES";
        System.out.println(pathCrossing(path));
    }

    private static boolean pathCrossing(String path){
        HashMap<Character, int[]> moves = new HashMap<>();
        moves.put('N', new int[]{0,1});
        moves.put('S', new int[]{0, -1});
        moves.put('W', new int[]{-1, 0});
        moves.put('E', new int[]{1, 0});

        HashSet<int[]> visited = new HashSet<>();
        visited.add(new int[]{0,0});

        int x = 0;
        int y = 0;

        for (Character c : path.toCharArray()) {
            int[] curr = moves.get(c);
            int dx = curr[0];
            int dy = curr[1];
            x += dx;
            y += dy;

            int[] pair = new int[]{x, y};
            if (visited.contains(pair)) {
                return true;
            }

            visited.add(pair);
        }

        return false;
    }
}