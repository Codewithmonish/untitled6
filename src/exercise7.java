public class exercise7 {
    public static void main(String[] args) {
        int[] nums={0,0,1,2,3};
        int l=1;
        for (int r=0;r< nums.length;r++){
            if (nums[r]  != nums[r-1]){
                nums[l]=nums[r];
                l+=1;
            }
        }

    }
}
