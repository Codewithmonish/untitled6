public class oderagnostic {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5};
        int target=6;
        int ans=orderBS(arr,target);
        System.out.println(ans);

    }
    static int orderBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start <= end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            start=mid+1;
            boolean isacn=arr[start] <= arr[end];
            if (isacn){
               if (target <arr[mid]) {
                   end = mid -1;
               } else if (target>arr[mid]) {
                   start=mid+1;
               }

            }else {
                if (target >arr[mid]) {
                    end = mid -1;
                } else if (target<arr[mid]) {
                    start=mid+1;
                }

            }


            }
        return -1;

    }
}
