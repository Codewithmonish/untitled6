public class rbs2 {
    public static void main(String[] args) {
        int[] nums={2,3,4,6,3,2,1};
        int target=6;
        System.out.println(pivot(nums));

    }

    public int search(int[] nums, int target) {
        int pivottt=pivot(nums);
        if (pivottt==-1){
           return bs(nums,target,0,nums.length-1);
        }
        if (nums[pivottt]==target){
            return target;
        }
        if (pivottt>=target){
            return bs(nums,target,0,pivottt-1);
        }
        return bs(nums,target,pivottt+1,nums.length-1);

    }
    static int bs(int[] nums,int target,int start,int end){
        //int start=0;
       // int end=nums.length-1;


        while (start <= end){
            int mid=start+(end-start)/2;
            if (target <nums[mid]){
                end=mid-1;
            } else if (target > nums[mid]) {
                start=mid+1;

            }else {
                return mid;
            }
        }
        return -1;
    }

    static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid>start && nums[mid] <nums[mid-1]){
                return mid;
            }
            if (mid<end && nums[mid]> nums[mid-1]){
                return mid-1;
            }
            if (nums[mid] <=start){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;

    }
}