public class pow {
    public static void main(String[] args) {
        double x=2.00000;
        long n=10;
        double ans= (int) pow(x,n);
        System.out.println(ans);



    }
    static double pow(double x,long n){
        if (n==0){
            return 1;
        }
        if (n%2==0){
            return pow(x*x,n/2);
        }
        else {
            return x*pow(x,n-1);
        }
    }
}
