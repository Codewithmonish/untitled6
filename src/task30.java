import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        boolean status = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
         if (map.get(ch) == 1) {
              System.out.println(ch);
            }
         }
    }
}
