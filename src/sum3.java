import java.util.*;

public class sum3 {
    public static void main(String[] args) {
        int[] arr={1,4,45,6,10,8};
        int n=6;
        int k=13;
        System.out.println(triplets(arr,n,k));

        List<List<Integer>> ans=threesum(arr);
        System.out.print(ans);

    }
    public static List<List<Integer>> threesum(int[] arr){
        if (arr==null || arr.length<3) return new ArrayList<>();
        Arrays.sort(arr);
        Set<List<Integer>> result=new HashSet<>();
        for (int i = 0; i < arr.length-2; i++) {
            int left=i+1;
            int right=arr.length-1;
            while (left<right){
                int sum=arr[i] +arr[left]+arr[right];
                if (sum==0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
    public static boolean triplets(int[] arr,int n,int k){
        Arrays.sort(arr);
        for (int i = 0; i < n-2; i++) {
            int left=i+1;
            int right=n-1;
            while (left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if (sum==k){
                    return true;
                } else if (sum<3) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return false;
    }
}
