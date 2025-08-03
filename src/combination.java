import java.util.ArrayList;
import java.util.List;

public class combination {
    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        int[] candisates={2,3,6,7};
        int target=5;
        findcomb(0,candisates,7,ans,new ArrayList<>());
        System.out.println(ans);


    }
    static void findcomb(int ind,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if (target==0){
            ans.add(new ArrayList<>(ds));

        }
        return;

       // findcomb(ind+1,arr,target,ans,ds);
    }

}
