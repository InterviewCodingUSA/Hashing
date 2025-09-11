import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numOfGoodPairs(arr));
    }

    private static int numOfGoodPairs(int[] arr){
        HashMap<Integer, Integer> counts = new HashMap<>();
        int ans = 0;

        for (int num: arr) {
            ans += counts.getOrDefault(num, 0);
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        return ans;
    }
}