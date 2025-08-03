import java.util.HashMap;

public class task9 {
    public static void main(String[] args) {
        String s="aaaaabbc";
        HashMap<Character, Integer> fremap=new HashMap<>();
        int even=0;
        int odd=0;
        int total;
        for (char c:s.toCharArray()){
            fremap.put(c,fremap.getOrDefault(c,0) +1);
        }
        for (int count: fremap.values()) {

            if (count % 2 == 0) {
                even = Math.max(even, count);
            } else {
                odd = Math.max(odd, count);
            }
        }
        total=odd-even;
        System.out.println(total);
    }
}
