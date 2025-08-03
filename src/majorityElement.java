import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        int[] num={1,1,1,3,3,2,2,2 };
        List<Integer> ans=maj( num);
        System.out.println(ans);

    }
     static int major(int[] v){
        int n=v.length;
        int count=0;
        int element=0;
         for (int i = 0; i < n; i++) {

             if (count==0){
                 count=1;
                 element=v[i];
             } else if (element==v[i]) {
                 count++;

             }
             else {
                 count--;
             }

             int count1=0;
             for (i = 0; i < n; i++) {
                 if (v[i]==element){
                     count1++;
                 }

             }
             if (count1>(n/2)){
                 return element;
             }

         }
         return -1;

    }
    public static List<Integer> maj(int[] num){
        List<Integer> list =new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            map.put(num[i],map.getOrDefault(num[i],0)+1);
            if (map.get(num[i])>num.length/3){
                if (list.contains(num[i])){
                    continue;

                }else {
                    list.add(num[i]);
                }
            }

        }
        return list;

    }
    public static int maj2(int[] n){
        int element=0;
        int count=0;
        for (int i = 0; i <n.length ; i++) {
            if (count==0){
                count=1;
                element=n[i];
            } else if (element==n[i]) {
                count++;

            }else {
                count--;
            }

        }
        int c=0;
        for (int i = 0; i < n.length; i++) {
            if (element==n[i]){
                c++;
            }

        }
        return c>n.length/2?element:-1;
    }
}
