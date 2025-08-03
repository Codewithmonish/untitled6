public class rec1 {
    public static void main(String[] args) {
        System.out.println(count(12030));


    }
   // static int sum=0;
   // static void rev(int n){
   //     if(n==0){
    //        return;
   //     }
    //    int rem=n%10;
    //    sum=sum*10+rem;
    //    rev(n/10);
   // }
    static int count(int n){
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if (n==0){
            return c;
        }
        int rem=n%10;
        if (rem==0){

            return helper(n/10,c+1);
        }
        return helper(n/10,c);

    }


}
