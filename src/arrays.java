import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
      //  int[] arr=new int[3];
        int[] arr={1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));



    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
      //  int temp=arr[i1];
      //  arr[i1]=arr[i2];
      //  arr[2]=temp;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }

}