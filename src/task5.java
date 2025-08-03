import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        for (int i = 0; i <n-1 ; i++) {
            arr[i]=sc.nextInt();

        }
        int ans=missing(arr,n);
        System.out.println(ans);
    }
    public static void sort012(int[] arr){
        int low=0;
        int mid=0;
        int high=arr.length-1;

        //int temp=0;
        while (mid<=high){
            switch(arr[mid]){
                case 0:
                    int temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp1=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp1;
                    high--;
                    break;

            }
        }
        for (int num:arr){
            System.out.println(num+" ");
        }
    }
    public static int missing(int[] arr,int n){
        //int n=arr.length;
        int total=n*(n+1)/2;
        int sum=0;
        for (int num:arr) {
            sum+=num;


        }
        return total-sum;
    }
}
