import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {18,43,36,13,7};
        System.out.println(maxSumOfDigits(arr));
    }

    private static int maxSumOfDigits(int[] arr){
        HashMap<Integer, Integer> dic = new HashMap<>();
        int ans = -1;
        for (int num: arr) {
            int digitSum = getDigitSum(num);
            if (dic.containsKey(digitSum)) {
                ans = Math.max(ans, num + dic.get(digitSum));
            }

            dic.put(digitSum, Math.max(dic.getOrDefault(digitSum, 0), num));
        }

        return ans;

    }


    private static int getDigitSum(int num) {
        int digitSum = 0;
        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }

        return digitSum;
    }

}