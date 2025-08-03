import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class task15 {
    public static void main(String[] args) {
       String str="mom";
        char[] ca=str.toCharArray();
        Map<Character,Integer> m=new HashMap<Character,Integer>();
        for (Character c:ca){
            if (m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }
            else{
                m.put(c,1);
            }
        }
        for(Character c:m.keySet()){
            if (m.get(c)>1){
                System.out.println("character"+c+"repeated"+m.get(c)+"times");
            }
        }

    }
}
