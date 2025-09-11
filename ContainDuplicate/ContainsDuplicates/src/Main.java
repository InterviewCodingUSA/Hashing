import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    private static boolean containsDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>(arr.length);
        for (int x: arr) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}