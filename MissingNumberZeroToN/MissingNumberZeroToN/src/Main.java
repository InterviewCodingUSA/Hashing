import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumberZeroToN(arr));
        System.out.println(missingNumberZeroToNUsingSet(arr));
    }

    private static int missingNumberZeroToN(int[] arr){
        int expectedSum = arr.length*(arr.length + 1)/2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }

    private static int missingNumberZeroToNUsingSet(int[] arr){
        HashSet<Integer> numSet = new HashSet<Integer>();
        for (int num : arr) numSet.add(num);

        int expectedNumCount = arr.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
    }
}