import java.util.Arrays;
import java.util.Stack;

public class nextgreaterelement {
    public static void main(String[] args) {
        int[] arr={4,12,5,3,1,2,5,3,1,2,4,6};
        int[] ans=nextgreater(arr);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] nextgreater(int[] arr){
        int[] result=new int[arr.length];
        Arrays.fill(result,-1);
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()]<arr[i]){
                result[st.pop()]=arr[i];
            }
            st.push(i);

        }
        return result;
    }
}
