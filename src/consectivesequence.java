import java.util.Arrays;

public class consectivesequence {
    public static void main(String[] args) {
        int[] a={100,102,1,2,3,4};
        int ans=longseq(a);
        System.out.println(ans);

    }
    public static int longseq(int[] a){
        int n=a.length;
        if (n==0)
            return 0;
        Arrays.sort(a);
        int lastsmall=Integer.MIN_VALUE;
        int count=0;
        int longest=1;
        for (int i = 0; i < n; i++) {
            if (a[i]-1==lastsmall){
                count+=1;
                lastsmall=a[i];
            } else if (a[i]!=lastsmall) {
                count=1;
                lastsmall=a[i];

            }
            longest=Math.max(longest,count);

        }
       return longest;
    }

}
