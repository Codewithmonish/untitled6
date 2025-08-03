import java.util.HashMap;
import java.util.Map;

public class test19 {
    public static void main(String[] args) {
        int[] s={1,2,3};
        int k=3;
        int ans=subarraywithK(s,k);
        System.out.println(ans);


    }
    public static int subarraywithK(int[] s,int k){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefix=0;
        int count=0;
        for (int i = 0; i < s.length; i++) {
            prefix+=s[i];
            if (map.containsKey(prefix-k)){
                count+=map.get(prefix-k);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);

        }
        return count;
    }
}
