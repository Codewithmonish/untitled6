public class basictcs {
    public static void main(String[] args) {
        //Long n=5l;
        //System.out.println(opendoor(n));
        //int n=3;
        //int m=5;
        //int p1=nthprime(n);
        //int p2=nthprime(m);
        //int res=(p1*p2)-1;
        //System.out.println(res);
        int[] arr={2,3,4,5,6};
        evenodd(arr);


    }
    public static int opendoor (Long n){
        int count=0;
        for (int i = 1; i*i <=n ; i++) {
            count++;

        }
        return count;

    }
    public static int uniquepath(int m,int n){
        int[][] grid=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0){
                    grid[i][j]=1;
                }
                else {
                    grid[i][j]=grid[i][j-1] + grid[i-1][j];
                }
            }
        }
        return grid[m-1][n-1];
    }
    public static boolean prime(int num){
        if (num<2){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int nthprime(int k){
        int count=0;
        int num=1;
        while (count<k) {
            num++;
            if (prime(num)) {
                count++;
            }
        }
        return num;
    }
    public static void evenodd(int[] arr){
        int n=arr.length;
        int even=1;
        int odd=0;
        boolean hasev=false;
        for (int num:arr){
            if (num%2==0){
                even*=num;
                hasev=true;

            }
            else {
                odd-=num;

            }
            if (!hasev){
                even=0;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }

}