
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class task21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String arr=sc.nextLine().toLowerCase().replaceAll("\\s","");
        Map<Character,Integer> map=new HashMap<>();
        char[] crr=arr.toCharArray();
        for (char c:crr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);


    }
}
