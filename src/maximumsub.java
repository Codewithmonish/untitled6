import java.util.Arrays;
import java.util.Scanner;

public class maximumsub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int[] res=maximum(arr);
        for (int i = 1; i < res.length; i++) {
            System.out.print(res[i]);

        }

    }

    public static int[] maximum(int[] nums) {
        int n=nums.length;
        int sum = nums[0];
        int max = nums[0];
        int start = 0;
        int end=0;
        int temp=0;
        for (int i = 1; i < n; i++) {
            if (nums[i]>sum+nums[i]){
                sum=nums[i];
                temp=i;
            }
            else {
                sum+=nums[i];
            }
            if (sum > max) {
                max=sum;
                start=temp;
                end=i;
            }

        }


       int[] res=new int[end-start+2];
        for (int i = start; i <=end ; i++) {
            res[i-start]=nums[i];

        }
        res[res.length-1]=sum;
        return res;
    }
}


