import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,5,6};
        Map<Integer,Integer> res=freq(arr);
        for (Map.Entry<Integer,Integer> entry:res.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
    public static Map<Integer, Integer> freq(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            else {
                map.put(arr[i],1);
            }

        }
        return map;


    }
}
