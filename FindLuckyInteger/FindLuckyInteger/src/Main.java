import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3};
        System.out.println(findLuckyInteger(arr));
    }

    private static int findLuckyInteger(int[] arr){
        // Use a HashMap to count how many times each num
        // appears in arr.
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (Integer num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int largestLuckyNumber = -1;
        // Iterate over the key/ value pairs of the dictionary.
        for (HashMap.Entry<Integer, Integer> entry : counts.entrySet()) {
            // If this is a lucky number
            if (entry.getKey().equals(entry.getValue())) {
                // Keep the largest out of this lucky number and our current largest.
                largestLuckyNumber = Math.max(largestLuckyNumber, entry.getKey());
            }
        }

        return largestLuckyNumber;
    }
}