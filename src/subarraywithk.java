import java.util.HashMap;
import java.util.Map;

public class subarraywithk {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int k=3;
        int ans=sub(nums,k);
        System.out.println(ans);

    }
    public static int sub(int[] num,int k) {


        Map<Integer, Integer> map = new HashMap<>();
        int pre = 0;
        int count = 0;
        map.put(0,1);
        for (int i = 0; i < num.length; i++) {
            pre+=num[i];
            if (map.containsKey(pre-k)){
                count+=map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);

        }
        return count;
    }

}
