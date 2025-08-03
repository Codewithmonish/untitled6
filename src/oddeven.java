import java.util.HashMap;
import java.util.Map;

public class oddeven {
    public static void main(String[] args) {
        String s="aaaaabbbbccd";
        HashMap<Character,Integer> map=new HashMap<>();

        for (char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char b:map.keySet()) {
            int count = map.get(b);
            if (count % 2 == 0) {
                System.out.println(b +"->even("+ count+")");

            } else {
                System.out.println(b +"->odd("+ count+")");
            }
        }
    }

}



