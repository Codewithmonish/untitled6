import java.util.HashMap;
import java.util.Map;

public class qustion50 {
    public static void main(String[] args) {
        int[] a={10,10,20,30};

        Map<Integer,Integer> map=new HashMap<>();
        //int sum=0;
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            }
            else {
                map.put(a[i],1);
            }

        }


        int sum=0;
        for (Integer key:map.keySet()){
            if (map.get(key)==1){
                sum+=key;
            }
        }
        System.out.println(sum);

    }
}
