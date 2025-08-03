import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class kthsmallest {
    public static void main(String[] args) {
        int[] arr={1,12,3,4,5,6};
        int k=3;
        int ans=smallest(arr,k);
        System.out.println(ans);
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,4,5};
        boolean check=subsetcheck(arr1,arr2);
        System.out.println(check);

    }
    public static int smallest(int[] arr,int k){
        PriorityQueue<Integer> min=new PriorityQueue<>();
        for(int n:arr){
            min.add(n);
        }
        for (int i = 0; i < k-1; i++) {
            min.poll();

        }
        return min.peek();
    }
    public static boolean subsetcheck(int[] arr1,int[] arr2 ){
        Set<Integer> set=new HashSet<>();
        for (int num:arr1){
            set.add(num);
        }
        for (int num:arr2){
            if (!set.contains(num)){
                return false;
            }
        }
        return true;
    }
}
