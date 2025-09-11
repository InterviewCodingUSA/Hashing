import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,1,2};
        System.out.println(longestSubarrayWithAtmostKFrequency(arr, 2));
    }

    private static int longestSubarrayWithAtmostKFrequency(int[] arr, int k){
        int ans = 0, start = -1;
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int end = 0; end < arr.length; end++) {
            frequency.put(arr[end], frequency.getOrDefault(arr[end], 0) + 1);
            while (frequency.get(arr[end]) > k) {
                start++;
                frequency.put(arr[start], frequency.get(arr[start]) - 1);
            }
            ans = Math.max(ans, end - start);
        }

        return ans;
    }
}