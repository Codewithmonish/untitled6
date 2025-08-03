import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        boolean ans=dupliactes(arr);
        System.out.println(ans);

    }
    public static boolean dupliactes(int[] arr){
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);

        }
        return false;
    }
}
