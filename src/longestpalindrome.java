import java.util.Arrays;

public class longestpalindrome {
    public static void main(String[] args) {
        String s="abaccabe";
        String[] st={"flower","flow","flight"};
        System.out.println(commonprefix(st));
        System.out.println(longsub(s));


    }
    public static String  longsub(String s){
        int start=0;
        int end=0;
        for (int i = 0; i < s.length(); i++) {
            int odd=expans(s,i,i);
            int even=expans(s,i,i+1);
            int len=Math.max(odd,even);
            if (len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }

        }
        return s.substring(start,end+1);
    }
    public static int expans(String s,int left,int right){
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static String commonprefix(String[] st){
        Arrays.sort(st);
        String str1=st[0];
        String str2=st[st.length-1];
        int index=0;
        while (index<str1.length()){
            if (str1.charAt(index)==str2.charAt(index)){
                index++;
            }else {
                break;
            }

        }
        return index==0?" ":str1.substring(0,index);

    }
}
