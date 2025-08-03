public class task40 {
    public static void main(String[] args) {
        int[] a={1,2,4,5,6};
        int sum1=0;
        for (int i = 1; i <6 ; i++) {
            sum1=sum1+i;

        }
        int sum2=0;
        for (int e:a) {
            sum2=sum2+e;

        }
        System.out.println(sum2-sum1);
    }
}
