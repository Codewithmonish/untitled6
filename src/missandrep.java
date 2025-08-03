import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class missandrep {
    public static void main(String[] args) {
        //int[] a={0,1,2,3,4,6};
        int[][] A={{1,3},{2,2}};
        int[] ans=missansrep(A);
        System.out.println(Arrays.toString(ans));


       // System.out.println(missing(a));

       // System.out.println(repating);
       // System.out.println(miss);
    }
    public static int missing(int[] n){
        int len=6;
        int sum=0;
        int tot=len*(len+1)/2;
        int val=0;
        for (int i = 0; i < n.length-1; i++) {
            sum=sum+n[i];
            val=tot-sum;


        }
        return val;
    }
    public static int[] missansrep(int[][] a){
        int n=a.length;
        int size=n*n;
        Set<Integer> set=new HashSet<>();
        int rep=-1;
        int miss=-1;
        for (int[] rows:a){
            for (int nums:rows){
                if (set.add(nums)){
                    rep=nums;

                }
            }
        }
        for (int i = 1; i <=size ; i++) {
            if (!set.contains(i)){
                miss=i;
                break;
            }

        }
        return new int[]{rep,miss};
    }

}
