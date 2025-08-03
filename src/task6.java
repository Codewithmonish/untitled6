public class task6 {
    public static void main(String[] args) {
        int a[]={1,3,4,2,5,8,7,6};
        int k=3;
        int max = 0;
        int index=0;
        for (int i=1;i<=k;i++){
            max=a[0];
            for (int j=0;j<a.length;j++){
                if(max<a[j]){
                    max=a[j];
                    index=j;
                }
            }
            a[index]=Integer.MIN_VALUE;
        }
        System.out.println(max);
    }
}
