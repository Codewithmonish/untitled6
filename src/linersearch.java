public class linersearch {
    public static void main(String[] args) {
        int[] arr = {22, 123, 2345};
        System.out.println(findnumber(arr));
        System.out.println(digits(12345));

    }

    static int findnumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }

        }
        return count;
    }

    static boolean even(int nums) {
        int n = digits(nums);
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int nums) {
        int count = 0;
        while (nums > 0) {
            count++;
            int num = nums / 10;
        }
        return count;
    }
}





