import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int[] res=largesmall(arr);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
    public static int[] largesmall(int[] arr){
        int n=arr.length;
        if (n==0){
            return new int[]{-1};
        }
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MIN_VALUE;
        for (int num:arr){
            if (num>max1){
                max2=max1;
                max1=num;
            } else if (num>max2 && num!=max1) {
                max2=num;

            }
            if (num<min1){
                min2=min1;
                min1=num;
            } else if (num<min2 && num!=min1) {
                min2=num;

            }
        }
        if (min2==Integer.MAX_VALUE) min2=-1;
        if (max2==Integer.MIN_VALUE) max2=-1;
        return new int[]{min2,max2};

    }
}
