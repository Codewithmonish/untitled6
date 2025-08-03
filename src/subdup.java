import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subdup {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(ans);

        }

    }
    static List<List<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        int s=0;
        int e=0;
        for (int i = 0; i < arr.length; i++) {
            s=0;
            if (arr[i]==arr[i+1]){
                s=e+1;
            }
            e= outer.size()-1;
            int n= outer.size();
            for (int j = s; j <n ; j++) {
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(i);
                outer.add(internal);

            }

        }






        return outer;
    }
}
