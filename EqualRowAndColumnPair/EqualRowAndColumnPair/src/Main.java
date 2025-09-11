import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {  {3,1,2,2},
                            {1,4,4,5},
                            {2,4,2,2},
                            {2,4,2,2}
                        };
        System.out.println(equalRowAndColumnPairs(matrix));
    }

    private static int equalRowAndColumnPairs(int[][] matrix){
        HashMap<String, Integer> dic = new HashMap<>();
        for (int[] row: matrix) {
            String key = convertToKey(row);
            dic.put(key, dic.getOrDefault(key, 0) + 1);
        }

        HashMap<String, Integer> dic2 = new HashMap<>();
        for (int col = 0; col < matrix[0].length; col++) {
            int[] currentCol = new int[matrix.length];
            for (int row = 0; row < matrix.length; row++) {
                currentCol[row] = matrix[row][col];
            }

            String key = convertToKey(currentCol);
            dic2.put(key, dic2.getOrDefault(key, 0) + 1);
        }

        int ans = 0;
        for (String key: dic.keySet()) {
            ans += dic.get(key) * dic2.getOrDefault(key, 0);
        }

        return ans;
    }

    private static String convertToKey(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            sb.append(",");
        }

        return sb.toString();
    }
}