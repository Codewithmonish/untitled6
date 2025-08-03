public class rotatearray {
    static int[]rotate(int[] matrix){
        int n=matrix.length;
        int rotated[]=new int[n];
        for (int i = 0; i < n; i++) {

                rotated[n-i-1]=matrix[i];



        }
        return rotated;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[]rotated=rotate(arr);
        for (int i = 0; i < rotated.length; i++) {

                System.out.println(rotated[i]+"");




        }
    }
}
