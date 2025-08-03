import java.util.Arrays;

public class productarray {
    public static void main(String[] args) {
        int[] nums={4,2,1,7};
        int[] a=product(nums);
        System.out.println(Arrays.toString(a));

    }
    public static int[] product(int[] nums){
        int len=nums.length;
        int[] left=new int[len];
        int[] right=new int[len];
        int[] ans=new int[len];
        left[0]=1;
        for (int i = 1; i <nums.length ; i++) {
            left[i]=left[i-1]*nums[i-1];

        }
        right[len-1]=1;
        for (int i = len-2; i >=0 ; i--) {
            right[i]=right[i+1]*nums[i+1];

        }
        for (int i = 0; i < len; i++) {
            ans[i]=left[i]*right[i];

        }
        return ans;
    }
}
