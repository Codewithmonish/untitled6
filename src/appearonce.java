public class appearonce {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,5,5};
        System.out.println(search(nums));

    }
    public static int search(int[] nums){
        int res=0;
        for (int i:nums){
            res^=i;
        }
        return res;
    }
}
