import java.util.HashMap;
import java.util.Map;

public class repeatingchar {
    public static void main(String[] args) {
        String s="mom";
        char[] ch=s.toCharArray();
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for (Character c:ch){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        for (Character c:map.keySet()){
            if (map.get(c)>1){
                System.out.println("character"+c+"repeated"+map.get(c)+"times");
            }
        }

    }


}
