import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hexaware {
    public static void main(String[] args) {
        int n=20;
        int sum=0;
        for (int i = 2; i <=n ; i++) {
            if (n%i==0 && isprime(i)){
                sum+=i;
            }

        }
        System.out.println(sum);
    }
    public static int charity(int n){
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i*i;
        }
        return sum;
    }
    public static List<Integer> cuckoo(int n){
        List<Integer> list=new ArrayList<>();
        if (n==0) return list;

        list.add(1);
        for (int i = 1; i <n ; i++) {
            if (i % 2 ==0){
                list.add(list.get(i/2)+list.get(i-1));
            }
            else {
                list.add(list.get((i-1)/2) +list.get(i-2));
            }

        }
        return list;
    }
    public static void pattern(int m ,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
    public static int longestalternative(int[] arr){
        if (arr.length==0){
            return 0;
        }
        int up=1;
        int down=1;
        for (int i = 1; i <arr.length; i++) {
            if (arr[i]>arr[i-1]){
                down=up+1;
            } else if (arr[i]<arr[i-1]) {
                up=down+1;
            }

        }return Math.max(up,down);

    }
    public static int longestevenlengthsub(String s,int n){
        int max=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j+=2) {
                int length=j-i+1;
                int leftsum=0;
                int rightsum=0;
                for (int k = 0; k < length/2; k++) {
                    leftsum=leftsum+(s.charAt(i+k) -'0');
                    rightsum=rightsum+(s.charAt(i+k+length/2) -'0');

                }
                if (leftsum==rightsum && max<length){
                    max=length;
                }

            }

        }
        return max;
    }
    public static boolean isprime(int n){
        if (n<2){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n%i==0){
                return false;
            }

        }
        return true;
    }


}
