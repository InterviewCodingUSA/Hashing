//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        System.out.println(binarySubarrayWithSum(arr, 2));
    }

    private static int binarySubarrayWithSum(int[] arr, int goal){

        int start = 0;
        int prefixZeros = 0;
        int currentSum = 0;
        int totalCount = 0;

        // Loop through the array using end pointer
        for (int end = 0; end < arr.length; end++) {
            // Add current element to the sum
            currentSum += arr[end];

            // Slide the window while condition is met
            while (start < end && (arr[start] == 0 || currentSum > goal)) {
                if (arr[start] == 1) {
                    prefixZeros = 0;
                } else {
                    prefixZeros++;
                }

                currentSum -= arr[start];
                start++;
            }

            // Count subarrays when window sum matches the goal
            if (currentSum == goal) {
                totalCount += 1 + prefixZeros;
            }
        }

        return totalCount;

    }
}