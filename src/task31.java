import java.util.HashMap;

public class task31 {
    public static void main(String[] args) {
        String s="fou";
        String t="bae";
        HashMap<Character,Character> map=new HashMap<>();
        if (s.length() != t.length()){
            System.out.println("not isomorphic");
        }
        for (int i=0;i<s.length();i++){
            char key=s.charAt(i);
            char vasl=t.charAt(i);
            if (map.containsKey(key)) {
                if (map.get(key) == vasl)
                    continue;
                System.out.println("not a");

            }
            else {
                if (map.containsKey(vasl)){

                }
                map.put(key,vasl);
            }
        }
        System.out.println("iso");

    }
}
