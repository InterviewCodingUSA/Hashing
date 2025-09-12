import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {4,2,4,5,6};
        System.out.println(getErasureValue(arr));
    }

    private static int getErasureValue(int[] arr){
        int result = 0;
        int currentSum = 0;
        HashSet<Integer> set = new HashSet<>();
        int start = 0;
        for (int i : arr) {
            // increment start until subarray has unique elements
            while (set.contains(i)) {
                set.remove(arr[start]);
                currentSum -= arr[start];
                start++;
            }
            currentSum += i;
            set.add(i);
            // update result with maximum sum found so far
            result = Math.max(result, currentSum);
        }
        return result;
    }
}