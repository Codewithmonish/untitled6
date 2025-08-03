import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();


        }
        movezeors(arr);
        for (int num:arr){
            System.out.println(num);
        }

    }
    public static void movezeors(int[] arr){
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr[count++]=arr[i];
            }

        }
        while (count<arr.length){
            arr[count++]=0;
        }
    }
}
