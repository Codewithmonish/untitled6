import java.util.*;
public class exercise3 {
    //static void reverse(Integer a[]) {
    //    Collections.reverse(Arrays.asList(a));
    //    System.out.println(Arrays.asList(a));
   // }
   // public static void main(String[] args){
    //    Integer[] a={1,2,3,4};
     //   reverse(a);
    //}
    static int  sum(int x,int y){
       int z;
      if(x>y){

          z=x+y;
        }
        else{
             z=x-y;
        }
        return z;


    }

    public static void main(String[] args) {
        int a=2;
        int b=7;
        int c;
        c=sum(a,b);
        System.out.println(c);
    }

    }
