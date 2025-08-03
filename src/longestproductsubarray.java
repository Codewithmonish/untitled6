import java.util.HashMap;
import java.util.Map;

public class longestproductsubarray {
    public static void main(String[] args) {
        //int[] nums={1,3,6,2};
        //int ans=product(nums);
        //
        // System.out.println(ans);
        int[] num={1,2,3};

        int ans=mjor(num);
        System.out.println(ans);

    }
    public static int product(int[] nums){
        int len=nums.length;
        int max=0;
        int prefix=1;
        int suffix=1;
        for (int i = 0; i < nums.length; i++) {
            if (prefix==0) return prefix=1;
            if (suffix==0) return  suffix=1;
            prefix=prefix* nums[i];
            suffix=suffix*nums[len-i-1];
            max=Math.max(max,Math.max(prefix,suffix));

        }
        return max;
    }
    public static int dup(int[] num){
        int i=2;
        for (int j = 2; j < num.length; j++){

            if (i<2 || num[j]!=num[j-2]){
                num[i++]=num[i];
            }

        }
        return i;
    }
    public static int mjor(int[] num){
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i])){
                map.put(num[i],map.get(num[i])+1);
            }
            else {
                map.put(num[i],1);
            }

        }
        for (int key:map.keySet()){
            if (map.get(key)==1){
                sum+=key;
            }
        }
        return sum;
    }
}
