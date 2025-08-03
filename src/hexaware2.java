import java.util.Scanner;
import java.util.TreeSet;

public class hexaware2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int element=sc.nextInt();
        TreeSet<Integer> ts=new TreeSet<Integer>();
        for (int i = 0; i < element; i++) {
            ts.add(sc.nextInt());

        }
        sc.close();
        System.out.println(ts.size());
    }
}
