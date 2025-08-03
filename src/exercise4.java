import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class exercise4 {
    public static void main(String[] args) {
        String s="abcabcbb";
        int start=0;
        int end=0;
        int MaxLen=Math.min(s.length(),1);
        Set<Character>seen=new HashSet<>();
        while (end<=s.length()){
            char c=s.charAt(end);
            seen.remove(s.charAt(start));
            start+=1;
        }

        int windowsize=end - start +1;
        MaxLen=Math.max(MaxLen,windowsize);
        end+=1;

    }
}

