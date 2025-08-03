import java.util.ArrayList;
import java.util.List;

public class pascal {
    public static void main(String[] args) {
        List<List<Integer>> s=pascel(5);
        System.out.print(s);
        System.out.println();



    }

    public static List<Integer> gen(int row){
        long ans=1;
        List<Integer> ansrow=new ArrayList<>();
        ansrow.add(1);
        for (int col = 1; col < row; col++) {
            ans=ans*(row-col);
            ans=ans/col;
            ansrow.add((int) ans);

        }
        return ansrow;
    }
    public static List<List<Integer>> pascel(int n){
        List<List<Integer>> ans=new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            ans.add(gen(i));

        }
        return ans;
    }

}