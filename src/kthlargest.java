public class kthlargest {
    public static void main(String[] args) {
        int n=6;
        int[] a={2,3,4,5,6};
        int sumn=(n*(n+1))/2;
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];

        }
        int val=sumn-sum;
        System.out.println(val);
    }
}
