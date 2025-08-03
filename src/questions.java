import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class questions {
    public static void main(String[] args) {
        int n=6;
        if (isprime(n)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


    }
    public static boolean isprime(int n){
        for (int i = 2; i <n ; i++) {
            if (n%i==0){
                return false;
            }

        }
        return true;
    }


}