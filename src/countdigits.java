public class countdigits {
    public static void main(String[] args) {
        int num=523;
        System.out.println(add(num));

    }
    public static int add(int num){
       // if(num%9==0) return 9;
       // return num%9;
        int sum=0;
        while (num>0){
            int t=num%10;
            sum+=t;
            num=num/10;
        }
        return sum;
    }
}
