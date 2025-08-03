import java.util.HashMap;
import java.util.Map;

public class test14 {
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(fisrtnonreapeat(s));

    }
    public static int fisrtnonreapeat(String s){
        int[] freq=new int[256];
        char[] ch=s.toCharArray();
        for (char c:ch) {
            freq[c-'a']++;

        }
        for (int i = 0; i < ch.length; i++) {
            if (freq[ch[i]-'a']==1){
                return i;
            }

        }
        return -1;
    }
}
