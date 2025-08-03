import java.util.HashMap;
import java.util.Map;

public class test15 {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        String s="aabbbc";
        Map<Character,Integer> res=stringcomp(s);
        for (Map.Entry<Character,Integer> entry:res.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
    public static Map<Character,Integer> stringcomp(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (map.containsKey(ch)){
                int count=map.get(ch);
                count++;
                map.replace(ch,count);
            }
            else {
                map.put(ch,1);
            }


        }
        for (Character key: map.keySet()){
            map.put(key,map.get(key));
        }
        return map;
    }
}
