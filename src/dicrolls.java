public class dicrolls {
    public static void main(String[] args) {

        dice("",4);
    }
    static void dice(String arr, int target){
        if (target==0){
            System.out.println(arr);
            return ;
        }
        for (int i = 2; i <7 ; i++) {
            dice(arr+i,target-i);
        }




    }

}
