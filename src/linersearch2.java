public class linersearch2{
    public static void main(String[] args) {
        int[] arr={7,-1,-6,4,3,8};
        int sum=0;
        int ans=0;
        for (int i = 0; i < arr.length; i++)
            ans=Math.max(ans,arr[i]);
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i]+sum<0){
                    sum=0;
                    continue;
                }
                else{
                    sum+=arr[i];
                    ans=Math.max(sum,ans);
                }


            }
        System.out.println(ans);



    }


}