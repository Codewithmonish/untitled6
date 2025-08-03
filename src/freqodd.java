import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class freqodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int res=freqodd(arr,n);
        System.out.println(res);

    }
    public static int freqodd(int[] arr,int n){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {

            if (arr[i]%2!=0){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            }


        }
        int minodd=Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()>1 && entry.getKey()<minodd){
                minodd=entry.getKey();
            }

        }
        return minodd==Integer.MAX_VALUE?-1:minodd;
    }
}
