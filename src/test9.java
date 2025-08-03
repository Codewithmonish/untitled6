public class test9 {
    public static void main(String[] args) {
        int[] arr={4,1,2,2,1};
        int ans=once(arr);
        System.out.println(ans);

    }
    public static int maximumsub(int[] arr){
        int max=0;
        int sum=0;
        for (int num:arr){
            sum+=num;
            if (sum>max){
                max=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        return sum;
    }
    public static int once(int[] arr){
        int res=0;
        for (int num:arr){
            res ^=num;
        }
        return res;
    }
}
