import java.rmi.server.RMISocketFactory;
import java.util.HashMap;
import java.util.Map;

public class isomorphic {
    public static void main(String[] args) {
        String a="badc";
        String b="kikp";
        String s="11740";
        System.out.println(longodd(s));
        System.out.println(isomor(a,b));

    }
    public static boolean isomor(String s,String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replace = t.charAt(i);
            if (map1.containsKey(original)) {
                if (map1.get(original) != replace) {
                    return false;
                }
            } else {
                map1.put(original, replace);
            }
            if (map2.containsKey(replace)) {
                if (map2.get(replace) != original) {
                    return false;
                }
            } else {
                map2.put(replace, original);
            }

        }
        return true;
    }
    public static String longodd(String s){
        for (int i = s.length()-1; i >=0 ; i--) {
            char c=s.charAt(i);
            if (c%2==1){
                return s.substring(0,i+1);
            }

        }
        return " ";
    }




}
