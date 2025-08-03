import java.util.Arrays;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int[] ans=rearrange(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] rearrange(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int mid=n/2;
        int[] ans=new int[n];
        for (int i = 0; i <= mid; i++) {
            ans[i]=arr[i];

        }
        int ind=mid;
        for (int i = n-1; i >=mid ; i--) {
            ans[ind++]=arr[i];

        }
        for (int i = 0; i < n; i++) {
            arr[i]=ans[i];

        }
        return ans;
    }
}
