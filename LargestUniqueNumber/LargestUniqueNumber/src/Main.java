import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,7,3,9,4,9,8,3,1};
        System.out.println(largestUniqueNumber(arr));
    }

    private static int largestUniqueNumber(int[] arr){
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry entry : map.entrySet()){
            if((Integer)entry.getValue() == 1){
                maxValue = Math.max((Integer)entry.getKey(), maxValue);
            }
        }
        return maxValue;
    }
}