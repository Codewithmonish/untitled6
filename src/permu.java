import java.util.ArrayList;
import java.util.List;

public class permu {
    public static void main(String[] args) {




    }
    private static void permutation(int[] nums, List<Integer> ds,List<List<Integer>> ans,boolean[] fre){
        if (ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!fre[i]){
                fre[i]=true;
                ds.add(nums[i]);
                permutation(nums,ds,ans,fre);
                ds.remove(ds.size()-1);
                fre[i]=false;
            }

        }
    }


}
