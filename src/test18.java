import java.util.*;


public class test18 {
    public static void main(String[] args) {
        String[] s={"eat","tea","sat"};
        System.out.println(group(s));

    }
    public static List<List<String>> group(String[] s){
        Map<String,List<String>> map=new HashMap<>();
        for (String c:s){
            char[] ch=c.toCharArray();
            Arrays.sort(ch);
            String s1=String.valueOf(ch);
            if (!map.containsKey(s1)){
                map.put(s1,new ArrayList<>());
            }
            map.get(s1).add(c);
        }
        return new ArrayList<>(map.values());

    }
}
