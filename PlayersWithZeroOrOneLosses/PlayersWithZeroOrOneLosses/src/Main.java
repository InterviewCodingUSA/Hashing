import java.util.ArrayList;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        ArrayList<ArrayList<Integer>> list = playersWithZeroOrOneLoss(matches);
        if(!list.isEmpty()){
            System.out.println("Zero Losses");
            for(Integer i : list.get(0)){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        if(list.size() >1){
            System.out.println("One Losses");
            for(Integer i : list.get(1)){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    private static ArrayList<ArrayList<Integer>> playersWithZeroOrOneLoss(int[][] matches){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        HashSet<Integer> zeroLoss = new HashSet<>();
        HashSet<Integer> oneLoss = new HashSet<>();
        HashSet<Integer> moreLosses = new HashSet<>();

        for (int[] match : matches) {
            int winner = match[0], loser = match[1];
            // Add winner.
            if (!oneLoss.contains(winner) && !moreLosses.contains(winner)) {
                zeroLoss.add(winner);
            }
            // Add or move loser.
            if (zeroLoss.contains(loser)) {
                zeroLoss.remove(loser);
                oneLoss.add(loser);
            } else if (oneLoss.contains(loser)) {
                oneLoss.remove(loser);
                moreLosses.add(loser);
            } else if (moreLosses.contains(loser)) {
                continue;
            } else {
                oneLoss.add(loser);
            }
        }

        ArrayList<Integer> zeroLosses = new ArrayList<>(zeroLoss);
        ArrayList<Integer> oneLosses = new ArrayList<>(oneLoss);

        list.add(zeroLosses);
        list.add(oneLosses);
        return list;
    }
}