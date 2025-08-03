public class task4 {
    public static void main(String[] args) {

        int a[] ={1, 2, 3, 2};
        int j=0;
        for (int i=1;i<a.length-1;i++){
            if (a[i] != a[i+1]){
                j++;
                a[j]=a[i+1];

            }
        }
        System.out.println(j);
        for (int i=0;i<j;i++){
            System.out.println(a[i]);
        }




    }
}
