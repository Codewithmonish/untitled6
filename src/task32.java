public class task32 {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,-1,0,1,2};
        int target=1;
        int ans=search(nums,target);
        System.out.println(ans);
    }
    static int search(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target){
                return mid;
            }if (nums[mid]<=start){
                if (target>=start){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }else{
                if (target>=start){
                    start=mid+1;

                }else{
                    end=mid-1;
                }

            }

        }
        return -1;
    }


}
