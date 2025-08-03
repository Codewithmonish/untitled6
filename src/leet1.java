import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.Map;

public class leet1 {
    public static void main(String[] args) {
        String str="amazon";
        String s=str.toLowerCase();
        Map<Character,Integer> map1=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (map1.containsKey(ch)){
                int count=map1.get(ch);
                count++;
                map1.replace(ch, count);
            }else{
                map1.put(ch,1);
            }
        }for (Character key: map1.keySet()){
            System.out.print(key+""+map1.get(key));
        }

    }




}
