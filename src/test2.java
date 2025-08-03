import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();




        }
        int target=sc.nextInt();
        findpair(arr,target);



    }
    public static void findpair(int[] arr, int target ){
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean found =false;
        for(int i=0;i<arr.length;i++){
            int ans=target-arr[i];
            if (map.containsKey(ans)){
                System.out.println("("+ans+ " "+arr[i]);
                found=true;
            }
            map.put(arr[i],i);
        }
        if(!found){
            System.out.println("-1");
        }
    }
}
