import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class nextpermutation {
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(3,2,1);


    }
}
class next{
    static List<Integer> ngp (List<Integer>a){
        int n=a.size();
        int ind=-1;
        for (int i=n-2;i>=0;i--){
            if (a.get(i)<a.get(i+1)){
                ind=i;
                break;
            }
        }
        if (ind==-1){
            Collections.reverse(a);
            return a;
        }
        for (int i=n-1;i>ind;i--){
            if (a.get(i)>a.get(ind)){
                int temp=a.get(i);
                a.set(i,a.get(ind));
                a.set(ind,temp);
                break;
            }
        }
        List<Integer> sub=a.subList(ind+1,n);
        Collections.reverse(sub);
        return a;
    }

}
