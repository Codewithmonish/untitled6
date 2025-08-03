import java.util.ArrayList;
import java.util.List;

public class prime {
    public static void main(String[] args) {
        int l=10;
        int e=30;
        int n=28;
        String s="@#$gtu*123";
        System.out.println(remove(s));
        List<Integer> ans=factor(n);
        System.out.println(ans);
        List<Integer> p=range(l,e);
        System.out.println(p);

    }
    public static boolean isprime(int n){
        if (n<=1) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i==0) return false;

        }
        return true;
    }
    public static List<Integer> range(int l,int e){
        List<Integer> res=new ArrayList<>();
        for (int i = l; i <=e ; i++) {
            if (isprime(i)){
                res.add(i);
            }

        }
        return res;
    }
    public static List<Integer> factor(int n){

        List<Integer> res=new ArrayList<>();
        for (int i = 2; i <=n ; i++) {
            while (n%i==0 && isprime(i)){
                res.add(i);
                n/=i;
            }


        }
        return res;
    }
    public static String remove(String s){
        s=s.replaceAll("[^azAZ09]"," ");
        return s;
    }
}
