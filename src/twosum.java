import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 5, 0};
        int target = 7;
        int[] res=twosumm(n,arr,target);
        System.out.println(Arrays.toString(res));
       // int ans = twosum(n, arr, target);
        //System.out.println(ans);


    }

     public static int[] twosumm(int n, int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int ans = target - num;
            if (map.containsKey(ans)) {
                return new int[]{map.get(ans),i};


                // return "yes";
                // map.put(arr[i], i);

            }
            map.put(arr[i],1);

        }
        return new int[]{-1,-1};
    }

}