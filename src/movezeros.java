public class movezeros {
    public static void main(String[] args) {
        int[] arr={1,0,2,3};

        //int ans=zero(arr);
        //int ans=zero(arr);
        //System.out.println(ans);
        //System.out.println(z);


    }
    public  static void zero(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }


        }
        while (count<arr.length){
            arr[count++]=0;
        }


        //return count;

        //return arr;
    }


}
