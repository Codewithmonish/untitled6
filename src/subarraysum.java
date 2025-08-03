import java.util.ArrayList;

public class subarraysum {
    public static void main(String[] args) {
        int[] arr={7,2,1};
        int n=10;
        int target=2;
        System.out.println(subarray(arr,target));

    }
    public static ArrayList<Integer> subarray(int[] arr,int target){
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum+=arr[j];
                if (sum==target){
                    result.add(i+1);
                    result.add(j+1);
                    return result;
                }
            }

        }
        result.add(-1);
        return result;
    }
}
