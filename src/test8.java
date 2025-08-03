import java.util.*;

public class test8 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={2,3};
        int[] ans=intersection(arr1,arr2);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] intersection(int[] arr1,int[] arr2){
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for (int num:arr1){
            map.put(num,1);

        }
        for (int num:arr2){
            if (map.containsKey(num) &&map.get(num)==1){
                list.add(num);
                map.put(num,0);
            }
        }
        int[] res=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);

        }
        return res;
    }
}
