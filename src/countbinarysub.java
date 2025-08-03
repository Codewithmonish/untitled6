import java.util.Arrays;

public class countbinarysub {
    public static void main(String[] args) {
        String s="00110011";
        String ss="ABC";
        System.out.println(substring(ss));
        System.out.println(substring(s));

    }
    public static int substring(String s){
        int pre=0;
        int cur=1;
        int count=0;
        for (int i = 1; i <s.length() ; i++) {
            if (s.charAt(i)==s.charAt(i-1)){
                cur++;
            }
            else {
                count+=Math.min(pre,cur);
                pre=cur;
                cur=1;
            }

        }
        count+=Math.min(pre,cur);
        return count;
    }
    public static int unique(String ss){
        int n=ss.length();
        int[] pre=new int[128];
        int[] cur=new int[128];
        Arrays.fill(pre,-1);
        Arrays.fill(cur,-1);
        int[] left=new int[n];
        int[] right=new int[n];
        for (int i = 0; i < n; i++) {
            char c=ss.charAt(i);
            left[i]=i-cur[c];
            cur[i]=i;

        }
        Arrays.fill(cur,n);
        for (int i = n-1; i >=0 ; i--) {
            char c=ss.charAt(i);
            right[i]=cur[c]-i;
            cur[i]=i;
        }
        int res=0;
        for (int i = 0; i < n; i++) {
            res+=left[i]*right[i];

        }
        return res;


    }
}
