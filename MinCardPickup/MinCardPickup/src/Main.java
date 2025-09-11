import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] cards = {3,4,2,3,4,7};
        System.out.println(minCardPickup(cards));
    }

    private static int minCardPickup(int[] cards){
        HashMap<Integer, List<Integer>> dic = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            int num = cards[i];
            if (!dic.containsKey(num)) {
                dic.put(num, new ArrayList<>());
            }

            dic.get(num).add(i);
        }

        int ans = Integer.MAX_VALUE;
        for (int key: dic.keySet()) {
            List<Integer> arr = dic.get(key);
            for (int i = 0; i < arr.size() - 1; i++) {
                ans = Math.min(ans, arr.get(i + 1) - arr.get(i) + 1);
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;
    }

}