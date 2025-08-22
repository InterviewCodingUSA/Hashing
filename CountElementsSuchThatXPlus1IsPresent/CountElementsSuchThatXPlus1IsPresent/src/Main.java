import java.util.Arrays;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(countElementsXPlusOneIsPresentHashSet(arr));
        System.out.println(countElementsXPlusOneIsPresentSorting(arr));

    }

    private static int countElementsXPlusOneIsPresentHashSet(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : arr) {
            hashSet.add(x);
        }
        int count = 0;
        for (int x : arr) {
            if (hashSet.contains(x + 1)) {
                count++;
            }
        }
        return count;
    }

    private static int countElementsXPlusOneIsPresentSorting(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        int totalCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i]) {
                if (arr[i - 1] + 1 == arr[i]) {
                    count += totalCount;
                }
                totalCount = 0;
            }
            totalCount++;
        }
        return count;
    }


}