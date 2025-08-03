import java.util.ArrayList;
import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,1,2,2,3,4,4));
        int a=duplicates(arr);
        System.out.println(a);
    }
    public static int duplicates(ArrayList<Integer> arr){
        int n=arr.size();
        int ans=0;
        for (int i = 0; i < n; i++) {
            ans=ans^arr.get(i);

        }
        return ans;
    }
}






