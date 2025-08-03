import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println(ladder(arr,n));


    }
    public static ArrayList<Integer> ladder(int[] arr, int n){
        ArrayList<Integer> list=new ArrayList<>();
        int max=-1;
        for (int i = n-1; i >=0 ; i--) {
            if (arr[i]>max){
                max=arr[i];
                list.add(max);
            }

        }
        Collections.reverse(list);
        return list;
    }
}
