import java.util.*;

public class tcs2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("array size");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("enter elem");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();



        }
        System.out.println("target");
        int target=sc.nextInt();
        //System.out.println("target");
        List<int[]> ans=findpairs(arr,target);
        for (int[] pairs:ans){
            System.out.println(Arrays.toString(pairs));

       }


    }
    public static List<int[]> findpairs(int[] num,int target){
        Set<Integer> seen=new HashSet<>();
        Set<String> used=new HashSet<>();   // avoid duplicates
        List<int[]> result=new ArrayList<>();
        for (int arr:num){
            int ans=target-arr;
            if (seen.contains(ans)){
                int a=Math.min(arr,ans);
                int b=Math.max(arr,ans);
                String key= a +":"+ b;
                if (!used.contains(key)){
                    result.add(new int[]{a,b});
                    used.add(key);
                }
            }
            seen.add(arr);

        }
        if (result.isEmpty()){
            result.add(new int[]{-1,-1});

        }
        return result;

    }
    public static int[] reaarranhe(int[] nums){
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                positive.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0){
                negative.add(nums[i]);
            }
        }
        int[] arr=new int[nums.length];
        int k=0;
        int c=0;
        while (c<positive.size()){
            arr[k]=positive.get(c);
            arr[k+1]=negative.get(c);
            k+=2;
            c++;
        }
        return arr;
    }

}
