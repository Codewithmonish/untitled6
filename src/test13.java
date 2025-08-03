import java.util.HashSet;
import java.util.Set;

public class test13 {
    public static void main(String[] args) {
        String s="abca";
        System.out.println(removedup(s));

    }
    public static String removedup(String s){
        StringBuilder sb=new StringBuilder();
        Set<Character> set=new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }

        }
        return sb.toString();
    }
}
