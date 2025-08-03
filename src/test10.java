public class test10 {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        boolean ans=arraysorted(arr);
        System.out.println(ans);

    }
    public static boolean arraysorted(int[] arr) {
        int len = arr.length;
        int dev = 0;
        for (int i = 0; i < len; i++) {
            if (i < len - 1 && arr[i] > arr[i + 1]) {
                dev++;
            }
            if (i == len - 1 && arr[len - 1] > arr[0]) {
                dev++;
            }
        }
        return (dev > 1) ? false : true;
    }

}
