import java.util.Scanner;

public class delatax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if (international(s) || national(s) || notaml(s)){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }

    }
    public static boolean international(String s){
        if (s.length()!=15) return false;
        if (s.charAt(0)!='+' || s.charAt(1)!='9' || s.charAt(2)!='1') return false;
        if (s.charAt(3)!=' ') return false;
        for (int i = 4; i <=14 ; i++) {
            if (i==9){
                if (s.charAt(i)!=' ') return false;
            }
            else {
                if (!Character.isDigit(s.charAt(i))) return false;
            }

        }
        return true;

    }
    public static boolean national(String s){
        if (s.length()!=12) return false;
        if (s.charAt(0)!='0') return false;
        for (int i = 1; i <12 ; i++) {
            if (i==6){
                if (s.charAt(i)!=' ') return false;
            }
            else {
                if (!Character.isDigit(s.charAt(i))) return false;
            }

        }
        return true;

    }
    public static boolean notaml(String s){
        if (s.length()!=10) return false;
        for (int i = 0; i < 10; i++) {
            if (!Character.isDigit(s.charAt(i))) return false;

        }
        return true;
    }
}
