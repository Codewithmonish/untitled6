public class mininumarray {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int ans=search(arr);
        System.out.println(ans);

    }
    public static int search(int[] arr){
        int min=Integer.MAX_VALUE;
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[start]<=arr[mid]){
                min=Math.min(min,arr[start]);
                start=mid+1;

            }
            else {
                min=Math.min(min,arr[mid]);
                end=mid-1;
            }
        }
        return min;
    }
}
