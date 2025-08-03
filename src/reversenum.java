import java.util.Arrays;
import java.util.Collections;

public class reversenum {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4};

        rev(a);







    }
    static void rev(Integer[] a){
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
}

