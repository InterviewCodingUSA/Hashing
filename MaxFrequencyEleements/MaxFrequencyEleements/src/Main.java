import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(arr));
    }

    private static int maxFrequencyElements(int[] arr){
        // Find the frequency of each element
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int num : arr) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }

        // Determine the maximum frequency
        int maxFrequency = 0;
        for (int frequency : frequencies.values()) {
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        // Calculate the total frequencies of elements with the maximum frequency
        int frequencyOfMaxFrequency = 0;
        for (int frequency : frequencies.values()) {
            if (frequency == maxFrequency) {
                frequencyOfMaxFrequency++;
            }
        }
        return frequencyOfMaxFrequency * maxFrequency;
    }
}