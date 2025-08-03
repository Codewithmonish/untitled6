import java.util.ArrayList;

public class rec2 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5};
        int target=4;
        System.out.println(find(arr,target,0));
        System.out.println(findindex(arr,target,0));
        System.out.println(findindexlast(arr,target,arr.length-1));
        findindexlastdup(arr,target,0);
        System.out.println(lis);

    }
    static boolean find(int[] arr,int target,int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }
    static int findindex(int[] arr,int target,int index) {
        if (index == arr.length) {
            return -1;
        }
        if( arr[index] == target){
            return index;
        }
        return findindex(arr, target, index + 1);
    }
    static int findindexlast(int[] arr,int target,int index) {
        if (index == arr.length) {
            return -1;
        }
        if( arr[index] == target){
            return index;
        }
        return findindexlast(arr, target, index + 1);
    }
    static ArrayList<Integer> lis=new ArrayList<>();
    static void findindexlastdup(int[] arr,int target,int index) {
        if (index == arr.length) {
            return ;
        }
        if( arr[index] == target){
            lis.add(index);
        }
        findindexlastdup(arr, target, index + 1);
    }



}
