public class container {
    public static void main(String[] args) {
        int[] height={1,4,6,3,7,8};
        int left=0;
        int right=height.length-1;
        int max=-1;
        while (left<right){
            //int w=right-left;
            int h=Math.min(height[left],height[right]-(right-left) );
            max=Math.max(max,h);
            if (height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }

    }
}
