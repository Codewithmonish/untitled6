public class task1 {
    public static void main(String[] args) {
        int n=123;
        int temp;
        int arm=0;
        int org=n;
        while (n>0){
            temp=n%10;
            temp= (int) Math.pow(temp,3);
            arm=arm+temp;
            n=n/10;
        }
        if (arm==org){
            System.out.println("positive");
        }else {
            System.out.println("not");
        }
    }
}
