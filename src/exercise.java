import java.util.Scanner;
import java.lang.String;
public class exercise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        if(s.endsWith(".org")){
            System.out.println("itis valid");
        }
        else if (s.endsWith(".com")) {
            System.out.println("it is valid");

        }

        else{
            System.out.println("not valid");
        }

    }
}
