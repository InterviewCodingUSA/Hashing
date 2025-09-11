import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(sumOfUniqueElements(arr));
    }

    private static int sumOfUniqueElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (Integer i : arr) {
            map.put(i, map.containsKey(i));
        }
        int sum = 0;
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            sum += entry.getValue() ? 0: entry.getKey() ;
        }
        return sum;
    }
}